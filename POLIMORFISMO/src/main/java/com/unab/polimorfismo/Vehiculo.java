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
public class Vehiculo {
    protected String Marca;
    protected String Matricula ;
    protected String Color;

    public Vehiculo(String Marca, String Matricula, String Color) {
        this.Marca = Marca;
        this.Matricula = Matricula;
        this.Color = Color;
    }
    
}
