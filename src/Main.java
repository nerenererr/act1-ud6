import dao.ClienteDAO;
import modelos.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        ClienteDAO cdao = new ClienteDAO();

        Cliente cliente = new Cliente("Nuria Roca", "nuria@example.com", "600777456", 21, 222.22, 3);
        //cdao.insertarCliente(cliente);
        //System.out.println("Cliente insertado");

        //cliente.setEmail("nuriar@example.com");
        //cdao.actualizarCliente(cliente, 11);
        //System.out.println("Datos actualizados");

        //cdao.eliminarCliente(11);
        //System.out.println("Cliente eliminado");


        System.out.println("");
        System.out.println(cdao.obtenerClientePorId(7));

        System.out.println("Lista de clientes: ");
        System.out.println(cdao.obtenerClientes());

        System.out.println("Lista de clientes mayores de 30 años:");


        System.out.println("Lista de clientes con un gasto mayor a 500€");

        System.out.println("Lista de clientes ordenados por dinero gastado de mayor a menor");

        System.out.println("Lista de los 3 clientes con más prodcutos comprados");

        System.out.println("Suma total de dinero gastado por todos los clientes: " + cdao.obtenerSumaTotal());

        System.out.println("Media de productos comprados: " + cdao.obtenerMedia());

        System.out.println("Media de dinero gastado por clientes mayores de 25 años \n" +
                "que hayan comprado más de 3 productos\n: ");

        System.out.println("Clientes con un gasto mayor a 100€: ");

        System.out.println("Clientes con edad entre 30  50 años: ");

        System.out.println("Lista de clientes con un gasto mayor a 200€ ordenados \n" +
                "ordenados por productos comprados\n");

        System.out.println("Cliente más joven con un gasto mayor a 400€: ");







    }
}