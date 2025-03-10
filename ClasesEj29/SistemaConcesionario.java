package ClasesEj29;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SistemaConcesionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mensaje de bienvenida
        System.out.println("¡Bienvenido a la Concesionaria de Automoviles!");
        System.out.println("Por favor, registrese para continuar.");

        // Registro del cliente
        Cliente cliente = new Cliente();
        System.out.print("Ingrese su nombre: ");
        cliente.nombre = scanner.nextLine();
        System.out.print("Ingrese su DNI: ");
        cliente.dni = scanner.nextLine();
        System.out.print("Ingrese su direccion: ");
        cliente.direccion = scanner.nextLine();
        System.out.print("Ingrese su telefono: ");
        cliente.telefono = scanner.nextLine();

        System.out.println("\n¡Registro exitoso, " + cliente.nombre + "!\n");

        // crear un concesionario
        Concesionario concesionario = new Concesionario();
        concesionario.nombre = "Concesionario XYZ";
        concesionario.direccion = "Calle Principal 123";
        concesionario.NIF = "B12345678";

        // agregar vendedores al concesionario
        Vendedor vendedor1 = new Vendedor();
        vendedor1.nombre = "Jose Joaquin";
        vendedor1.dni = "1043653452";
        vendedor1.direccion = "Ternera";
        vendedor1.telefono = "3135543478";
        concesionario.agregarVendedor(vendedor1);

        // catalogo de vehiculos disponibles
        List<Vehiculo> vehiculos = new ArrayList<>();
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "Toyota";
        vehiculo1.modelo = "Prado 2024";
        vehiculo1.cilindrada = "6.8L";
        vehiculo1.precio = 120000.0f;
        vehiculos.add(vehiculo1);

        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.marca = "Chevrolet";
        vehiculo2.modelo = "Camaro 2024";
        vehiculo2.cilindrada = "30.0L";
        vehiculo2.precio = 300000.0f;
        vehiculos.add(vehiculo2);

        System.out.println("Catalogo de vehiculos disponibles:");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println((i + 1) + ". " + vehiculos.get(i));
        }

        // seleccion del vehiculo
        System.out.print("Seleccione el número del vehiculo que desea comprar (1 o 2): ");
        int seleccionVehiculo = scanner.nextInt();
        scanner.nextLine();

        Vehiculo vehiculoSeleccionado = vehiculos.get(seleccionVehiculo - 1);
        System.out.println("\nHa seleccionado el vehiculo: " + vehiculoSeleccionado);

        // opciones adicionales
        List<Opcion> opciones = new ArrayList<>();
        Opcion opcion1 = new Opcion();
        opcion1.nombre = "Oxido Nitroso";
        opcion1.descripcion = "Incluye Oxido Nitroso";
        opcion1.precio = 100000.0f;
        opciones.add(opcion1);

        Opcion opcion2 = new Opcion();
        opcion2.nombre = "Suspension Hidraulica";
        opcion2.descripcion = "Suspension hidraulica de alta gama";
        opcion2.precio = 50000.0f;
        opciones.add(opcion2);

        System.out.println("\nOpciones adicionales disponibles:");
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i + 1) + ". " + opciones.get(i).nombre + " - $" + opciones.get(i).precio);
        }
        System.out.println("3. No deseo opciones adicionales");

        System.out.print("Seleccione una opción (1, 2 o 3): ");
        int seleccionOpcion = scanner.nextInt();
        scanner.nextLine();

        List<Opcion> opcionesSeleccionadas = new ArrayList<>();
        if (seleccionOpcion != 3) {
            opcionesSeleccionadas.add(opciones.get(seleccionOpcion - 1));
        }

        // resumen de la venta
        Venta venta = new Venta();
        venta.fechaVenta = new Date(); // fecha actual
        venta.matriculaNuevoVehiculo = "XYZ789"; // matricula generada
        venta.cliente = cliente;
        venta.vendedor = vendedor1; // vendedor asignado
        venta.vehiculo = vehiculoSeleccionado;
        venta.opcionesSeleccionadas = opcionesSeleccionadas;

        // formatear la fecha
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaFormateada = formatoFecha.format(venta.fechaVenta);

        System.out.println("\n¡Gracias por su compra! Aqui está el resumen de su venta:");
        System.out.println("Venta {");
        System.out.println("    fechaVenta=" + fechaFormateada + ",");
        System.out.println("    matriculaNuevoVehiculo='" + venta.matriculaNuevoVehiculo + "',");
        System.out.println("    cliente=" + venta.cliente + ",");
        System.out.println("    vendedor=" + venta.vendedor + ",");
        System.out.println("    vehiculo=" + venta.vehiculo + ",");
        System.out.println("    opcionesSeleccionadas=" + venta.opcionesSeleccionadas);
        System.out.println("}");
    }
}
