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
public class PartsDirectory {
    
    private ArrayList<Parts> partList;

    public PartsDirectory() {
    
        partList = new ArrayList<>();
    }
    public Parts addParts()
    {
        Parts p = new Parts();
        partList.add(p);
        return p;
    }
    
    
}
