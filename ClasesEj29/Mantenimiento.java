package ClasesEj29;
import java.util.Date;

public class Mantenimiento {
    public Date fecha;
    public String descripcion;
    public float costo;

    
    public String toString() {
        return "Mantenimiento {" +
                "fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                ", costo=" + costo +
                '}';
    }
}