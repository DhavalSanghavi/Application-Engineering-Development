/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ProcurementOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Procurement.ProcurementWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class ProcurementRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        
return new ProcurementWorkAreaJPanel(userProcessContainer,account,(ProcurementOrganization) organization,enterprise);
    
    }

    @Override
    public String toString() {
        return RoleType.Procurement.getValue();
    }
    
    
    
}
