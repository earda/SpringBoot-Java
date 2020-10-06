package com.krtgames.pazarsepeti;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Urun {

        @SerializedName("urunId")
        @Expose
        public Integer urunId;
        @SerializedName("urunAd")
        @Expose
        public String urunAd;
        @SerializedName("title")
        @Expose
        public String title;

}
