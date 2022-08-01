package com.example.spring_practice.service;

import com.example.spring_practice.model.Meal;
import com.example.spring_practice.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    List<Order>orderLIst;
    List<Meal>mealList;

    public OrderService() {
        this.orderLIst=new ArrayList<>();
        this.mealList=new ArrayList<>();
        this.mealList.add(new Meal("hamburger",100,"this is delicious ."));
        this.orderLIst.add(new Order(1,100,"Bill",this.mealList));
        this.orderLIst.add(new Order(2,400,"Lill",this.mealList));
        this.orderLIst.add(new Order(3,500,"Lill",this.mealList));
        this.orderLIst.add(new Order(4,1000,"Lill",this.mealList));

    }

    public  Order getOrderById(int id){
        for (int i=0;i<this.orderLIst.size();i++){
            if(this.orderLIst.get(i).getSeq()==id){
                return this.orderLIst.get(i);
            }
        }
        return null;
    }
    public  int getOrderSales(){
        int totalSales=0;
        for (int i=0;i<this.orderLIst.size();i++){
                 totalSales+=this.orderLIst.get(i).getTotalPrice();
        }
        return totalSales;

    }

}
