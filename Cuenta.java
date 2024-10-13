public class Cuenta {

	private int saldo;
	private List<Pedido> pedidosCompras;
	private Carrito carrito;

	public double getSaldo() {
		// TODO - implement Cuenta.getSaldo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		// TODO - implement Cuenta.setSaldo
		throw new UnsupportedOperationException();
	}

	public List<Producto> getPedidosCompras() {
		// TODO - implement Cuenta.getPedidosCompras
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pedidosCompras
	 */
	public void setPedidosCompras(List<Producto> pedidosCompras) {
		// TODO - implement Cuenta.setPedidosCompras
		throw new UnsupportedOperationException();
	}

	public Carrito getCarrito() {
		return this.carrito;
	}

	/**
	 * 
	 * @param carrito
	 */
	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	/**
	 * 
	 * @param pedido
	 */
	public boolean agregarPedido(Pedido pedido) {
		// TODO - implement Cuenta.agregarPedido
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param carrito
	 */
	public boolean agregarCarrito(Carrito carrito) {
		// TODO - implement Cuenta.agregarCarrito
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pedido
	 * @param pago
	 */
	public boolean pagarPedido(Pedido pedido, Pago pago) {
		// TODO - implement Cuenta.pagarPedido
		throw new UnsupportedOperationException();
	}

	public int obtenerSaldo() {
		// TODO - implement Cuenta.obtenerSaldo
		throw new UnsupportedOperationException();
	}

}