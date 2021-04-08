package edu.eci.arsw.saenz_arsw_t2.services;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.arsw.saenz_arsw_t2.Api.ExternalAPI;
import edu.eci.arsw.saenz_arsw_t2.cache.WeatherCache;

/**
 * Clase WeatherServices para comunicar con las demas clases en el backend y usar el cache para almacenar datos.
 * @author Camilo
 */
@Service
public class WeatherServices implements IWeatherServices{
	
	@Autowired
	WeatherCache cache;
	@Autowired
	ExternalAPI api;
	
	/**
	 * Metodo weather.
	 * @param ciudad String con el nombre de la ciudad.
	 * @return JSONObject con datos de la ciudad.
	 */
	@Override
	public JSONObject weather(String ciudad) {
		JSONObject json = null;
		if(cache.verify(ciudad)) {
			json=cache.response(ciudad);
			return json;
		}else {
			json = api.weather(ciudad);
			cache.save(json, ciudad);
		}
		return json;
	}

}
