package com.pazartsepeti.pazarsepeti.model;
import javax.persistence.*;

@Entity
@Table(name = "urunler")
public class Users {


    @Id
    @Column(name = "urunId")
    private Integer urunId;
    @Column(name = "urunAd")
    private String urunAd;
    @Column(name = "title")
    private String title;


    public Users(Integer urunId,String urunAd, String title){
        this.urunId=urunId;
        this.urunAd=urunAd;
        this.title=title;
    }

    public Users() {

    }


    public Integer getUrunId() {
        return urunId;
    }

    public void setUrunId(Integer urunId) {
        this.urunId = urunId;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
