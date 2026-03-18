/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poliformismo;

/**
 *
 * @author Estudiante
 */
public class Electrodomesticos {
    private String marca;
    private String modelo;
    private int capacidad;

    public Electrodomesticos(String marca, String modelo, int capacidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void Encender(){
        System.out.println("El electrodomestico esta encendido");
    }
    public void Apagar(){
        System.out.println("El electrodomestico esta apagado");
    }
    
    @Override
    public String toString() {
        return "-----Electrodomesticos-----" + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCapacidad: " + capacidad;
    }
}
