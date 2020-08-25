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
public class VehiculoDeportivo  extends Vehiculo{
    
    private int Cilidraje;

    public VehiculoDeportivo(int Cilidraje, String Marca, String Matricula, String Color) {
        super(Marca, Matricula, Color);
        this.Cilidraje = Cilidraje;
    }

    @Override
    public String toString() {
        return "VehiculoDeportivo{" + "Cilidraje=" + Cilidraje + '}';
    }
    
    
}
