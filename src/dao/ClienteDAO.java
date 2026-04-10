package dao;

import modelos.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private String url = "jdbc:sqlite:activity1.sqlite3";

    public void insertarCliente(Cliente c) {
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql ="INSERT INTO clientes (nombre, email, telefono, edad, dinero_gastado, productos_comprados) " +
                    "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, c.getNombre());
            pstmt.setString(2, c.getEmail());
            pstmt.setString(3, c.getTelefono());
            pstmt.setInt(4, c.getEdad());
            pstmt.setDouble(5, c.getDinero_gastado());
            pstmt.setInt(6, c.getProductos_comprados());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void actualizarCliente(Cliente c, int id) {
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "UPDATE clientes SET nombre = ?, email = ?, telefono = ?, edad = ?, dinero_gastado = ?, productos_comprados = ? " +
                    "WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, c.getNombre());
            pstmt.setString(2, c.getEmail());
            pstmt.setString(3, c.getTelefono());
            pstmt.setInt(4, c.getEdad());
            pstmt.setDouble(5, c.getDinero_gastado());
            pstmt.setInt(6, c.getProductos_comprados());
            pstmt.setInt(7, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void eliminarCliente(int id) {
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "DELETE FROM clientes WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
    } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void obtenerCliente(int id) {
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "SELECT * FROM clientes WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<Cliente> obtenerClientes() {
        List<Cliente> listaClientes = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "SELECT * FROM clientes";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                int edad = rs.getInt("edad");
                double dinero_gastado = rs.getDouble("dinero_gastado");
                int productos_comprados = rs.getInt("productos_comprados");
                Cliente c = new Cliente(nombre, email, telefono, edad, dinero_gastado, productos_comprados);
                listaClientes.add(c);
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listaClientes;
    }

}
