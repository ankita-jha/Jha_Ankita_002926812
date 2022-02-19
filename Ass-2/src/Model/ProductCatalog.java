/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
//import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hp
 */
public class ProductCatalog {
    private ArrayList<Product> uberList;
    private ArrayList<Product> templist;
    
    //private Timestamp lastUpdated;  
    
    public ProductCatalog(){
        this.uberList = new ArrayList<Product>();
        
        
        Product uber1 = new Product ("BMW", 2015, 2, 5, 1, "B1", "JP", true, false);
        Product uber2 = new Product ("TESLA", 2016, 1, 4, 2, "TE1", "BOSTON", true, true);
        Product uber3 = new Product ("AUDI", 2017, 2, 6, 3, "A1", "NEW YORK", false, false);
        Product uber4 = new Product ("TOYOTA", 2014, 3, 5, 4, "TO1", "ARLINGTON", false, true);
        Product uber5 = new Product ("TATA", 2018, 2, 6, 5, "TA1", "WORCESTER", true, true);
        Product uber6 = new Product ("SUZUKI", 2012, 2, 7, 6, "SU1", "PUNE", false, false);
        Product uber7 = new Product ("MAHINDRA", 2011, 2, 8, 7, "MA1", "MUMBAI", true, false);
        Product uber8 = new Product ("MAHINDRA", 2011, 2, 5, 8, "MA2", "MUMBAI", true, true);
        Product uber9 = new Product ("IMPALA", 2014, 1, 4, 9, "IM1", "DALLAS", true, false);
        Product uber10 = new Product ("TESLA", 2011, 2, 5, 10, "TE2", "MUMBAI", true, true);
        Product uber11 = new Product ("MAXX", 2011, 2, 6, 11, "MX1", "MUMBAI", true, false);
        Product uber12 = new Product ("BMW", 2011, 2, 7, 12, "MB2", "MUMBAI", false, false);
        Product uber13 = new Product ("AUDI", 2012, 2, 4, 13, "A1", "MUMBAI", false, true);
        Product uber14 = new Product ("BMW", 2014, 2, 9, 14, "B1", "MUMBAI", true, false);
        Product uber15 = new Product ("TATA", 2016, 2, 5, 15, "TA1", "MUMBAI", true, false);
        
        
        uberList.add(uber1);
        uberList.add(uber2);
        uberList.add(uber3);
        uberList.add(uber4);
        uberList.add(uber5);
        uberList.add(uber6);
        uberList.add(uber7);
        uberList.add(uber8);
        uberList.add(uber9);
        uberList.add(uber10);
        uberList.add(uber11);
        uberList.add(uber12);
        uberList.add(uber13);
        uberList.add(uber14);
        uberList.add(uber15);
        
        
       /* Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        this.lastUpdated = timestamp ;
    }

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
        */
    }

    public ArrayList<Product> getUberList() {
        return uberList;
    }

    public void setUberList(ArrayList<Product> uberList) {
        this.uberList = uberList;
    }
    
    public Product addUber()
    {
        Product uber = new Product();
        uberList.add(uber);
        return uber;
    }
    
    public void deleteUber (Product uber)
    {
        uberList.remove(uber);
    }
    public ArrayList<Product>searchBrand (String brandName ){
        templist = new ArrayList<Product>();
        for(Product uber : uberList){
            if (uber.getBrand().equalsIgnoreCase(brandName)){
                templist.add(uber);
            }
        }
        return templist;
        
    }
    
    public ArrayList<Product>searchBrand1 (String brandName1, ArrayList<Product> result ){
        templist = new ArrayList<Product>();
        for(Product uber : result){
            if (uber.getBrand().equalsIgnoreCase(brandName1)){
                templist.add(uber);
            }
        }
        return templist;
        
    }
    

     public ArrayList<Product>searchManuYear (String manuYear, ArrayList<Product> result){
        templist = new ArrayList<Product>();
        for(Product uber : result){
            if (uber.getManufacturedYear()== Integer.parseInt(manuYear))
                    {
                templist.add(uber);
            }
        }
        return templist;
    }
     public ArrayList<Product>searchSeatsAvail (int minSeats, int maxSeats, ArrayList<Product> result){
        templist = new ArrayList<Product>();
       
        for (Product uber : result) {
           if (minSeats <= uber.getMinSeats() && maxSeats >= uber.getMaxSeats())
           {
               templist.add(uber);
           }
       
       }
        return templist;
    }
     
    

      public ArrayList<Product>searchSerialNumber (String serialNumber, ArrayList<Product> result){
        templist = new ArrayList<Product>();
        for(Product uber : result){
            if (uber.getSerialNumber()== Integer.parseInt(serialNumber))
                    {
                templist.add(uber);
            }
        }
        return templist;
    }
      public ArrayList<Product>searchModelNumber (String modelNumber, ArrayList<Product> result){
        templist = new ArrayList<Product>();
        for(Product uber : result){
            if (uber.getModelNumber().equalsIgnoreCase(modelNumber)){
                templist.add(uber);
            }
        }
        return templist;
    }
      public ArrayList<Product>searchAvailCity (String availCity, ArrayList<Product> result){
        templist = new ArrayList<Product>();
        for(Product uber : result){
            if (uber.getAvailableCity().equalsIgnoreCase(availCity)){
                templist.add(uber);
            }
        }
        return templist;
    }
      public ArrayList<Product>searchAvailStatus (String availStatus, ArrayList<Product> result){
        templist = new ArrayList<Product>();
        for(Product uber : result){
            if (uber.isAvailable() == Boolean.parseBoolean(availStatus)){
                templist.add(uber);
            }
        }
        return templist;
    }
      public ArrayList<Product> searchFirstAvailUber (String firstAvailUber, ArrayList<Product> result){
          templist = new ArrayList<Product>();
          for (Product uber : result){
              if (uber.isAvailable() == true){
                  templist.add(uber);
                  break;
              }
          }
          return templist;
      }
      public ArrayList<Product>searchMainCerti (String mainCerti, ArrayList<Product> result){
        templist = new ArrayList<Product>();
        for(Product uber : result){
            if (uber.isMaintainanceCerti() == Boolean.parseBoolean(mainCerti)){
                templist.add(uber);
            }
        }
        return templist;
    }
      
   }
    
    

