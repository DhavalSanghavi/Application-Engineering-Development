/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SuppplierRole;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class SupplierOrganization extends Organization{

    public SupplierOrganization() {
        super(Type.Supplier.getValue());
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SuppplierRole());
        return roles;
    }
    
    
    
}
