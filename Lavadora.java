/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poliformismo;

/**
 *
 * @author Estudiante
 */
public class Lavadora extends Electrodomesticos {

    public Lavadora(String marca, String modelo, int capacidad) {
        super(marca, modelo, capacidad);
    }
    private void lavar(){
        System.out.println("Lavando");
    }
    private void apagar(){
        System.out.println("Off");
    }
}
