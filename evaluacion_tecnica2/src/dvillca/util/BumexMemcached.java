package dvillca.util;
/**
 * @author dvillca
 * 
 * Esta logica me la proporciona la API
 */
public class BumexMemcached {
	
	private static BumexMemcached instance = null;

	public static BumexMemcached getInstance() {
		if(instance == null) {
			instance = new BumexMemcached();
		}
		return instance;
	}
	public void set(String key, Object value){
		//implementacion
	}
	
	public Object get(String key){
		//implementacion
		return null;
	}
	
	public void delete(String key){
		//implementacion
	}
}