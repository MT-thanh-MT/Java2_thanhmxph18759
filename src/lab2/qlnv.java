/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;

/**
 *
 * @author XUÂN THÀNH
 */
public class qlnv implements qlnv_interface{
    private ArrayList<Management> list;

    public qlnv() {
        this.list = new ArrayList<>();
    }

    @Override
    public void Add(Management nv) {
        this.list.add(nv);
    }

    @Override
    public void Update(int n, Management nv) {
        this.list.set(n, nv);
    }

    @Override
    public void Remove(int n) {
        this.list.remove(n);
    }

    @Override
    public ArrayList<Management> getList() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<Management> list) {
        this.list = list;
    }
    
}
