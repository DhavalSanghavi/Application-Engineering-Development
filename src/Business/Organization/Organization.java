/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.ExtendedClasses.MachineDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import static java.rmi.server.LogStream.log;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Abhishek
 */
public abstract class Organization {
    
    private String name;
    private int organizationID;
    private static int counter=1;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    private MachineDirectory machineDirectory;
    private WorkQueue workQueue;
    Random randomGenerator = new Random();

    public Organization(String name) {
        this.name = name;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        machineDirectory = new MachineDirectory();
        workQueue = new WorkQueue();
         int counter = randomGenerator.nextInt(100);
        organizationID = counter;
       // ++counter;
    }
    
    
    
    
    //note a single Random object is reused here
    
    
     
      
    public enum Type{
        Admin("Admin Organization"), Department("Department Organization"), 
        Procurement("Procurement Organization"), Finance("Finance Organization"),
        Delivery("Delivery Organization"),Supplier("Supplier Organization"),
        Servicing("Servicing Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public MachineDirectory getMachineDirectory() {
        return machineDirectory;
    }

    public void setMachineDirectory(MachineDirectory machineDirectory) {
        this.machineDirectory = machineDirectory;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    
    
    

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
