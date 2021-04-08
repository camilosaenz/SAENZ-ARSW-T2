package edu.eci.arsw.saenz_arsw_t2.cache;

import java.util.HashMap;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * Interface IWeatherCache que permite obtener informacion del api externo.
 * @author Camilo
 */
@Service
public class WeatherCache implements IWeatherCache{
	
	HashMap<String, JSONObject> valores = new HashMap<String, JSONObject>();
	
	/**
	 * metodo save para almecenar los datos del api externo
	 * @param json JSONObject con datos de la ciudad.
	 * @param ciudad String con la ciudad a buscar.
	 */
	@Override
	public void save(JSONObject json, String ciudad) {
		valores.put(ciudad, json);
		
	}
	
	/**
	 * metodo verify para verificar que los datos ya esten almacenados.
	 * @param ciudad String de la ciudad a buscar.
	 * @return boolean que confirma si la ciudad esta o no.
	 */
	@Override
	public boolean verify(String ciudad) {
		return valores.containsKey(ciudad);
	}
	
	/**
	 * metodo response que retorna los datos de la ciudad.
	 * @param ciudad String con la ciudad a buscar.
	 * @return JSONObject con los datos de la ciudad.
	 */
	@Override
	public JSONObject response(String ciudad) {
		JSONObject json = valores.get(ciudad);
		return json;
	}

}
