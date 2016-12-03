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
public class MachineDirectory {
    public ArrayList<Machine>  machineList;

    public MachineDirectory() {
        machineList = new ArrayList<>();
    }

    public ArrayList<Machine> getMachineList() {
        return machineList;
    }

    public void setMachineList(ArrayList<Machine> machineList) {
        this.machineList = machineList;
    }
    
    public Machine addMachine()
    {
        Machine machine = new Machine();
        machineList.add(machine);
        return machine;
              
    }
    
    
    
    
}
