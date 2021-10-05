/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;

/**
 *
 * @author XUÂN THÀNH
 */
public class QLSP implements DAO {

    private ArrayList<Product> list;

    public QLSP() {
        this.list = new ArrayList<>();
    }

    @Override
    public void insert(Product sp) {
        this.list.add(sp);
    }

    @Override
    public void update(int n, Product sp) {
        this.list.set(n, sp);
    }

    @Override
    public void delete(int n) {
        this.list.remove(n);
    }

    @Override
    public ArrayList<Product> getList() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<Product> list) {
        this.list = list;
    }

}
