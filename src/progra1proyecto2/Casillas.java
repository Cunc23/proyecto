/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1proyecto2;

import javax.swing.ImageIcon;

/**
 *
 * @author Dell
 */
public class Casillas {

    private int barco;
    private int vida;
    private boolean movido;
    private ImageIcon imagenBarco;

    public Casillas(int barco, boolean reposicion) {
        
        
        movido = false;
        this.barco = barco;
        if (!reposicion) {
            switch (barco) {
                case 1:
                case 5:
                    vida = 2;
                    imagenBarco = new ImageIcon("destructor.png");
                    break;
                case 2:
                    vida = 3;
                    imagenBarco = new ImageIcon("submarino.png");
                    break;
                case 3:
                    vida = 4;
                    imagenBarco = new ImageIcon("acorazado.png");
                    break;
                case 4:
                    vida = 5;
                    imagenBarco = new ImageIcon("portaaviones.png");
                    break;
            }
            
        }

    }

    public int bomba(int hundidos) {

        if (barco != 0) {
            if (vida > 0) {
                vida--;
                System.out.println("Le diste");
            }
            if (vida == 0) {
                System.out.println("Barco destruido");
                barco = 0;
                hundidos++;
            }
        } else {
            System.out.println("fallaste");
        }
        return hundidos;

    }

    public int getVida() {

        return vida;

    }

    public int getBarco() {

        return barco;

    }
    
    public ImageIcon getImagenBarco(){
        return imagenBarco;
    }
    
    public void reiniciar() {

        barco = 0;
        vida = 0;

    }
    
    public void movido() { 
     
        movido = true;
        
    }
    
    public void finalR() {
        
        movido = false;
        
    }
    
    public boolean getMov() {
        
        return movido;
        
    }

}