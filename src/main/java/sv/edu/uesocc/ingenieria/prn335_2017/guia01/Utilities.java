
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
    /**
     * un buscador de frases en el texto
     * @param Frase
     * @param Texto
     * @return 
     */
    public int contarCoincidencias(String Frase, String Texto){
    
        int coincidencias=0;
        int contadorTexto;
        int contadorFrase;
        int longitud=Frase.length();
        boolean coincidencia=false;
        for(contadorTexto=0;contadorTexto<Texto.length();contadorTexto++){
            for(contadorFrase=0;contadorFrase<Frase.length();contadorFrase++){
            
                if(Frase.charAt(contadorFrase)==Texto.charAt(contadorTexto)){
                
                    coincidencia=true;
                }else{
                
                    coincidencia=false;
                    break;
                }
            }
            if(coincidencia){
            
                coincidencias++;
            }
        
            
        }
        return coincidencias;
    }
    
}
