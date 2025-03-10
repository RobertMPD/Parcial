package ClasesEj29;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    public String marca;
    public String modelo;
    public String cilindrada;
    public float precio;
    public List<Mantenimiento> mantenimientos = new ArrayList<>();

    public void agregarMantenimiento(Mantenimiento mantenimiento) {
        mantenimientos.add(mantenimiento);
    }

    @Override
    public String toString() {
        return "Vehiculo {" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindrada='" + cilindrada + '\'' +
                ", precio=" + precio +
                '}';
    }
}