package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class BaseConexion {
    protected Connection conexion;
    protected void conectar (){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver cargando");
            conexion = DriverManager.getConnection("\"jdbc:mysql://localhost:3306/universidad?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8\", \"root\", \"root\"");
        }catch (Exception e){
            System.out.println("error: "+e);
        }
    }
    protected void desconectar(){
        try{
            conexion.close();
        }catch (Exception e){
            System.out.println("error: "+e);
        }
    }
}
