package ClasesEj29;
import java.util.Date;
import java.util.List;

public class Venta {
    public Date fechaVenta; // Campo agregado
    public String matriculaNuevoVehiculo;
    public Cliente cliente;
    public Vendedor vendedor;
    public Vehiculo vehiculo;
    public List<Opcion> opcionesSeleccionadas;

    @Override
    public String toString() {
        return "Venta {" +
                "fechaVenta=" + fechaVenta +
                ", matriculaNuevoVehiculo='" + matriculaNuevoVehiculo + '\'' +
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                ", vehiculo=" + vehiculo +
                ", opcionesSeleccionadas=" + opcionesSeleccionadas +
                '}';
    }
}