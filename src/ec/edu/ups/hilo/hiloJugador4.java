/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.hilo;

import java.util.Random;
import javax.swing.JTextField;

/**
 *
 * @author Andres
 */
public class hiloJugador4 implements Runnable {
private JTextField jDinero;
private int contadorV1,contadorV2,contadorV3,derrotas1,derrotas2,derrotas3,apuestas;
private double dinero;
private final Random randomico= new Random();
protected Thread t;
private String n;
    public hiloJugador4() {
    }

    public hiloJugador4(JTextField jDinero) {
        this.jDinero = jDinero;
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        numero();
    }
    public void numero(){
    randomico.nextInt(37);
    n=String.valueOf(randomico.nextInt(37));
    jDinero.setText(n);
    if(randomico.nextInt(37)==0){
    randomico.nextInt(37);
     n=String.valueOf(randomico.nextInt(37));
    jDinero.setText(n);
    }
    if(randomico.nextInt(37)==37){
    randomico.nextInt(37);
     n=String.valueOf(randomico.nextInt(37));
    jDinero.setText(n);
    }
    
    }
    
}
