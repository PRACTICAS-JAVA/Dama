/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dama;

/**
 *
 * @author jai
 */
public class ficha {
    //Si es positivo es negro. 
    private boolean color;
    //Si es positivo es dama.
    private boolean dama;
  
    //Posisones en el tablero de la ficha
    private byte pos_x;
    private byte pos_y;
    
    //conturctor
    public ficha(boolean color, boolean dama, byte pos_x, byte pos_y) {
        this.color = color;
        this.dama = dama;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }

 
    
    //Metodos get.

    public boolean isColor() {
        return color;
    }

    public boolean isDama() {
        return dama;
    }

    public byte getPos_x() {
        return pos_x;
    }

    public byte getPos_y() {
        return pos_y;
    }
    
      //Metosdo set

    public void setColor(boolean color) {
        this.color = color;
    }

    public void setDama(boolean dama) {
        this.dama = dama;
    }

    public void setPos_x(byte pos_x) {
        this.pos_x = pos_x;
    }

    public void setPos_y(byte pos_y) {
        this.pos_y = pos_y;
    }

    @Override
    public String toString() {
        return "ficha{" + "color=" + color + ", dama=" + dama + ", pos_x=" + pos_x + ", pos_y=" + pos_y + '}';
    }
    
}
