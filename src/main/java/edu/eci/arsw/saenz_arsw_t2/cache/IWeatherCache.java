package edu.eci.arsw.saenz_arsw_t2.cache;

import org.json.JSONObject;

/**
 * Interface IWeatherCache que permite obtener informacion del api externo.
 * @author Camilo
 */
public interface IWeatherCache {
	
	/**
	 * metodo save para almecenar los datos del api externo
	 * @param json JSONObject con datos de la ciudad.
	 * @param ciudad String con la ciudad a buscar.
	 */
	public void save(JSONObject json, String ciudad);
	
	/**
	 * metodo verify para verificar que los datos ya esten almacenados.
	 * @param ciudad String de la ciudad a buscar.
	 * @return boolean que confirma si la ciudad esta o no.
	 */
	public boolean verify(String ciudad);
	
	/**
	 * metodo response que retorna los datos de la ciudad.
	 * @param ciudad String con la ciudad a buscar.
	 * @return JSONObject con los datos de la ciudad.
	 */
	public JSONObject response(String ciudad);
}
