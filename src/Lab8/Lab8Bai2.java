/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.util.ArrayList;

/**
 *
 * @author XUÂN THÀNH
 */
public class Lab8Bai2 {

    public static void main(String[] args) {
        ArrayList<Integer> myarrr = new ArrayList<Integer>();
        
        for (int i = 0; i <= 10; i++) {
            myarrr.add(i);
        }
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(myarrr.get(i));
        }
    }
}
