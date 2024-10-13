public class FamiliaProductos {

	private String nombreFamilia;
	private List<Producto> productosFamilia;

	public String getNombreFamilia() {
		return this.nombreFamilia;
	}

	/**
	 * 
	 * @param nombreFamilia
	 */
	public void setNombreFamilia(String nombreFamilia) {
		this.nombreFamilia = nombreFamilia;
	}

	public List<Producto> getProductosFamilia() {
		return this.productosFamilia;
	}

	/**
	 * 
	 * @param productosFamilia
	 */
	public void setProductosFamilia(List<Producto> productosFamilia) {
		this.productosFamilia = productosFamilia;
	}

	/**
	 * 
	 * @param producto
	 */
	public boolean agregarProductoAFamilia(Producto producto) {
		// TODO - implement FamiliaProductos.agregarProductoAFamilia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param producto
	 */
	public boolean eliminarProductoDeFamilia(Producto producto) {
		// TODO - implement FamiliaProductos.eliminarProductoDeFamilia
		throw new UnsupportedOperationException();
	}

	public List<Producto> verFamilia() {
		// TODO - implement FamiliaProductos.verFamilia
		throw new UnsupportedOperationException();
	}

}