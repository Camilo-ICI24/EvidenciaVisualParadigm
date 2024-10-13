public class Pedido {

	private EstadoPedido estadoPedido;
	private List<Producto> productosDelPedido;

	public EstadoPedido getEstadoPedido() {
		return this.estadoPedido;
	}

	/**
	 * 
	 * @param estadoPedido
	 */
	public void setEstadoPedido(EstadoPedido estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public List<Producto> getProductosDelPedido() {
		return this.productosDelPedido;
	}

	/**
	 * 
	 * @param productosDelPedido
	 */
	public void setProductosDelPedido(List<Producto> productosDelPedido) {
		this.productosDelPedido = productosDelPedido;
	}

	/**
	 * 
	 * @param producto
	 */
	public boolean agregarProductoAlPedido(Producto producto) {
		// TODO - implement Pedido.agregarProductoAlPedido
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param producto
	 */
	public boolean eliminarDelPedido(Producto producto) {
		// TODO - implement Pedido.eliminarDelPedido
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param estadoPedido
	 */
	public boolean cambiarEstadoPedido(EstadoPedido estadoPedido) {
		// TODO - implement Pedido.cambiarEstadoPedido
		throw new UnsupportedOperationException();
	}

	public estadoPedido obtenerEstadoPedido() {
		// TODO - implement Pedido.obtenerEstadoPedido
		throw new UnsupportedOperationException();
	}

	public int totalProductosPedido() {
		// TODO - implement Pedido.totalProductosPedido
		throw new UnsupportedOperationException();
	}

}