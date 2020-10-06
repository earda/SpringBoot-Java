package com.krtgames.pazarsepeti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Uruneris extends RecyclerView.Adapter<Uruneris.Urunyeri> {

    private List<Urun> urunler;
    private int siralayout;
    private Context context;


    public static class Urunyeri extends RecyclerView.ViewHolder {
        TextView urunId,urunAd,title;
        //ImageView urunfoto;
        public Urunyeri(View v) {
            super(v);

            //urunfoto = (ImageView) v.findViewById(R.id.urunfoto);
            urunId = (TextView) v.findViewById(R.id.urunId);
            urunAd = (TextView) v.findViewById(R.id.urunAd);
            title = (TextView) v.findViewById(R.id.title);

        }
    }
    public Uruneris (List<Urun> urunler , int siralayout,Context context){
        this.urunler=urunler;
        this.siralayout = siralayout;
        this.context = context;
    }


    @Override
    public Urunyeri onCreateViewHolder( ViewGroup v, int viewType) {

        View view = LayoutInflater.from(v.getContext()).inflate(siralayout,v,false);

        return new Urunyeri(view);
    }

    @Override
    public void onBindViewHolder(Urunyeri tutucu, int sira) {

        tutucu.urunId.setText(urunler.get(sira).urunId.toString());
        tutucu.urunAd.setText(urunler.get(sira).urunAd);
        tutucu.title.setText(urunler.get(sira).title);


       // tutucu.urunfoto.I(urunler.get(sira).urunfoto);
    }

    @Override
    public int getItemCount() {
        return urunler.size();
    }



}
