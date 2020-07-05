/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author pc
 */
public class nodoPila {
    private int Cod;
    private String detalle;
    private nodoPila refNodo;
    
    public nodoPila(){
        this.Cod = -1;
        this.detalle = "";
        this.refNodo = null;
    }

    public nodoPila(int Cod, String detalle) {
        this.Cod = Cod;
        this.detalle = detalle;
        this.refNodo = null;
    }
    
    public int getCod() {
        return Cod;
    }

    public void setCod(int Cod) {
        this.Cod = Cod;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public nodoPila getRefNodo() {
        return refNodo;
    }

    public void setRefNodo(nodoPila refNodo) {
        this.refNodo = refNodo;
    }
    
    public String getDato(){
        return "<"+this.Cod+", "+this.detalle+">";
    }
       
}
