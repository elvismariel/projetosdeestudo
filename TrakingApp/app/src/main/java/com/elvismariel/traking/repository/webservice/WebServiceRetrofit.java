package com.elvismariel.traking.repository.webservice;

import com.elvismariel.traking.model.PhoneLocation;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WebServiceRetrofit {
    String BASE_URL = "http://localhost:55151/";
    String FEED = "api/PhoneLocation/Create";

    Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

    @GET(FEED)
    Call sendLocation(@Query("PhoneLocation") PhoneLocation phoneLocation );
}
