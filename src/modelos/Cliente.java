package modelos;

public class Cliente {
    private String nombre;
    private String email;
    private String telefono;
    private int edad;
    private double dinero_gastado;
    private int productos_comprados;

    public Cliente(String nombre, String email, String telefono, int edad, double dinero_gastado, int productos_comprados) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
        this.dinero_gastado = dinero_gastado;
        this.productos_comprados = productos_comprados;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero_gastado() {
        return dinero_gastado;
    }

    public void setDinero_gastado(double dinero_gastado) {
        this.dinero_gastado = dinero_gastado;
    }

    public int getProductos_comprados() {
        return productos_comprados;
    }

    public void setProductos_comprados(int productos_comprados) {
        this.productos_comprados = productos_comprados;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                ", dinero_gastado=" + dinero_gastado +
                ", productos_comprados=" + productos_comprados +
                '}';
    }
}
