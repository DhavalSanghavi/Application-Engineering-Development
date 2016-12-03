/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ServicingOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Servicing.ServicingWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class ServicingRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ServicingWorkAreaJPanel(userProcessContainer,account,(ServicingOrganization) organization,enterprise);
    }
    @Override
    public String toString() {
        return RoleType.Servicing.getValue();
    }
    
}
