/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

/**
 *
 * @author ankitajha
 */
public class ServiceRecord {
    private ArrayList<Car> serviceRecord;
    public ServiceRecord(){
        this.serviceRecord=new ArrayList<Car>();
    }

    /**
     * @return the serviceRecord
     */
    public ArrayList<Car> getServiceRecord() {
        return serviceRecord;
    }

    /**
     * @param serviceRecord the serviceRecord to set
     */
    public void setServiceRecord(ArrayList<Car> serviceRecord) {
        java.util.ArrayList<model.Car> oldServiceRecord = this.serviceRecord;
        this.serviceRecord = serviceRecord;
        propertyChangeSupport.firePropertyChange(PROP_SERVICERECORD, oldServiceRecord, serviceRecord);
    }
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    public static final String PROP_SERVICERECORD = "serviceRecord";
    
}
