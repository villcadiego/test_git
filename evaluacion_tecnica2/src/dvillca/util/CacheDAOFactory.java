package dvillca.util;

import dvillca.dao.PedidosCacheDAOImpl;
import dvillca.dao.PedidosDAO;

/**
 * @author dvillca
 * 
 * CacheDAOFactory retorna sus propias implementaciones
 */
public class CacheDAOFactory extends DAOFactory{

	@Override
	public PedidosDAO getPedidosDAO() {
		// podria retornar otro tipo de implementacion de la cache
		return new PedidosCacheDAOImpl();
	}
}
