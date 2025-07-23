package com.ironhack.educacion;

import java.sql.*;
import java.util.Scanner;

public class GestorEduc {

    public void GestorConcultas() throws ClassNotFoundException, SQLException {

        try (Scanner sc = new Scanner(System.in)) {
            // 1. Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. Crear objeto de conexión que conecte con la BD
            String URL = "jdbc:mysql://localhost:3306/educacion?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF8&useSSL=false"; //useSSL es para seguridad
            String user = "root";
            String password = "";
            Connection connectionDB = DriverManager.getConnection(URL, user, password);
            System.out.println("Conexión realizada!");
            String opcion;

            do {
                System.out.println("""
                        
                                        Menú ESTUDIANTES
                        1.- Crear estudiante
                        2.- Mostrar lista de estudiantes
                        3.- Buscar estudiante por ID
                        4.- Actualizar estudiante
                        5.- Eliminar Estudiante
                        6.- Salir""");

                System.out.println("Selecciona una opción:");
                opcion = sc.nextLine();
                ResultSet rs;
                switch (opcion) {
                    case "1":
                        crearEstudiante(sc, connectionDB);
                        break;

                    case "2":
                        listarTodosLosEstudiantes(sc, connectionDB);
                        break;

                    case "3":
                        buscarEstudiantePorId(sc, connectionDB);
                        break;
                    case "4":
                        modificarEstudiantePorId(sc, connectionDB);
                        break;
                    case "5":
                        eliminarEstudiante(sc, connectionDB);
                        break;

                    case "6":
                        System.out.println("Gracias por participar! Hasta pronto...");

                    default:
                        System.out.println("La opción seleccionada es inválida");
                }
            } while (!opcion.equals("6"));

        } catch (SQLException e) {
            System.out.println("La sentencia SQL lanza una excepción. " + e.getMessage());
            e.printStackTrace();
        }

    }

//--------------------------------------------METODOS-----------------------------------------------------

