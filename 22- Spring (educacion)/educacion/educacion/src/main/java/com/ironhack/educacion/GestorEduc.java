package com.ironhack.educacion;

import java.sql.*;
import java.util.Scanner;

public class GestorEduc {

    public void GestorConcultas() throws ClassNotFoundException, SQLException {
        // Aqui irán las consultas mySQL
        Scanner sc = new Scanner(System.in);

        try {
            // 1. Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. Crear objeto de conexión que conecte con la BD
            Connection connectionDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/educacion", "root", "");
            // 3. Crear objeto Statement para las consultas:
            Statement stat1 = connectionDB.createStatement(); // Crea objetos para las consultas en esa conexión
            System.out.println("Conexión realizada!");
            // Aún hay que gererar el objeto que guardará el contenido de la tabla en
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
                String sql;
                PreparedStatement ps;
                ResultSet rs;
                switch (opcion) {

                    case "1":
                        System.out.println("Ingresa el nombre del estudiante");
                        String nombre = sc.nextLine();
                        System.out.println("Ingresa el apellido del estudiante");
                        String apellido = sc.nextLine();
                        System.out.println("Ingresa el id_colegio del estudiante");
                        int id_colegio = sc.nextInt();
                        sc.nextLine();
                        sql = "INSERT INTO estudiante(nombre, apellido, id_colegio) VALUES (?, ?, ?)";
                        ps = connectionDB.prepareStatement(sql);
                        ps.setString(1, nombre);
                        ps.setString(2, apellido);
                        ps.setInt(3, id_colegio);
                        ps.executeUpdate();
                        System.out.println("Estudiante añadido!");
                        break;

                    case "2":
                        rs = stat1.executeQuery("SELECT * FROM estudiante");
                        System.out.println("Listado de estudiantes");

                        while (rs.next()) {
                            System.out.println("id: " + rs.getInt("id_estudiante") + " Nombre: " + rs.getString("nombre") + " " + rs.getString("apellido"));
                        }


                        break;

                    case "3":
                        System.out.println("Ingresa el Id del estudiante a buscar");
                        String idEstudiante = sc.nextLine();
                        sql = "SELECT * from estudiante WHERE  id_estudiante = ?";
                        ps = connectionDB.prepareStatement(sql);
                        ps.setString(1, idEstudiante);
                        rs = ps.executeQuery();
                        boolean encontrado = false;

                        while (rs.next()) {
                            encontrado = true;
                            System.out.println("id: " + rs.getInt("id_estudiante") + " Nombre: " + rs.getString("nombre") + " " + rs.getString("apellido"));
                        }
                        if (!encontrado) {
                            System.out.println("El Estudiante con ID " + idEstudiante + " no existe.");
                        }

                        break;
                    case "5":
                        System.out.println("Ingresa el Id del estudiante a eliminar");
                        String idEstudianteAEliminar = sc.nextLine();
                        sql = "DELETE from estudiante WHERE  id_estudiante = ?";
                        ps = connectionDB.prepareStatement(sql);
                        ps.setString(1, idEstudianteAEliminar);
                        int totalFilasEliminadas = ps.executeUpdate();
                        if (totalFilasEliminadas == 0) {
                            System.out.println("El estudiante con el Id " + idEstudianteAEliminar + " no existe en la Base de Datos");
                        } else {
                            System.out.println("El estudiante con ID " +idEstudianteAEliminar+ " ha sido eliminado");
                        }
                        break;
                    case "4":
                        System.out.println("I'm working on it.... Please wait");
                    case "6":
                        System.out.println("Gracias por participar! Hasta pronto...");

                    default:
                        System.out.println("La opción seleccionada es inválida");
                }
            } while (!opcion.equals("6"));


            // ResultSet


//            System.out.println("Ingresa el nombre del estudiante");
//            String nombre = sc.nextLine();
//            System.out.println("Ingresa el apellido del estudiante");
//            String apellido = sc.nextLine();
//            System.out.println("Ingresa el id_colegio del estudiante");
//            int id_colegio = sc.nextInt();
//            String insert2 = "INSERT INTO estudiante(nombre, apellido, id_colegio) VALUES ('" + nombre + "+', '" + apellido + "', " + id_colegio + ")";
//            stat1.executeUpdate(insert2);
//            System.out.println("Estudiante añadido!");
//
//
//            //Mejor usar preparedStatement, que va con los interrogantes(?)
//            //PreparedStatement ps = aqui va el insert definido anteriormente
//            String insert3 = "INSERT INTO estudiante(nombre, apellido, id_colegio) VALUES (?, ?, ?)";
//            PreparedStatement ps = con1.prepareStatement(insert3);
//            System.out.println("Ingresa el nombre del estudiante:");
//            nombre = sc.nextLine();
//            sc.nextInt();
//            System.out.println("Ingresa el apellido del estudiante");
//            apellido = sc.nextLine();
//            System.out.println("Ingresa el id_colegio del estudiante");
//            id_colegio = sc.nextInt();
//
//
//            ps.setString(1, nombre);
//            ps.setString(2, apellido);
//            ps.setInt(3, id_colegio);
//
//            ps.executeUpdate();
//            System.out.println("Estudiante añadido!");

            sc.close();
        } catch (Exception e) {
            System.out.println("Algo no funciona");
            e.printStackTrace();
        }

    }
}