package rest.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"rest"})
public class SprintBootMainApplication {
	public static void main(String[] args) {
		SpringApplication.run(SprintBootMainApplication.class, args);
	}
}
