package edu.eci.arsw.saenz_arsw_t2.services;

import org.json.JSONObject;

/**
 * Interfaz Services
 * @author Camilo
 */
public interface IWeatherServices {
	
	/**
	 * Metodo weather.
	 * @param ciudad String con el nombre de la ciudad.
	 * @return JSONObject con datos de la ciudad.
	 */
	public JSONObject weather(String ciudad);
}