    //Metodo crear estudiante
    public void crearEstudiante(Scanner sc, Connection connectionDB) throws SQLException {
        String sql = "INSERT INTO estudiante(nombre, apellido, id_colegio) VALUES (?, ?, ?)";
        System.out.println("Ingresa el nombre del estudiante");
        String nombre = sc.nextLine();
        System.out.println("Ingresa el apellido del estudiante");
        String apellido = sc.nextLine();
        System.out.println("Ingresa el id_colegio del estudiante");
        int id_colegio = sc.nextInt();
        sc.nextLine();

        try (PreparedStatement ps = connectionDB.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, id_colegio);
            ps.executeUpdate();
        }
        System.out.println("Estudiante añadido!");
    }

    //Metodo listar estudiantes (todos)
    public void listarTodosLosEstudiantes(Scanner sc, Connection connectionDB) throws SQLException {
        String sql = "SELECT * FROM estudiante";
        try (Statement stat1 = connectionDB.createStatement();
             ResultSet rs = stat1.executeQuery(sql)
        ) {
            System.out.println("------------------   Listado de estudiantes   -----------------");
            while (rs.next()) {
                System.out.println("id: " + rs.getInt("id_estudiante") + " Nombre: " + rs.getString("nombre") + " " + rs.getString("apellido"));
            }
        }

    }

    //Metodo buscar estudiante por ID
    public void buscarEstudiantePorId(Scanner sc, Connection connectionDB) throws SQLException {
        System.out.println("Ingresa el Id del estudiante a buscar");
        String idEstudiante = sc.nextLine();
        String sql = "SELECT * from estudiante WHERE  id_estudiante = ?";
        boolean encontrado = false;
        try (PreparedStatement ps = connectionDB.prepareStatement(sql)) {
            ps.setString(1, idEstudiante);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    encontrado = true;
                    System.out.println("id: " + rs.getInt("id_estudiante") + " Nombre: " + rs.getString("nombre") + " " + rs.getString("apellido"));
                }
            }

        }
        if (!encontrado) {
            System.out.println("El Estudiante con ID " + idEstudiante + " no existe.");
        }
    }

    //Metodo modificar estudiante por ID
    private void modificarEstudiantePorId(Scanner sc, Connection connectionDB) throws SQLException {
        System.out.println("Ingresa el Id del estudiante a modificar");
        int idEstudiante = sc.nextInt();
        sc.nextLine();
        String sql = "SELECT * from estudiante WHERE  id_estudiante = ?";
        boolean encontrado = false;
        try (PreparedStatement ps = connectionDB.prepareStatement(sql)) {
            ps.setInt(1, idEstudiante);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    encontrado = true;
                    System.out.println("El estudiante a modificar es: ");
                    System.out.println("id: " + rs.getInt("id_estudiante") + " Nombre: " + rs.getString("nombre") + " " + rs.getString("apellido"));
                }
            }

        }
        if (!encontrado) {
            System.out.println("El Estudiante con ID " + idEstudiante + " no existe.");
        } else {
            System.out.println("""
                    -------------------  Menú para Actualizar Estudiante  -------------------
                    1. Modificar Nombre
                    2. Modificar Apellido
                    3. Modificar Id_Colegio""");
            System.out.println("Selecciona una opción: ");

            switch (sc.nextLine()) {
                case "1":
                    modificarNombre(sc, connectionDB, idEstudiante);
                    break;
                case "2":
                    modificarApellido(sc, connectionDB, idEstudiante);
                    break;
                case "3":
                    modificarId_colegio(sc, connectionDB, idEstudiante);
                    break;
                default:
                    System.out.println("La opción seleccionada no es válida");
            }

        }
    }

    private void modificarNombre(Scanner sc, Connection connectionDB, int id_estudiante) throws SQLException {
        System.out.println("Introduce el nuevo nombre");
        String nuevoNombre = sc.nextLine();
        String sql = "UPDATE estudiante SET nombre = ? WHERE id_estudiante =?";
        try (PreparedStatement ps = connectionDB.prepareStatement(sql)) {
            ps.setString(1, nuevoNombre);
            ps.setInt(2, id_estudiante);
            ps.executeUpdate();
        }
        System.out.println("Nombre del estudiante modificado!");

    }

    private void modificarApellido(Scanner sc, Connection connectionDB, int id_estudiante) throws SQLException {
        System.out.println("Introduce el nuevo apellido");
        String nuevoApellido = sc.nextLine();
        String sql = "UPDATE estudiante SET apellido = ? WHERE id_estudiante =?";
        try (PreparedStatement ps = connectionDB.prepareStatement(sql)) {
            ps.setString(1, nuevoApellido);
            ps.setInt(2, id_estudiante);
            ps.executeUpdate();
        }
        System.out.println("Apellido del estudiante modificado!");
    }

    private void modificarId_colegio(Scanner sc, Connection connectionDB, int id_estudiante) throws SQLException {
        System.out.println("Introduce el nuevo id_colegio");
        int nuevoIdColegio = sc.nextInt();
        sc.nextLine();
        String sql = "UPDATE estudiante SET id_colegio = ? WHERE id_estudiante = ?";
        try (PreparedStatement ps = connectionDB.prepareStatement(sql)) {
            ps.setInt(1, nuevoIdColegio);
            ps.setInt(2, id_estudiante);

            ps.executeUpdate();
        }
        System.out.println("Id del colegio modificado!");
    }

    //Metodo eliminar estudiante
    private void eliminarEstudiante(Scanner sc, Connection connectionDB) throws SQLException {
        System.out.println("Ingresa el Id del estudiante a eliminar");
        String idEstudianteAEliminar = sc.nextLine();
        String sql = "DELETE from estudiante WHERE  id_estudiante = ?";
        int totalFilasEliminadas;
        try (PreparedStatement ps = connectionDB.prepareStatement(sql)) {
            ps.setString(1, idEstudianteAEliminar);
            totalFilasEliminadas = ps.executeUpdate();
        }
        if (totalFilasEliminadas == 0) {
            System.out.println("El estudiante con el Id " + idEstudianteAEliminar + " no existe en la Base de Datos");
        } else {
            System.out.println("El estudiante con ID " + idEstudianteAEliminar + " ha sido eliminado");
        }
    }

}