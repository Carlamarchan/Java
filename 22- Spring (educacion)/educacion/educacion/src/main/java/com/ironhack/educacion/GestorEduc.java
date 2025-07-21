package com.ironhack.educacion;

import java.sql.*;

public class GestorEduc {

    public void GestorConcultas() throws ClassNotFoundException, SQLException {
        // Aqui irán las consultas mySQL

        try {
            // 1. Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. Crear objeto de conexión que conecte con la BD
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/educacion", "root", "");
            // 3. Crear objeto Statement para las consultas:
            Statement stat1 = con1.createStatement(); // Crea objetos para las consultas en esa conexión
            System.out.println("Conexión realizada!");
            // Aún hay que gererar el objeto que guardará el contenido de la tabla en
            // ResultSet
            ResultSet resultado1 = stat1.executeQuery("SELECT * FROM estudiante");
            System.out.println(resultado1);
            System.out.println("Listado de estudiantes");

            while (resultado1.next()) {
                System.out.println("id: " + resultado1.getInt("id_estudiante") + " : " + resultado1.getString("nombre"));
            }
            String insert ="INSERT INTO estudiante(id_estudiante, nombre, apellido, id_colegio) VALUES (15, 'Maria', 'Lopez', 1)";
            stat1.executeUpdate(insert);
            System.out.println("Estudiante añadido!");
        } catch (Exception e) {
            System.out.println("Algo no funciona");
            e.printStackTrace();
        }

    }
}