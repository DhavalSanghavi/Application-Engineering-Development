/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ExtendedClasses;

import java.util.Random;

/**
 *
 * @author Abhishek
 */
public class SupplierMachine {
    
    private int machineID;
    private String machineName;
    private static int counter=1;
    private SupplierMachinePartsDir supppMacPartsDir;
    Random randomGenerator = new Random();

    public SupplierMachine() {
        int counter = randomGenerator.nextInt(100);
        machineID = counter;
        supppMacPartsDir = new SupplierMachinePartsDir();
    }

    public int getMachineID() {
        return machineID;
    }

    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public SupplierMachinePartsDir getSupppMacPartsDir() {
        return supppMacPartsDir;
    }

    public void setSupppMacPartsDir(SupplierMachinePartsDir supppMacPartsDir) {
        this.supppMacPartsDir = supppMacPartsDir;
    }

    @Override
    public String toString() {
        return machineName;
    }
    
    
    
    
    
    
}
