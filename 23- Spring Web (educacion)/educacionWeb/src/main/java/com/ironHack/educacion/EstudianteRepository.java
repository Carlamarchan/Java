package com.ironHack.educacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EstudianteRepository {
    //Primero hay que instanciar la clase JDBClient para usar estos métodos más modernos
    //son métodos que se pueden concatenar
    @Autowired
    private JdbcClient jdbcClient; //puede ser final para protegerlo porque sólo se instancia una vez

    //Hacer los métodos típicos

    //Mostrar todos
    public List<Estudiante> findAll(){
        return jdbcClient.sql("SELECT * FROM estudiante")
                .query(Estudiante.class)
                .list();
    }

    //Buscar por ID
    public Optional<Estudiante> findById(int id){
        return jdbcClient.sql("SELECT * FROM estudiante WHERE id_estudiante = :id")
                .param("id_estudiante", id)
                .query(Estudiante.class)
                .optional();    //Retorna un objeto o un null
    }

    //Insertar/Crear Hay que comprobar si existe, hacer update, si no, create
    public void save(Estudiante estudiante){
        if(estudiante.getId_estudiante() != null && estudiante.getId_estudiante()>0){
            //entonces existe y hacemos UPDATE
            jdbcClient.sql("UPDATE estudiante FROM educacion WHERE id_estudiante = :id")
                    .param("nombre", estudiante.getNombre())
                    .param("apellido", estudiante.getApellido())
                    .param("id_colegio", estudiante.getId_colegio())
                    .update();
        } else{
            //Si no existe, hacemos un insert
            jdbcClient.sql("INSERT INTO estudiante (nombre, apellido, id_colegio) VALUES (:nombre, :apellido, :id_colegio)")
                    .param("nombre", estudiante.getNombre())
                    .param("apellido", estudiante.getApellido())
                    .param("id_colegio", estudiante.getId_colegio())
                    .update();
        }
    }

    //Borrar por ID
   /* public void  deleteById(int id){

    }*/

}
