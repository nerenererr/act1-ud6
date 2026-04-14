# ⋆.˚ Gestión de Clientes — Activity 1

Aplicación Java para la gestión de clientes de una pequeña tienda, con persistencia de datos en una base de datos SQLite.

## Tecnologías

- Java
- SQLite (via JDBC)

## Estructura del proyecto

```
src/
├── modelos/
│   └── Cliente.java        # POJO que representa un cliente
├── dao/
│   └── ClienteDAO.java     # Acceso a datos (operaciones CRUD y consultas)
└── Main.java               # Punto de entrada, ejecuta todas las operaciones
```

## Base de datos

La base de datos se crea automáticamente como `activity1.sqlite3` en la raíz del proyecto.

### Tabla `clientes`

| Campo                | Tipo    | Descripción                        |
|---------------------|---------|------------------------------------|
| `id`                | INTEGER | Clave primaria, autoincremental    |
| `nombre`            | TEXT    | Nombre completo del cliente        |
| `email`             | TEXT    | Correo electrónico                 |
| `telefono`          | TEXT    | Número de teléfono                 |
| `edad`              | INTEGER | Edad del cliente                   |
| `dinero_gastado`    | REAL    | Total gastado en euros             |
| `productos_comprados` | INTEGER | Número de productos comprados    |

### Script de creación

```sql
CREATE TABLE clientes (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT,
    email TEXT,
    telefono TEXT,
    edad INTEGER,
    dinero_gastado REAL,
    productos_comprados INTEGER
);
```

## Operaciones del DAO

| Método | Descripción |
|--------|-------------|
| `insertarCliente(Cliente c)` | Inserta un cliente y devuelve el ID generado |
| `actualizarCliente(Cliente c, int id)` | Actualiza todos los campos de un cliente por ID |
| `eliminarCliente(int id)` | Borra un cliente por ID |
| `obtenerClientePorId(int id)` | Devuelve un cliente según su ID |
| `obtenerClientes()` | Devuelve todos los clientes |
| `obtenerClientesMas30()` | Clientes mayores de 30 años |
| `obtenerClientesGasto500()` | Clientes que han gastado más de 500€ |
| `obtenerClientesOrdenGasto()` | Clientes ordenados por dinero gastado (DESC) |
| `obtenerClientesMasCompra()` | Top 3 clientes con más productos comprados |
| `obtenerSumaTotal()` | Suma total del dinero gastado por todos los clientes |
| `obtenerMedia()` | Media de productos comprados |
| `obtenerMediaMas25()` | Media de dinero gastado (mayores de 25 años y más de 3 productos) |
| `obtenerNumClientesGasto100()` | Número de clientes que han gastado más de 100€ |
| `obtenerEdad3050()` | Número de clientes con edad entre 30 y 50 |
| `obtenerClientesGasto200()` | Clientes con gasto >200€ ordenados por productos comprados (ASC) |
| `obtenerClienteJovenGastoMas400()` | Cliente más joven que ha gastado más de 400€ |

## Ejecución
 
El `Main` ejecuta todas las operaciones CRUD y las consultas disponibles. Las operaciones de inserción, actualización y borrado están comentadas para que las consultas siempre trabajen sobre los datos originales y los resultados sean consistentes entre ejecuciones.
 
Para probar el CRUD basta con descomentar las líneas correspondientes:
 
```java
Cliente cliente = new Cliente("Nuria Roca", "nuria@example.com", "600777456", 21, 222.22, 3);
 
// cdao.insertarCliente(cliente);
// cliente.setEmail("nuriar@example.com");
// cdao.actualizarCliente(cliente, 11);
// cdao.eliminarCliente(11);
```

```java
int id = dao.insertarCliente(cliente);   // Insertar
dao.actualizarCliente(cliente, id);      // Actualizar
// ... consultas ...
dao.eliminarCliente(id);                 // Borrar al final
```
