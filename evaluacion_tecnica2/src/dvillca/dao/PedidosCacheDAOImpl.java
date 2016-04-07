package dvillca.dao;

import dvillca.model.Pedido;
import dvillca.util.BumexMemcached;

/**
 * @author dvillca
 * Consume BumexMemcached
 * PedidosCacheDAOImpl implementa PedidosDAO y es creada por su respectivo Factory (CacheDAOFactory)
 */
public class PedidosCacheDAOImpl implements PedidosDAO{

	/* (non-Javadoc)
	 * @see dvillca.dao.PedidosDAO#insertOrUpdate(dvillca.model.Pedido)
	 * inserta un nuevo pedido en la base de datos o modifica un pedido existente 
	 * (en cado de crear uno nuevo, el pedido pasado como parámetro se completa con el 
	 * nuevo id).
	 */
	@Override
	public void insertOrUpdate(Pedido pedido) {
		/*...*/
		BumexMemcached.getInstance().set(pedido.getIdPedido().toString(), pedido);
	}

	/* (non-Javadoc)
	 * @see dvillca.dao.PedidosDAO#delete(dvillca.model.Pedido)
	 * elimina el pedido que corresponde al id recibido.
	 */
	@Override
	public void delete(Pedido pedido) {
		/*...*/
		BumexMemcached.getInstance().delete(pedido.getIdPedido().toString());
	}

	/* (non-Javadoc)
	 * @see dvillca.dao.PedidosDAO#select(java.lang.Integer)
	 * busca un pedido por id.
	 */
	@Override
	public Pedido select(Integer idPedido) {
		/*...*/
		return (Pedido)BumexMemcached.getInstance().get(idPedido.toString());
	}
	
}
