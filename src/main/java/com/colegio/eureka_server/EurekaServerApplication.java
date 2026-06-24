package com.colegio.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// Habilita el servidor de descubrimiento Eureka para que los microservicios
// del proyecto (user-service, academy-service, records-service) puedan
// registrarse y el api-gateway pueda consultarlos en el futuro.
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
