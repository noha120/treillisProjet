/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.abouhamdan.treillisprojet;

/**
 *
 * @author Antoine
 */
public class NoeudAppuiSimple extends NoeudAppui{
    
    public NoeudAppuiSimple() {
    }
    
    public NoeudAppuiSimple(double x, double y) {
        super(x, y);
    }
    
    public NoeudAppuiSimple (double x, double y, Vecteur2D f){
        this.px=x;
        this.py=y;
        this.force=f;
    }
    
}