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
public class Machine {
    private int machineID;
    private String machineName;
    private String machineDetails;
    private Sensor sensorData;
    private PartsDirectory partsDir;
    private static int counter=1;
    Random randomGenerator = new Random();
    private boolean  isRequestSent = false;

    public Machine() {
    partsDir = new PartsDirectory();
    sensorData = new Sensor();
    int counter = randomGenerator.nextInt(100);
    machineID = counter;
    }

    public int getMachineID() {
        return machineID;
    }

    public boolean isIsRequestSent() {
        return isRequestSent;
    }

    public void setIsRequestSent(boolean isRequestSent) {
        this.isRequestSent = isRequestSent;
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

    public String getMachineDetails() {
        return machineDetails;
    }

    public void setMachineDetails(String machineDetails) {
        this.machineDetails = machineDetails;
    }

    public Sensor getSensorData() {
        return sensorData;
    }

    public void setSensorData(Sensor sensorData) {
        this.sensorData = sensorData;
    }

    public PartsDirectory getPartsDir() {
        return partsDir;
    }

    public void setPartsDir(PartsDirectory partsDir) {
        this.partsDir = partsDir;
    }

    @Override
    public String toString() {
        return machineName;
    }
    
    
    
    
}
