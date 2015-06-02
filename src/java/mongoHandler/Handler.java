/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongoHandler;

import com.mongodb.*;
import java.net.UnknownHostException;

/**
 *
 * @author estudiante
 */
public class Handler {
    
    private DB dataBase;
    private MongoClient clienteMongo;
        
    public boolean crearConexion() {
        try {
            MongoClientURI uri  = new MongoClientURI("mongodb://prueba1:prueba1@ds039950.mongolab.com:39950/seigcdb"); 
            clienteMongo = new MongoClient(uri);
            dataBase =clienteMongo.getDB("seigcdb");
            System.out.println("CONEXION CREADA");
            return true;
        } catch(UnknownHostException e) {
            System.out.println("FALLO CONECTANDO:"+ e.getMessage());
            return false;
        }catch(Exception s){
            System.out.println("FALLO CONECTANDO:" +s.getMessage());
            return false;
        }    
    }
    
    public boolean terminarConexion(){
        try{
            clienteMongo.close();
            System.out.println("CONEXION CERRADA");
            return true;
        }catch(Exception s){
            System.out.println("NO SE PUDO CERRAR LA CONEXION :" +s.getMessage());
            return false;
        }
    }
    
    public boolean crearNuevoDocumento(BasicDBObject datos, String nombreColeccion){ 
        try{
        DBCollection coleccion = dataBase.getCollection(nombreColeccion);
        coleccion.insert(datos);
        System.out.println("DOCUMENTO CREADO");
        return true;
        }catch(Exception e){
            System.out.println("NO SE PUDO CREAR EL DOCUMENTO : " +e.getMessage());
            return false;
        } 
    }
    
    public boolean editarDocumento(BasicDBObject documentoAEditar, BasicDBObject nuevoDocumento, String nombreColeccion){
        try{
        DBCollection coleccion = dataBase.getCollection(nombreColeccion);
        coleccion.update(documentoAEditar, nuevoDocumento);
        System.out.println("DOCUMENTO EDITADO");
        return true;
        }catch(Exception e){
            System.out.println("NO SE PUDO EDITAR EL DOCUMENTO : " +e.getMessage());
            return false;
        }
    }
    
    public boolean eliminarDocumento(BasicDBObject documentoAEliminar, String nombreColeccion){
        try{
        DBCollection coleccion = dataBase.getCollection(nombreColeccion);
        coleccion.remove(documentoAEliminar);
        System.out.println("DOCUMENTO ELIMINADO");
        return true;
        }catch(Exception e){
            System.out.println("NO SE PUDO ELIMINAR EL DOCUMENTO : " +e.getMessage());
            return false;
        }
    }
    
    public DBCursor consultarDocumentos(BasicDBObject campoDeBusqueda, String nombreColeccion){
        try{
        DBCollection coleccion = dataBase.getCollection(nombreColeccion);
        DBCursor documentos = coleccion.find(campoDeBusqueda);
        System.out.println("CONSULTA EXITOSA");
        return documentos;
        }catch(Exception e){
            System.out.println("CONSULTA FALLIDA : " +e.getMessage());
            return null;
        }
    }
    public DBCursor consultarTodosDocumentos(String nombreColeccion){
        try{
        DBCollection coleccion = dataBase.getCollection(nombreColeccion);
        DBCursor documentos = coleccion.find();
        System.out.println("CONSULTA EXITOSA");
        return documentos;
        }catch(Exception e){
            System.out.println("CONSULTA FALLIDA : " +e.getMessage());
            return null;
        }
    }
}
