package dvillca.dao;
import dvillca.model.Pedido;

/**
 * @author dvillca
 * Deberiamos implementar los accesos a la BBDD
 * PedidosDatabaseDAOImpl implementa PedidosDAO y es creada por su respectivo Factory (DatabaseDAOFactory)
 */
public class PedidosDatabaseDAOImpl implements PedidosDAO{

	/* (non-Javadoc)
	 * @see dvillca.dao.PedidosDAO#insertOrUpdate(dvillca.model.Pedido)
	 * inserta un nuevo pedido en la base de datos o modifica un pedido existente 
	 * (en cado de crear uno nuevo, el pedido pasado como parámetro se completa con el 
	 * nuevo id).
	 */
	@Override
	public void insertOrUpdate(Pedido pedido) {
		/*... codigo que hace el insert/update haciendo uso de una BBDD ...*/
	}

	/* (non-Javadoc)
	 * @see dvillca.dao.PedidosDAO#delete(dvillca.model.Pedido)
	 * elimina el pedido que corresponde al id recibido.
	 */
	@Override
	public void delete(Pedido pedido) {
		/*... BBDD*/
	}

	/* (non-Javadoc)
	 * @see dvillca.dao.PedidosDAO#select(java.lang.Integer)
	 * busca un pedido por id.
	 */
	@Override
	public Pedido select(Integer idPedido) {
		/*... BBDD*/
		return null;
	}
}
