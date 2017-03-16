package org.compi2.codigo3d.parser;

/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 0;
    private static String c3d = "";
    private static String verdaderas = "";
    private static String falsas = "";
    private static int tempeti = 0;
    
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        tempeti = 0;
        c3d = "";
        verdaderas = "";
        falsas = "";
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t"+temp++;
    }
    
    public static String generaEtiqueta(){
        return "L" + tempeti++;
    }
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    public static void agregarEtiquetas(String Verdadera, String Falsa){
        if(!"".equals(verdaderas)){
            verdaderas += "," + Verdadera;    
        }else{
            verdaderas = Verdadera;
        }
        
        if(!"".equals(falsas)){
           falsas += "," + Falsa; 
        }else{
           falsas = Falsa;
        }
    }
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        if(falsas.equals("") || verdaderas.equals("")){
            c3d += "//ultimo valor: t"+(temp-1);
            return c3d;
        }else{
            c3d += "//Etiquetas de Verdadero: "+ verdaderas + "\n";
            c3d += "//Etiquetas de Falso: "+ falsas + "\n";
            return c3d;
        }
        
    }
    
}
