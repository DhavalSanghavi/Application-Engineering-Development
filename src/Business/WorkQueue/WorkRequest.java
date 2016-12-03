/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.ExtendedClasses.Machine;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Abhishek
 */
public abstract class WorkRequest {
    
    
    //For Finance
    private String statusforFin;
    private Date procuredDate;
    private String msgforFin;
    
    //for Procurement
    
    //for Servicing
    private String statusforServicing;
    private String msgforServicing;
    
    private String msgforDept;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    //private UserAccount originator;
   //private Organization originatorOrg;
    private UserAccount currentOwner;
    private Organization CurrentOwnerOrganzation;
    private Organization org;
    private Organization receiverOrg;
    private String status;
    private String SensorStatusOld;
    private Date requestDate;
    private Date resolveDate;
    private Machine machine;
    private int WorkRequestId;
    private static int count =1;
    private int totalPrice;
    
    Random randomGenerator = new Random(); 

    public WorkRequest() {
    requestDate =  new Date();
    int counter = randomGenerator.nextInt(100);
        WorkRequestId = counter;
    }

    public String getSensorStatusOld() {
        return SensorStatusOld;
    }

    public void setSensorStatusOld(String SensorStatusOld) {
        this.SensorStatusOld = SensorStatusOld;
    }
    
    

    public String getMsgforDept() {
        return msgforDept;
    }

    public void setMsgforDept(String msgforDept) {
        this.msgforDept = msgforDept;
    }

    public String getMsgforFin() {
        return msgforFin;
    }

    public void setMsgforFin(String msgforFin) {
        this.msgforFin = msgforFin;
    }

    public String getMsgforServicing() {
        return msgforServicing;
    }

    public void setMsgforServicing(String msgforServicing) {
        this.msgforServicing = msgforServicing;
    }
    
    

    public Date getProcuredDate() {
        return procuredDate;
    }

    public void setProcuredDate(Date procuredDate) {
        this.procuredDate = procuredDate;
    }

    public String getStatusforServicing() {
        return statusforServicing;
    }

    public void setStatusforServicing(String statusforServicing) {
        this.statusforServicing = statusforServicing;
    }

    
    public Organization getCurrentOwnerOrganzation() {
        return CurrentOwnerOrganzation;
    }

    public void setCurrentOwnerOrganzation(Organization CurrentOwnerOrganzation) {
        this.CurrentOwnerOrganzation = CurrentOwnerOrganzation;
    }

    public String getStatusforFin() {
        return statusforFin;
    }

    public void setStatusforFin(String statusforFin) {
        this.statusforFin = statusforFin;
    }
    
    

    public UserAccount getCurrentOwner() {
        return currentOwner;
    }

    public void setCurrentOwner(UserAccount currentOwner) {
        this.currentOwner = currentOwner;
    }

    public Random getRandomGenerator() {
        return randomGenerator;
    }

    public void setRandomGenerator(Random randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    
    /*public UserAccount getOriginator() {
        return originator;
    }

    public void setOriginator(UserAccount originator) {
        this.originator = originator;
    }*/

    /*public Organization getOriginatorOrg() {
        return originatorOrg;
    }

    public void setOriginatorOrg(Organization originatorOrg) {
        this.originatorOrg = originatorOrg;
    }*/

    

    public int getWorkRequestId() {
        return WorkRequestId;
    }

    public void setWorkRequestId(int WorkRequestId) {
        this.WorkRequestId = WorkRequestId;
    }
    
    

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    
    public Organization getReceiverOrg() {
        return receiverOrg;
    }

    public void setReceiverOrg(Organization receiverOrg) {
        this.receiverOrg = receiverOrg;
    }
    
    

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    @Override
    public String toString() {
        return message;
    }
    
    
    
    
    
    
}
