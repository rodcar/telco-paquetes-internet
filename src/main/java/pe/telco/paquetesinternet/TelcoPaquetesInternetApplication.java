package pe.telco.paquetesinternet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TelcoPaquetesInternetApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelcoPaquetesInternetApplication.class, args);
	}

}
