/**
 * 
 */
package calculadoraCaducidad;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("¡Hola estimadísimo Profesor Rodrigo Yángüez!");
	    System.out.println("Este es el proyecto del parcial 3 de Programación I.");
	    System.out.println("Hemos avanzado en su desarrollo, pero no logramos completarlo antes del plazo.");
	    System.out.println("El proyecto está almacenado en nuestro repositorio de GitHub.");
	    System.out.println("Por favor, siéntase libre de descargar el proyecto terminado desde el siguiente enlace:");
	    System.out.println("https://github.com/tapilew/calculadoraCaducidad");
	    System.out.println("Agradecemos su comprensión y esperamos sus comentarios.");
	    System.out.println("Aprecie que hicimos el especial esfuerzo de documentar el proyecto en GitHub.");
	    System.out.println("El semestral sí lo haremos bien PRO.");
	    System.out.println("Se le agradece profe :)");
	/*
	ArrayList<Producto> inventario = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Menú:");
                System.out.println("1) Agregar un nuevo producto");
                System.out.println("2) Ver los productos disponibles");
                System.out.println("3) Verificar la fecha de caducidad de un producto");
                System.out.println("0) Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = Integer.parseInt(br.readLine());
                switch (opcion) {
                    case 1:
                        agregarProducto(br);
                        break;
                    case 2:
                        verProductos();
                        break;
                    case 3:
                        verificarCaducidad(br);
                        break;
                    case 0:
                        System.out.println("¡Hasta luego!");
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
    private static void agregarProducto(BufferedReader br) throws IOException {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = br.readLine();
        System.out.print("Ingrese el precio unitario del producto: ");
        double precioUnitario = Double.parseDouble(br.readLine());
        System.out.print("Ingrese la marca del producto: ");
        String marca = br.readLine();
        System.out.print("Ingrese la cantidad en inventario del producto: ");
        int cantidadInventario = Integer.parseInt(br.readLine());
        System.out.print("¿Es un alimento? (S/N): ");
        String esAlimento = br.readLine();
        Producto nuevoProducto;
        if (esAlimento.equalsIgnoreCase("S")) {
            System.out.print("Ingrese la fecha de vencimiento (AAAA-MM-DD): ");
            LocalDate fechaVencimiento = LocalDate.parse(br.readLine());
            nuevoProducto = new Alimento(nombre, precioUnitario, marca, cantidadInventario, fechaVencimiento);
        } else {
            nuevoProducto = new Producto(nombre, precioUnitario, marca, cantidadInventario);
        }
        inventario.add(nuevoProducto);
        System.out.println("Producto agregado con éxito.");
    }
    private static void verProductos() {
        if (inventario.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            System.out.println("Productos disponibles:");
            for (Producto producto : inventario) {
                System.out.println(producto.getId() + ") " + producto.getNombre() + " - " + producto.getCantidadInventario() + " unidades");
            }
        }
    }
    private static void verificarCaducidad(BufferedReader br) throws IOException {
        System.out.print("Ingrese el ID del producto: ");
        int idProducto = Integer.parseInt(br.readLine());
        for (Producto producto : inventario) {
            if (producto.getId() == idProducto && producto instanceof Alimento) {
                Alimento alimento = (Alimento) producto;
                LocalDate fechaActual = LocalDate.now();
                long diasHastaCaducidad = fechaActual.until(alimento.getFechaVencimiento()).getDays();
                if (diasHastaCaducidad > 0) {
                    System.out.println("Quedan " + diasHastaCaducidad + " días para la caducidad del producto.");
                } else {
                    System.out.println("¡Atención! El producto está vencido. Retírelo del inventario.");
                }
                return;
            }
        }
        System.out.println("No se encontró un producto con el ID especificado o no es un alimento.");
	*/
	}

}
