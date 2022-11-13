package br.edu.infnet.appsoccermanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppSoccerManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppSoccerManagerApplication.class, args);
	}

}
