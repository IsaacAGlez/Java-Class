/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author isaac
 */
public class Biblioteca {
    public static void main(String[] args) {
        Item[] items = new Item[4];
        
        items[0] = new Printed(7985, "Alice in Wonderland", 105);
        items[1] = new Multimedia(3565, "In a Sentimental Mood", 597);
        items[2] = new Printed(2365, "Building Java Programs", 874);
        items[3] = new Printed(5823, "Complete Wreck Diving", 200); 
        printItems(items); 
    }

    public static void printItems(Item[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].toString());
        }
    }
}
