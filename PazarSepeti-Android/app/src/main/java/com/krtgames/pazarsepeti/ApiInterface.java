package com.krtgames.pazarsepeti;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("all")
    Call<ArrayList<Urun>> UrunleriAl();
}
