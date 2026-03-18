/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poliformismo;

/**
 *
 * @author Estudiante
 */
public class Licuadora extends Electrodomesticos{

    public Licuadora(String marca, String modelo, int capacidad,String velocidad) {
        super(marca, modelo, capacidad);
    }
    private String velocidades;

    public String getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(String velocidades) {
        this.velocidades = velocidades;
    }
    
    public void licuar(){
        System.out.println("Licuando... ");
    }
}