package org.example.classes;

public class Invoice {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public Invoice(String id, String desc,int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getDesc(){
        return desc;
    }

    public String getId(){
        return id;
    }

    public int getQty(){
        return qty;
    }

    public double getTotal(){
        return qty * unitPrice;
    }

    public double getUnitPrice(){
        return unitPrice;
    }
}