/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author maloriegomm
 */
public class Player implements Serializable{
    
    private String name;
    private List<Item> inventory;
    private double money;
    private List<Deliveries> deliveries;
    public String itemsCurrent [];
    public int currentSurvivalPoints;
    private int remainingSurvivalPoints;
   
   
    public Player() {
        //inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
    public List<Deliveries> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Deliveries> deliveries) {
        this.deliveries = deliveries;
    }

    public String[] getItemsCurrent() {
        return itemsCurrent;
    }

    public void setItemsCurrent(String[] itemsCurrent) {
        this.itemsCurrent = itemsCurrent;
    }

    public int getCurrentSurvivalPoints() {
        return currentSurvivalPoints;
    }

    public void setCurrentSurvivalPoints(int currentSurvivalPoints) {
        this.currentSurvivalPoints = currentSurvivalPoints;
    }

    public int getRemainingSurvivalPoints() {
        return remainingSurvivalPoints;
    }

    public void setRemainingSurvivalPoints(int remainingSurvivalPoints) {
        this.remainingSurvivalPoints = remainingSurvivalPoints;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }

    
    
}
