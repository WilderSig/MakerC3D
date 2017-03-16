package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String etV;
    private String etF;

    public NodoC3D(String cad) {
        this.cad = cad;
        this.etF = "";
        this.etV = "";
    }
    
    public String getCad(){
        return cad;
    }

    public NodoC3D(String cad, String etV, String etF) {
        this.cad = cad;
        this.etV = etV;
        this.etF = etF;
    }

    public String getEtV() {
        return etV;
    }

    public String getEtF() {
        return etF;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }

    public void setEtV(String etV) {
        this.etV = etV;
    }

    public void setEtF(String etF) {
        this.etF = etF;
    }
    
    
        
}
