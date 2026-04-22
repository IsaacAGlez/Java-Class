/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author isaac
 */
public class Multimedia extends Item {
    private int length;

    public Multimedia(int id, String title, int length) {
        super(id, title);
        this.length = length;
    }

    public String toString() {
        return super.toString() + " (" + length + " seconds)";
    }
}