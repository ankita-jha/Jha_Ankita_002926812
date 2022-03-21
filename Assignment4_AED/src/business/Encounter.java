/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

/**
 import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author ankitajha
 */
public class Encounter{
	VitalSign vs;
	String endatetime;

	public VitalSign getVs() {
		return vs;
	}

	public void setVs(VitalSign vs) {
		this.vs = vs;
	}

	public String getEndatetime() {
		return endatetime;
	}

	public void setEndatetime(String endatetime) {
		this.endatetime = endatetime;
	}

	 public Encounter() {
        this.vs = new VitalSign();
        this.endatetime = "02-27-2021";
    }
	@Override
    public String toString(){
        return " Encounter Datetime: "+this.endatetime +this.vs;
    }
    
}
