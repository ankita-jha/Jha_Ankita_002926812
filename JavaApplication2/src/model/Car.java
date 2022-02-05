/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.beans.PropertyChangeSupport;

/**
 *
 * @author ankitajha
 */
public class Car {
    private String brand;
	private String model;
	private String color;
	private int year;
	private int engineNo;
	private int seatsNumber;
	private String licensePlates;
	private String ownerName;
	private long ownerTelephoneNumber;
	private String ownerEmailAddresses;
	private String ownerDriverLicense;
	private String ownerSocialSecurityNumber;
	private String ownerAddress;
	private int service_records;
	private int warrantyYear;

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        java.lang.String oldBrand = this.brand;
        this.brand = brand;
        propertyChangeSupport.firePropertyChange(PROP_BRAND, oldBrand, brand);
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        java.lang.String oldModel = this.model;
        this.model = model;
        propertyChangeSupport.firePropertyChange(PROP_MODEL, oldModel, model);
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        java.lang.String oldColor = this.color;
        this.color = color;
        propertyChangeSupport.firePropertyChange(PROP_COLOR, oldColor, color);
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        int oldYear = this.year;
        this.year = year;
        propertyChangeSupport.firePropertyChange(PROP_YEAR, oldYear, year);
    }

    /**
     * @return the engineNo
     */
    public int getEngineNo() {
        return engineNo;
    }

    /**
     * @param engineNo the engineNo to set
     */
    public void setEngineNo(int engineNo) {
        int oldEngineNo = this.engineNo;
        this.engineNo = engineNo;
        propertyChangeSupport.firePropertyChange(PROP_ENGINENO, oldEngineNo, engineNo);
    }

    /**
     * @return the seatsNumber
     */
    public int getSeatsNumber() {
        return seatsNumber;
    }

    /**
     * @param seatsNumber the seatsNumber to set
     */
    public void setSeatsNumber(int seatsNumber) {
        int oldSeatsNumber = this.seatsNumber;
        this.seatsNumber = seatsNumber;
        propertyChangeSupport.firePropertyChange(PROP_SEATSNUMBER, oldSeatsNumber, seatsNumber);
    }

    /**
     * @return the licensePlates
     */
    public String getLicensePlates() {
        return licensePlates;
    }

    /**
     * @param licensePlates the licensePlates to set
     */
    public void setLicensePlates(String licensePlates) {
        java.lang.String oldLicensePlates = this.licensePlates;
        this.licensePlates = licensePlates;
        propertyChangeSupport.firePropertyChange(PROP_LICENSEPLATES, oldLicensePlates, licensePlates);
    }

    /**
     * @return the ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @param ownerName the ownerName to set
     */
    public void setOwnerName(String ownerName) {
        java.lang.String oldOwnerName = this.ownerName;
        this.ownerName = ownerName;
        propertyChangeSupport.firePropertyChange(PROP_OWNERNAME, oldOwnerName, ownerName);
    }

    /**
     * @return the ownerTelephoneNumber
     */
    public long getOwnerTelephoneNumber() {
        return ownerTelephoneNumber;
    }

    /**
     * @param ownerTelephoneNumber the ownerTelephoneNumber to set
     */
    public void setOwnerTelephoneNumber(long ownerTelephoneNumber) {
        long oldOwnerTelephoneNumber = this.ownerTelephoneNumber;
        this.ownerTelephoneNumber = ownerTelephoneNumber;
        propertyChangeSupport.firePropertyChange(PROP_OWNERTELEPHONENUMBER, oldOwnerTelephoneNumber, ownerTelephoneNumber);
    }

    /**
     * @return the ownerEmailAddresses
     */
    public String getOwnerEmailAddresses() {
        return ownerEmailAddresses;
    }

    /**
     * @param ownerEmailAddresses the ownerEmailAddresses to set
     */
    public void setOwnerEmailAddresses(String ownerEmailAddresses) {
        java.lang.String oldOwnerEmailAddresses = this.ownerEmailAddresses;
        this.ownerEmailAddresses = ownerEmailAddresses;
        propertyChangeSupport.firePropertyChange(PROP_OWNEREMAILADDRESSES, oldOwnerEmailAddresses, ownerEmailAddresses);
    }

    /**
     * @return the ownerDriverLicense
     */
    public String getOwnerDriverLicense() {
        return ownerDriverLicense;
    }

    /**
     * @param ownerDriverLicense the ownerDriverLicense to set
     */
    public void setOwnerDriverLicense(String ownerDriverLicense) {
        java.lang.String oldOwnerDriverLicense = this.ownerDriverLicense;
        this.ownerDriverLicense = ownerDriverLicense;
        propertyChangeSupport.firePropertyChange(PROP_OWNERDRIVERLICENSE, oldOwnerDriverLicense, ownerDriverLicense);
    }

    /**
     * @return the ownerSocialSecurityNumber
     */
    public String getOwnerSocialSecurityNumber() {
        return ownerSocialSecurityNumber;
    }

    /**
     * @param ownerSocialSecurityNumber the ownerSocialSecurityNumber to set
     */
    public void setOwnerSocialSecurityNumber(String ownerSocialSecurityNumber) {
        java.lang.String oldOwnerSocialSecurityNumber = this.ownerSocialSecurityNumber;
        this.ownerSocialSecurityNumber = ownerSocialSecurityNumber;
        propertyChangeSupport.firePropertyChange(PROP_OWNERSOCIALSECURITYNUMBER, oldOwnerSocialSecurityNumber, ownerSocialSecurityNumber);
    }

    /**
     * @return the ownerAddress
     */
    public String getOwnerAddress() {
        return ownerAddress;
    }

    /**
     * @param ownerAddress the ownerAddress to set
     */
    public void setOwnerAddress(String ownerAddress) {
        java.lang.String oldOwnerAddress = this.ownerAddress;
        this.ownerAddress = ownerAddress;
        propertyChangeSupport.firePropertyChange(PROP_OWNERADDRESS, oldOwnerAddress, ownerAddress);
    }

    /**
     * @return the service_records
     */
    public int getService_records() {
        return service_records;
    }

    /**
     * @param service_records the service_records to set
     */
    public void setService_records(int service_records) {
        int oldService_records = this.service_records;
        this.service_records = service_records;
        propertyChangeSupport.firePropertyChange(PROP_SERVICE_RECORDS, oldService_records, service_records);
    }

    /**
     * @return the warrantyYear
     */
    public int getWarrantyYear() {
        return warrantyYear;
    }

    /**
     * @param warrantyYear the warrantyYear to set
     */
    public void setWarrantyYear(int warrantyYear) {
        int oldWarrantyYear = this.warrantyYear;
        this.warrantyYear = warrantyYear;
        propertyChangeSupport.firePropertyChange(PROP_WARRANTYYEAR, oldWarrantyYear, warrantyYear);
    }
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    public static final String PROP_BRAND = "brand";
    public static final String PROP_MODEL = "model";
    public static final String PROP_COLOR = "color";
    public static final String PROP_YEAR = "year";
    public static final String PROP_ENGINENO = "engineNo";
    public static final String PROP_SEATSNUMBER = "seatsNumber";
    public static final String PROP_LICENSEPLATES = "licensePlates";
    public static final String PROP_OWNERNAME = "ownerName";
    public static final String PROP_OWNERTELEPHONENUMBER = "ownerTelephoneNumber";
    public static final String PROP_OWNEREMAILADDRESSES = "ownerEmailAddresses";
    public static final String PROP_OWNERDRIVERLICENSE = "ownerDriverLicense";
    public static final String PROP_OWNERSOCIALSECURITYNUMBER = "ownerSocialSecurityNumber";
    public static final String PROP_OWNERADDRESS = "ownerAddress";
    public static final String PROP_SERVICE_RECORDS = "service_records";
    public static final String PROP_WARRANTYYEAR = "warrantyYear";
    
}
