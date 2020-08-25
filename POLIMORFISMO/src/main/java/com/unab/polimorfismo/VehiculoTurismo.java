/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.polimorfismo;

/**
 *
 * @author William
 */
public class VehiculoTurismo extends Vehiculo{
    
    private int NPuertas ;

    public VehiculoTurismo(int NPuertas, String Marca, String Matricula, String Color) {
        super(Marca, Matricula, Color);
        this.NPuertas = NPuertas;
    }
    
    
}
