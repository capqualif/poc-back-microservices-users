package gouv.poc.capqualif.api.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CapqualifApiUsersApplication {
	//starter
	public static void main(String[] args) {
		SpringApplication.run(CapqualifApiUsersApplication.class, args);
	}

}
