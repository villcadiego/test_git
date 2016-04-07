package dvillca.util;
import dvillca.dao.PedidosDAO;
import dvillca.dao.PedidosDatabaseDAOImpl;

/**
 * @author dvillca
 * 
 * DatabaseDAOFactory retorna sus propias implementaciones
 */
public class DatabaseDAOFactory extends DAOFactory {
	
	@Override
	public PedidosDAO getPedidosDAO() {
		 // PedidosDatabaseDAOImpl implements PedidosDAO
		return new PedidosDatabaseDAOImpl();
	}
}