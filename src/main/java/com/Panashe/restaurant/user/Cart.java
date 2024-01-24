package com.Panashe.restaurant.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Service
public class Cart {
    ArrayList<Item> item= new ArrayList<Item>();
    double totalAmount=0;

    public void addToCart(Item item){
        this.item.add(item);
        this.totalAmount+= item.getPrice()* item.getQuantity();
    }

//    i could just use product id but do i need to do that idk
    public void removeItem(Item i){
        ListIterator<Item> iterator1= item.listIterator();
        while(iterator1.hasNext()){
            Item item1= iterator1.next();
            if (item1.getName().equals(i.getName())){
                this.item.remove(i);
                break;
            }
        }
    }

    public List<Item> getCart(){
        return item;
    }
}
