/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poliformismo;

/**
 *
 * @author Estudiante
 */
public class Poliformismo {
    private static int i;
    public static void main(String[] args) {
        Electrodomesticos[] E = new Electrodomesticos[5];
        E[0] = new Licuadora("LG","Ninja",1,"Media Intensidad");
        E[1] = new Lavadora("LG","Nana",15);
        E[2] = new Licuadora("LG","Ninja",1,"Media Intensidad");
        E[3] = new Licuadora("LG","Ninja",1,"Media Intensidad");
        E[4] = new Lavadora("LG","Nanny",10);
        
        System.out.println(E[0]);
        
        if(E[i] instanceof Lavadora){
            ((Lavadora)E[i])*lavar();
        }
        else{
            
        }
        
        for(i=0;i<5;i++){
            E[i].Encender();
        }
 
        for(i=0;i<5;i++){
            E[i].Apagar();
        }
    }    
    
    
    
}
