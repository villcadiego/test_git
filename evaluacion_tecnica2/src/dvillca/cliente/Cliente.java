package dvillca.cliente;
import dvillca.dao.PedidosDAO;
import dvillca.model.Pedido;
import dvillca.util.DAOFactory;


/**
 * Esta checkeado por el administrador
 * Este es un comentario de aonaccess_mexico!
 * @author dvillca
 *
 *
 *ESto es argentina
 */
public class Cliente {

	public static void main(String[] args) {
		
		//TODO  
		Pedido pedido = new Pedido();
		
		// Creacion del Factory que se requiere
		DAOFactory factory_bbdd =  DAOFactory.getDAOFactory(DAOFactory.DATABASE);
		DAOFactory factory_cache =  DAOFactory.getDAOFactory(DAOFactory.DATABASE);
		 
		// Creo los DAO, ambos tiene la conexion correspondiente
		PedidosDAO pedidosDAO_bbdd = factory_bbdd.getPedidosDAO();
		PedidosDAO pedidosDAO_cache = factory_cache.getPedidosDAO();
		
		// no se si estaria bueno enviarle un objeto del Modelo, quizas podriamos utilzar un DTO / VO
		// pero es valido para este ejemplo.
		
		pedidosDAO_bbdd.insertOrUpdate(pedido);
		pedidosDAO_cache.insertOrUpdate(pedido);
		 
		// Se busca el objeto de tipo Pedido por ID, Memcached / BBDD
		Pedido ped_ddbb  = pedidosDAO_bbdd.select(pedido.getIdPedido());
		Pedido ped_cache = pedidosDAO_cache.select(pedido.getIdPedido());
		
		// modificacion 
		ped_ddbb.setNombrePedido("nombre_editado bbdd");
		ped_cache.setNombrePedido("nombre_editado cache");
		
		// update del objeto pedido
		pedidosDAO_bbdd.insertOrUpdate(ped_ddbb);
		pedidosDAO_cache.insertOrUpdate(ped_cache);
		 
		// delete de una instancia de Pedido
		pedidosDAO_bbdd.delete(ped_ddbb);
		pedidosDAO_cache.delete(ped_cache);
	}
}
