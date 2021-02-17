/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.hilo;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author NALECOMPUTERS
 */
public class hilos implements Runnable{
    protected JButton numero;
    protected int contador,nApuesta;
    protected double dineroA;
    protected final Random randomico= new Random();
    protected Thread t;
    protected int velocidad;
    protected JTextField ganador;
    protected String v;
    public hilos() {
    }

    public hilos(JButton numero, int contador, int nApuesta, double dineroA) {
        this.numero = numero;
        this.contador = contador;
        this.nApuesta = nApuesta;
        this.dineroA = dineroA;
        this.velocidad=0;
        
        t=new Thread(this);
        t.start();
    }

    public JButton getNumero() {
        return numero;
    }

    public void setNumero(JButton numero) {
        this.numero = numero;
    }

    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public void run() {
        for (int i = 0; i < 36; i++) {
       while (velocidad <= 36){    
        giro();
         try {
             Thread.sleep(100);
         } catch (InterruptedException ex) {
             Logger.getLogger(hilos.class.getName()).log(Level.SEVERE, null, ex);
         }
        giro2();
        velocidad++;
     }     
        }
 
     
    
    }
    
    public void giro(){
     v=String.valueOf(randomico.nextInt(37));
     if(numero.getText().equals(v))   
    numero.setForeground(Color.BLACK);
    
    try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    if(numero.getForeground().equals("BLACK")) 
    numero.setForeground(Color.WHITE);
    }
    public void giro2(){
     
    numero.setForeground(Color.WHITE);
    try {
            Thread.sleep(10);
        } catch (InterruptedException e) {

   
        }
    }
    

    
  
    
    
}
