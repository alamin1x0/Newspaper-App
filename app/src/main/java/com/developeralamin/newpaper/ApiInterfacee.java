package com.developeralamin.newpaper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterfacee {

//    public static String BASE_URL="https://newsapi.org/v2/";
    String BASE_URL="https://newsapi.org/v2/";

    @GET("top-headlines")
    abstract Call<MainNews> getNews(
            @Query("country") String country,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey
    );


    @GET("top-headlines")
    abstract Call<MainNews> getCategoryNews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey
    );
}
