/**
 * 
 */
package calculadoraCaducidad;

/**
 * 
 */
public class Producto {
	private static int contadorId = 1;
	private int id;
	private String nombre;
	private double precioUnit;
	private String marca;
	private int cantidad;
	
		public Producto(String nombre, double precioUnit, String marca, int cantidad) {
			this.id = contadorId++;
	        this.nombre = nombre;
	        this.precioUnit = precioUnit;
	        this.marca = marca;
	        this.cantidad = cantidad;
	    }
	
		public int getId() {
	        return id;
	    }
	    public String getNombre() {
	        return nombre;
	    }
	    public double getPrecioUnitario() {
	        return precioUnit;
	    }
	    public String getMarca() {
	        return marca;
	    }
	    public int getCantidadInventario() {
	        return cantidad;
	    }
}
