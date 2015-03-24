package io.github.atimothee.rocketsolution;

import android.app.Activity;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import io.github.atimothee.rocketsolution.provider.product.ProductColumns;
import android.support.v4.app.Fragment;


public class ProductsFragment extends Fragment implements LoaderManager.LoaderCallbacks {
    private SimpleCursorAdapter adapter;
    private final String[] COLUMNS = {ProductColumns.NAME, ProductColumns.PRICE, ProductColumns.BRAND, ProductColumns.IMAGE};
    private final int[] VIEW_IDS = {R.id.product_name, R.id.price, R.id.brand, R.id.product_image};


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getLoaderManager().initLoader(0, null, this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container);
        ListView listView = (ListView)rootView.findViewById(R.id.list_view);
        adapter = new android.support.v4.widget.SimpleCursorAdapter(getActivity(),R.layout.list_item, null,COLUMNS, VIEW_IDS, 0);
        adapter.setViewBinder(new SimpleCursorAdapter.ViewBinder() {
            @Override
            public boolean setViewValue(View view, Cursor cursor, int columnIndex) {
                if(view.getId() == R.id.product_image){

                }
                return false;
            }
        });
        listView.setAdapter(adapter);
        return rootView;
    }

    @Override
    public android.support.v4.content.Loader onCreateLoader(int id, Bundle args) {
        return new CursorLoader(getActivity(), ProductColumns.CONTENT_URI, null, null, null, null);
    }

    @Override
    public void onLoadFinished(android.support.v4.content.Loader loader, Object data) {
    adapter.swapCursor((Cursor)data);
    }

    @Override
    public void onLoaderReset(android.support.v4.content.Loader loader) {

    }


}
