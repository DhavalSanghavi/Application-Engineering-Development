/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ExtendedClasses;

/**
 *
 * @author Abhishek
 */
public class Parts {
    private int partPrice;
    private int partsQuantity;
    private String Name;
    private int totalSoldparts;

    public int getPartPrice() {
        return partPrice;
    }

    public void setPartPrice(int partPrice) {
        this.partPrice = partPrice;
    }

    public int getPartsQuantity() {
        return partsQuantity;
    }

    public void setPartsQuantity(int partsQuantity) {
        this.partsQuantity = partsQuantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getTotalSoldparts() {
        return totalSoldparts;
    }

    public void setTotalSoldparts(int totalSoldparts) {
        this.totalSoldparts = totalSoldparts;
    }

    @Override
    public String toString() {
        return Name;
    }
    
    
    
    
    
}
