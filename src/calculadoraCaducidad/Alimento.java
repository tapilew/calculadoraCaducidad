/**
 * 
 */
package calculadoraCaducidad;
import java.time.LocalDate;

/**
 * 
 */
public class Alimento extends Producto {
    private LocalDate fechaVencimiento;
    public Alimento(String nombre, double precioUnit, String marca, int cantidad, LocalDate fechaVencimiento) {
        super(nombre, precioUnit, marca, cantidad);
        this.fechaVencimiento = fechaVencimiento;
    }
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
}
