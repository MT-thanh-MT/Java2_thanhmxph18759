/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XUÂN THÀNH
 */
public class TestThread {
    public static void main(String[] args) {
         Thread odd = new Thread(new OddThread());
         Thread even = new Thread(new EvenThread());
         
         odd.start();
        try {
            odd.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
         even.start();
         
         
    }
}
