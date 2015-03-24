package io.github.atimothee.rocketsolution;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import java.util.ArrayList;
import java.util.List;

import io.github.atimothee.rocketsolution.data.Fetch;
import io.github.atimothee.rocketsolution.data.Response;
import io.github.atimothee.rocketsolution.provider.RocketProvider;
import io.github.atimothee.rocketsolution.provider.product.ProductColumns;
import retrofit.RestAdapter;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new FetchTask().execute();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ProductsFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }


    }

    class FetchTask extends AsyncTask<String, Void, Response>{


        @Override
        protected Response doInBackground(String... params) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("https://zalora.com.my")
                    .build();

            Fetch.ZaloraService service = restAdapter.create(Fetch.ZaloraService.class);
            Response results = service.listRepos();
            ContentValues values;
            List<ContentValues> valuesList = new ArrayList<>();
            for(Response.Result r: results.getMetadata().getResults()){
               values = new ContentValues();
                values.put(ProductColumns.NAME, r.getData().getName());
                values.put(ProductColumns.PRICE, r.getData().getPrice());
                values.put(ProductColumns.BRAND, r.getData().getBrand());
                values.put(ProductColumns.IMAGE, r.getImages().get(0).getPath());
                valuesList.add(values);
            }
            RocketProvider provider = new RocketProvider();
            provider.bulkInsert(ProductColumns.CONTENT_URI, valuesList.toArray(new ContentValues[valuesList.size()]));

            return results;
        }
    }
}
