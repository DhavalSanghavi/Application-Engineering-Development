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
public class ProcurementFinanceWorkRequest extends WorkRequest{
    
    private String finMessage;

    public String getFinMessage() {
        return finMessage;
    }

    public void setFinMessage(String finMessage) {
        this.finMessage = finMessage;
    }
    
    
}
