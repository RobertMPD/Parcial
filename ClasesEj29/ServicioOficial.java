package ClasesEj29;
import java.util.ArrayList;
import java.util.List;

public class ServicioOficial {
    public String nombre;
    public String direccion;
    public String NIF;
    public List<Vehiculo> vehiculosExhibidos = new ArrayList<>();

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculosExhibidos.add(vehiculo);
    }

    public List<Vehiculo> getVehiculosExhibidos() {
        return vehiculosExhibidos;
    }
}