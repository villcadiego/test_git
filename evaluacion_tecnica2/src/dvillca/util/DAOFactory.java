package dvillca.util;
import dvillca.dao.PedidosDAO;

/**
 * @author dvillca
 * 
 * DAOFactory es abstracto y proporciona un método estático para la creación de 
 * la instancia del Factory adecuado 
 *
 */
public abstract class DAOFactory {
	
	public static final int DATABASE = 1;
	public static final int CACHE    = 2;
	
	public abstract PedidosDAO getPedidosDAO();
	
	public static DAOFactory getDAOFactory( int whichFactory) {
		
		switch (whichFactory) {
			case DATABASE: 
				return new DatabaseDAOFactory();
			case CACHE: 
		    	return new CacheDAOFactory();
			default           : 
				return null;
	    }
	}
}
