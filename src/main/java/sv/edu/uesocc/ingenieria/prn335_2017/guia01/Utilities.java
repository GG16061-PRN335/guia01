
package sv.edu.uesocc.ingenieria.prn335_2017.guia01;


public class Utilities {
    /**
     * Devuelve los primeros 10 caracteres de un texto
     * @param texto 
     * @return
     */
    public String getResume(String texto){
        
        String cadena="";
        int letra;
        for(letra=0; letra<30;letra++){
        cadena=cadena+String.valueOf(texto.charAt(letra));
        }
        return cadena;
        
    }
    /**
     * combierte la inicial de cada palabra en mayuscula
     * @param texto
     * @return 
     */
    public String capitalizar(String texto){
    
        String cadena="";
        char inicial;
        int letra;
        boolean espacio=true;
        for(letra=0;letra<texto.length();letra++){
        
            if(espacio){
            
                inicial=Character.toUpperCase(texto.charAt(letra));
                cadena=cadena+inicial;
                espacio=false;
            }else{
            
                cadena=cadena+texto.charAt(letra);
            }
            if(" ".equals(texto.charAt(letra))){
            espacio=true;
                
            }
           
        }
        return cadena;
    }
    
}
