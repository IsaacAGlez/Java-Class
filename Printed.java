/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author isaac
 */
public class Printed extends Item {
    private int pages;

    public Printed(int id, String title, int pages) {
        super(id, title); 
        this.pages = pages;
    }

    public String toString() {
        return super.toString() + " (" + pages + " pages)";
    }
}
