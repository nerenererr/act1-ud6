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


        System.out.println("Cliente con ID 7");
        System.out.println(cdao.obtenerClientePorId(7));
        System.out.println("₍^. .^₎⟆");

        System.out.println("Lista de clientes: ");
        System.out.println(cdao.obtenerClientes());
        System.out.println("₍^. .^₎⟆");

        System.out.println("Lista de clientes mayores de 30 años:");
        cdao.obtenerClientesMas30().forEach(System.out::println);
        System.out.println("₍^. .^₎⟆");

        System.out.println("Lista de clientes con un gasto mayor a 500€");
        cdao.obtenerClientesGasto500().forEach(System.out::println);
        System.out.println("₍^. .^₎⟆");

        System.out.println("Lista de clientes ordenados por dinero gastado de mayor a menor");
        cdao.obtenerClientesOrdenGasto().forEach(System.out::println);
        System.out.println("₍^. .^₎⟆");

        System.out.println("Lista de los 3 clientes con más productos comprados");
        cdao.obtenerClientesMasCompra().forEach(System.out::println);
        System.out.println("₍^. .^₎⟆");

        System.out.println("Suma total de dinero gastado por todos los clientes: ");
        System.out.println(cdao.obtenerSumaTotal() + "€");
        System.out.println("₍^. .^₎⟆");

        System.out.println("Media de productos comprados: ");
        System.out.println(cdao.obtenerMedia());
        System.out.println("₍^. .^₎⟆");

        System.out.println("Media de dinero gastado por clientes mayores de 25 años \n" +
                "que hayan comprado más de 3 productos: ");
        System.out.println(cdao.obtenerMediaMas25() + "€");
        System.out.println("₍^. .^₎⟆");

        System.out.println("Clientes con un gasto mayor a 100€: ");
        System.out.println(cdao.obtenerNumClientesGasto100());
        System.out.println("₍^. .^₎⟆");

        System.out.println("Clientes con edad entre 30 y 50 años: ");
        System.out.println(cdao.obtenerEdad3050());
        System.out.println("₍^. .^₎⟆");

        System.out.println("Lista de clientes con un gasto mayor a 200€ ordenados \n" +
                "ordenados por productos comprados\n");
        cdao.obtenerClientesGasto200().forEach(System.out::println);
        System.out.println("₍^. .^₎⟆");

        System.out.println("Cliente más joven con un gasto mayor a 400€: ");
        System.out.println(cdao.obtenerClienteJovenGastoMas400());







    }
}