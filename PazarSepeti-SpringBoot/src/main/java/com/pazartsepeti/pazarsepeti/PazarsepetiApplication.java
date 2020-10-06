package com.pazartsepeti.pazarsepeti;


import com.pazartsepeti.pazarsepeti.model.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@EnableJpaRepositories(basePackages = "com.pazartsepeti.pazartsepeti.repository")
@ComponentScan(basePackages = "com.pazartsepeti.pazartsepeti")
@RestController
@SpringBootApplication
public class PazarsepetiApplication {


	public static void main(String[] args) {
		SpringApplication.run(PazarsepetiApplication.class, args);
	}

	@RequestMapping("/pazarsepeti/all")
	public List<Users> getUsers() {
		List<Users> urunler = new ArrayList<>();

		Users a1= new Users();
		a1.setUrunId(1);
		a1.setUrunAd("Ekmek");
		a1.setTitle("Tandır");

		Users a2 = new Users();
		a2.setUrunId(2);
		a2.setUrunAd("Peynir");
		a2.setTitle("Tulum");


		Users a3 = new Users();
		a3.setUrunId(3);
		a3.setUrunAd("Peynir");
		a3.setTitle("Tulum");

		Users a4 = new Users();
		a4.setUrunId(4);
		a4.setUrunAd("Ekmek");
		a4.setTitle("Tandır");

		Users a5 = new Users();
		a5.setUrunId(5);
		a5.setUrunAd("Ekmek");
		a5.setTitle("Tandır");

		Users a6 = new Users();
		a6.setUrunId(6);
		a6.setUrunAd("Peynir");
		a6.setTitle("Tulum");

		urunler.add(a1);
		urunler.add(a2);
		urunler.add(a3);
		urunler.add(a4);
		urunler.add(a5);
		urunler.add(a6);

		return urunler;
	}


}
