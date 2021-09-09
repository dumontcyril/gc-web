package fr.orsys.msa.gc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GcWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcWebApplication.class, args);
	}

}
