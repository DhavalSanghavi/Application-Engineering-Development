/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Abhishek
 */
public class ProcTechWorkRequest extends WorkRequest{
    private int price;
    private String procMessage;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProcMessage() {
        return procMessage;
    }

    public void setProcMessage(String procMessage) {
        this.procMessage = procMessage;
    }

    
}
