package ClasesEj29;
public class Cliente {
    public String nombre;
    public String dni;
    public String direccion;
    public String telefono;
    
    public String toString() {
        return "Cliente {" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}