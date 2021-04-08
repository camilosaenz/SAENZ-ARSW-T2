package edu.eci.arsw.saenz_arsw_t2.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.saenz_arsw_t2.services.WeatherServices;

/**
 * Clase WeatherController que permite comunicar con el Front mediante un apirest local dependiendo de la ciudad que se desee buscar, y se comunica con el services para cominucar con las demas clases
 * @author Camilo
 */
@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.GET})
@RequestMapping("/clima")
public class WeatherController {
	
	@Autowired
	WeatherServices weatherServices;
	
	/**
	 * metodo weather que realiza el reccorrido con las demas clases.
	 * @param ciudad String con el nombre de la ciudad.
	 * @return String con la informacion de la ciudad en el api como un JSONObject.
	 */
	@GetMapping("/ciudad/{ciudad}")
	public String weather(@PathVariable ("ciudad") String ciudad) {
		JSONObject json = weatherServices.weather(ciudad);
		String text=json.toString();
		return text;
	}
	
}
