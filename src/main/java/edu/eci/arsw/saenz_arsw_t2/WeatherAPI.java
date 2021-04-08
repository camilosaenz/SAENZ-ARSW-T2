package edu.eci.arsw.saenz_arsw_t2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase Weather prinsipal se encarga de correr el servicio mediante SpringBoot.
 * @author Camilo
 */
@SpringBootApplication
public class WeatherAPI {

	public static void main(String[] args) {
		SpringApplication.run(WeatherAPI.class, args);
	}

}
