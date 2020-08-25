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
public class VehiculoFurgoneta extends Vehiculo{
    
    private  int Carga ;

    public VehiculoFurgoneta(int Carga, String Marca, String Matricula, String Color) {
        super(Marca, Matricula, Color);
        this.Carga = Carga;
    }
    
    
}
