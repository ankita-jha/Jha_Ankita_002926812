package business;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ankitajha
 */
public class VitalSignHistory {
      private ArrayList<VitalSign> vitalSignHistory;
    private Iterable<VitalSign> vitalSignList;
    private ArrayList<VitalSign> history;
   
    public VitalSignHistory() {
        history = new ArrayList<>();
 
        vitalSignHistory = new ArrayList<VitalSign>();
    
    }
    
    public ArrayList<VitalSign> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<VitalSign> history) {
        this.history = history;
    }
    
    public VitalSign createAndAddVitalSign() {
        VitalSign vitalSign = new VitalSign();
        history.add(vitalSign);
        return vitalSign;
    }
    
    public void deleteVitalSign(VitalSign vitalSign) {
        history.remove(vitalSign);
    }
    
    
    public List<VitalSign> getAbnormalList(double maxbp, double minbp){
         List<VitalSign> abnList = new ArrayList<>();
         
         for (VitalSign vs : this.getVitalSignHistory())
         {
             
             if(vs.getBloodPressure()>maxbp || vs.getBloodPressure()<minbp)
             {
                 abnList.add(vs);
              
             }
         }
         return abnList;
     }    
    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }
    public void setVitalSignHistory(ArrayList<VitalSign> VitalSignHistory) {
        this.vitalSignHistory = VitalSignHistory;
    }
     public void deleteVitals(VitalSign V)
    {
        vitalSignHistory.remove(V);
    }
}
