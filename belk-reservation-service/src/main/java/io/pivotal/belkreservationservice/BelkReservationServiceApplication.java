package io.pivotal.belkreservationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication( exclude= { SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class })
public class BelkReservationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelkReservationServiceApplication.class, args);
	}

}

