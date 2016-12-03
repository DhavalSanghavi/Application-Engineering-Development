/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FinanceRole;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
    
    organizationList = new ArrayList<>();
    }
    
    public Organization createOrganization(Organization.Type type)
    {
        Organization organization = null;
        if(type.getValue().equals(Organization.Type.Department.getValue()))
        {
            organization =  new DepartmentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Procurement.getValue())){
            organization = new ProcurementOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Finance.getValue())){
            organization = new FinanceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Supplier.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Delivery.getValue())){
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Servicing.getValue())){
            organization = new ServicingOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
    
    
}
