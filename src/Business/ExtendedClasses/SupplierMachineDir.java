/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ExtendedClasses;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class SupplierMachineDir {
    
    public ArrayList<SupplierMachine>  suppmachineList;

    public SupplierMachineDir() {
        suppmachineList = new ArrayList<>();
    }

    public ArrayList<SupplierMachine> getSuppmachineList() {
        return suppmachineList;
    }

    public void setSuppmachineList(ArrayList<SupplierMachine> suppmachineList) {
        this.suppmachineList = suppmachineList;
    }     
    public SupplierMachine addMachine()
    {
        SupplierMachine suppMachine = new SupplierMachine();
        suppmachineList.add(suppMachine);
        return suppMachine;
              
    }
    
}
