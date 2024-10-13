// This is layer 6: Presentation Layer
package com.fintrack.FinTrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FinTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinTrackApplication.class, args);
	}

}
