/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public abstract class Role {
    
    
    public enum  RoleType{
        Admin("Admin Role"),
        Procurement("Procurement Role"),
        Departmen("Department Role"),
        Finance("Finance Role"),
        Department("Department Role"),
        Supplier("Supplier Role"),
        Delivery("Delivery Role"),
        Servicing("Servicing Role");
        
        private String value;
        private RoleType(String value)
        {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);
    
    
    @Override
    public String toString() {
        //System.out.println(this.getClass().getName());
        return this.getClass().getName();
    }
   
    
}
