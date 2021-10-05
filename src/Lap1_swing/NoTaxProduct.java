/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author XUÂN THÀNH
 */
public class NoTaxProduct extends Product {

    public NoTaxProduct(String name, double price) {
        super(name, price);
    }

    public NoTaxProduct() {
    }

    @Override
    public double getImportTax() {
        return 0; 
    }
    
}
