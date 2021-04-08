package edu.eci.arsw.saenz_arsw_t2.Api;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Clase IExternalAPI que comunica con el api externo, en este caso openweather y mediante la conexion y la key de acceso permite obetener los datos del api.
 * @author Camilo
 */
@Service
public class ExternalAPI implements IExternalAPI{
	
	/**
	 * Metodo para obtener el clima de la ciudad.
	 * @param ciudad String con el nombre de la ciudad a buscar.
	 * @return JSONObject con los datos del api externo.
	 */
	@Override
	public JSONObject weather(String ciudad) {
		HttpResponse<String> response= null;
		try {
			response = Unirest.get("https://api.openweathermap.org/data/2.5/weather?q="+ ciudad +"&appid=3918e2a8de7820f67a0e512c0eab71df").asString();
			return new JSONObject(response.getBody());
		} catch (UnirestException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
