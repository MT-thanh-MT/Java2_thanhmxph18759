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
public class QLND implements QLND_Interface{
    private ArrayList<User> list;

    public QLND() {
        this.list = new ArrayList<>();
    }
    
    
    @Override
    public void Add(User user) {
        this.list.add(user);
    }

    @Override
    public void Update(int n, User user) {
        this.list.set(n, user);
    }

    @Override
    public void Remove(int n) {
        this.list.remove(n);
    }

    @Override
    public ArrayList<User> getList() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<User> list) {
        this.list = list;
    }
    
}
