/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traductor;
import java.io.*;
/**
 *
 * @author Martín
 */
public class MetodoEnsamblaje {
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    public MetodoEnsamblaje(){

    }
//Abrir archivo texto
    public String AbrirTexto(File archivo){
        String contenido="";
        try{
            entrada = new FileInputStream(archivo);
            int asc;
            while((asc = entrada.read())!=-1 ){
                char caracter = (char)asc;
	contenido+= caracter;
            }
        }catch(Exception e){

        }
        return contenido;
    }
    public String EnsamblarTxt(File archivo, String contenido){
        String respuesta = null;
        try{
            salida = new FileOutputStream(archivo);
            byte[] bytesTxt = contenido.getBytes();
            salida.write(bytesTxt);
            respuesta = "Se ensamblo correctamente";
        }catch(Exception e){
        
        }
	return respuesta;
    }
    public String DesensamblarTxt
        (File archivo, String contenido){
        String respuesta = null;
        try{
            salida = new FileOutputStream(archivo);
            byte[] bytesTxt = contenido.getBytes();
            salida.write(bytesTxt);
            respuesta = "Se desensamblo correctamente";
        }catch(Exception e){
        
        }
	return respuesta;
    }
}
