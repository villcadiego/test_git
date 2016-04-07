package dvillca.dao;

import dvillca.model.Pedido;

/**
 * ssdasd
 * Se edita desde el administrador!
 * @author dvillca
 * Interface que me proporciona el Ejercicio
 */
public interface PedidosDAO {
	void insertOrUpdate(Pedido pedido);	// 	inserta un nuevo pedido en la base de datos o modifica un pedido existente (en cado de crear uno nuevo, el pedido pasado como parámetro se completa con el nuevo id).
	void delete(Pedido pedido);			// 	elimina el pedido que corresponde al id recibido.
	Pedido select(Integer idPedido); 	//	busca un pedido por id.
}
