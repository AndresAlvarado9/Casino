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
public class H2M1 implements Runnable {
  private JTextField jDinero;
private int contadorV1,contadorV2,contadorV3,derrotas1,derrotas2,derrotas3,apuestas;
private double dinero;
private final Random randomico= new Random();
protected Thread t;
private String n,p,i;
    public H2M1() {
    }

    public H2M1(JTextField jDinero) {
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
    if(randomico.nextInt(37)%2==0){
    p="Par";
    jDinero.setText(p);
    }else if(randomico.nextInt(37)%2!=0){
    i="Impar";
    jDinero.setText(i);
    }
    if(randomico.nextInt(37)==0){
    randomico.nextInt(37);
     if(randomico.nextInt(37)%2==0){
    p="Par";
    jDinero.setText(p);
    }else if(randomico.nextInt(37)%2!=0){
    i="Impar";
    jDinero.setText(i);
    }
    }
    if(randomico.nextInt(37)==37){
    randomico.nextInt(37);
     if(randomico.nextInt(37)%2==0){
    p="Par";
    jDinero.setText(p);
    }else if(randomico.nextInt(37)%2!=0){
    i="Impar";
    jDinero.setText(i);
    }
    }
    
    }
      
}
