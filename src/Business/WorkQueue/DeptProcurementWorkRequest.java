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
public class DeptProcurementWorkRequest extends WorkRequest{
    private String Deptmessage;

    public String getDeptmessage() {
        return Deptmessage;
    }

    public void setDeptmessage(String Deptmessage) {
        this.Deptmessage = Deptmessage;
    }
}
