package com.krtgames.pazarsepeti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Main2Activity extends AppCompatActivity {

    private List<Urun> Urunler  = new ArrayList<>();
    private Uruneris erisurun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final RecyclerView liste =  findViewById(R.id.liste);
        liste.setLayoutManager(new LinearLayoutManager(this));


        ApiInterface servis = ApiClient.getClient().create(ApiInterface.class);
        Call<ArrayList<Urun>> cagri = servis.UrunleriAl();
        cagri.enqueue(new Callback<ArrayList<Urun>>() {
            @Override
            public void onResponse(Call<ArrayList<Urun>> call, Response<ArrayList<Urun>> response) {
                Urunler =response.body();
                erisurun = new Uruneris(Urunler,R.layout.urunler,getApplicationContext());
                liste.setAdapter(erisurun);

            }

            @Override
            public void onFailure(Call<ArrayList<Urun>> call, Throwable t) {
                Log.i("Pazarsepetı","Pazar");
            }
        });
    }

}
