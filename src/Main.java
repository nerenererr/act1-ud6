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




    }
}