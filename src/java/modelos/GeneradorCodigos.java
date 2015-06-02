/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import mongoHandler.Handler;

/**
 *
 * @author Julian
 */
public class GeneradorCodigos {
    private String codigoAnterior;
    private String codigoNuevo;
    
    public String generarCodigo(){
        
    Handler hand=new Handler();
    hand.crearConexion();
    BasicDBObject vacio = new BasicDBObject();
    
    DBCursor dbc= hand.consultarDocumentos(vacio,"codigos");
     while(dbc.hasNext()){
            
            DBObject documento = dbc.next();
            codigoAnterior=(String)documento.get("codigo");
            try{
                
            int codigo=Integer.parseInt(codigoAnterior)+1;
            codigoNuevo=codigo+"";
            }catch(Exception e){
                System.out.println("imposible parsear");
            }
        }
     BasicDBObject obj= new BasicDBObject();
     BasicDBObject obj2= new BasicDBObject();
     obj.put("codigo",codigoNuevo);
     obj2.put("codigo",codigoAnterior);
     hand.editarDocumento(obj2, obj, "codigos");
     hand.terminarConexion();
    return codigoNuevo;
    }
    
}
