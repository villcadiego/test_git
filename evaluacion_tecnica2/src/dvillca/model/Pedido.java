package dvillca.model;

/**
 * @author dvillca
 */
public class Pedido implements java.io.Serializable{
	
	/**
	 * mod
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Se utilia nombrePedido para poder editar al menos un campo de mi objeto
	 */
	private String nombrePedido;
	private Integer idPedido;
	
	/**
	 * @return the nombrePedido
	 */
	public String getNombrePedido() {
		return nombrePedido;
	}
	/**
	 * @param nombrePedido the nombrePedido to set
	 */
	public void setNombrePedido(String nombrePedido) {
		this.nombrePedido = nombrePedido;
	}
	/**
	 * @return the idPedido
	 */
	public Integer getIdPedido() {
		return idPedido;
	}
	/**
	 * @param idPedido the idPedido to set
	 */
	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}
}
