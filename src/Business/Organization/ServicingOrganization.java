/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.ServicingRole;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class ServicingOrganization extends Organization{

    public ServicingOrganization() {
        super(Type.Servicing.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ServicingRole()
        );
        return roles;
    }
    
    
}
