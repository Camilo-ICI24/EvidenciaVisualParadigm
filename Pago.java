public class Pago {

	private String tipoDePago;
	private String informacionDePago;

	public String getTipoDePago() {
		return this.tipoDePago;
	}

	/**
	 * 
	 * @param tipoDePago
	 */
	public void setTipoDePago(String tipoDePago) {
		this.tipoDePago = tipoDePago;
	}

	public String getInformacionDePago() {
		return this.informacionDePago;
	}

	/**
	 * 
	 * @param informacionDePago
	 */
	public void setInformacionDePago(String informacionDePago) {
		this.informacionDePago = informacionDePago;
	}

	/**
	 * 
	 * @param precio
	 */
	public boolean pagarPedido(double precio) {
		// TODO - implement Pago.pagarPedido
		throw new UnsupportedOperationException();
	}

	public String obtenerInfoPago() {
		// TODO - implement Pago.obtenerInfoPago
		throw new UnsupportedOperationException();
	}

}