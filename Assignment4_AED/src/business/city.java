/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author 16176
 */
public class city {
    String cityName;
    
    public String getcityName() {
        return cityName;
    }
    
    public void SetcityName(String cityName) {
        this.cityName = cityName;
    }
    @Override
    public String toString() {
        return "\ncity : " + this.cityName;
    
    }
        
}
   
   
    
