package edu.eci.arsw.saenz_arsw_t2.Api;

import org.json.JSONObject;

/**
 * Esta es la Interfaz de conexion con la API Externa.
 * @author Camilo
 */
public interface IExternalAPI {
	
	/**
	 * Metodo para obtener el clima de la ciudad.
	 * @param ciudad String con el nombre de la ciudad a buscar.
	 * @return JSONObject con los datos del api externo.
	 */
	public JSONObject weather(String ciudad);
}
