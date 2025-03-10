package ClasesEj29;
import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    public String nombre;
    public String direccion;
    public String NIF;
    public List<Vendedor> vendedores = new ArrayList<>();

    public void agregarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }
}