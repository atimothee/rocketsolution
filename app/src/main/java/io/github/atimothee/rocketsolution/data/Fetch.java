package io.github.atimothee.rocketsolution.data;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Timo on 3/24/15.
 */
public class Fetch {
    public interface ZaloraService {
        @GET("/mobile-api/women/clothing")
        Response listRepos();
    }
}
