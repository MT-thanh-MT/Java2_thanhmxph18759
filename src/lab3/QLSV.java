/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author XUÂN THÀNH
 */
public class QLSV implements QLSV_Interface {

    private ArrayList<SinhVien> list;

    public QLSV() {
        this.list = new ArrayList<>();
    }
    
    @Override
    public void Add(SinhVien sv) {
        this.list.add(sv);
    }

    @Override
    public void Update(int n, SinhVien sv) {
        this.list.set(n, sv);
    }

    @Override
    public void Remove(int n) {
        this.list.remove(n);
    }

    @Override
    public ArrayList<SinhVien> getList() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<SinhVien> list) {
        this.list =  list;
    }

    @Override
    public ArrayList<SinhVien> orderByDiem() {
        Collections.sort(list, (a, b) -> (int) (a.getDiem() - b.getDiem()));
        return list;
    }

    @Override
    public ArrayList<SinhVien> orderByName() {
         Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getName().compareTo(o2.getName());
            }

        });
         return list;
    }
    
}
