package com.example.piggybank.modules;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long coinid;
    private String name;
    private String nameplural;
    private double value;
    private int quantity;


    public Coin(String name, String nameplural, double value, int quantity) {
        this.name = name;
        this.nameplural = nameplural;
        this.value = value;
        this.quantity = quantity;
    }

    public Coin() {
    }

    public Long getCoinid() {
        return coinid;
    }

    public void setCoinid(Long coinid) {
        this.coinid = coinid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameplural() {
        return nameplural;
    }

    public void setNameplural(String nameplural) {
        this.nameplural = nameplural;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        if(quantity == 1){
            return quantity + " " + name;

        }else
            return quantity + " " + nameplural;
    }
}
