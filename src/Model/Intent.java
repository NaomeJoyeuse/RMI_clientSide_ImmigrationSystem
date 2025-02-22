/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;


/**
 *
 * @author Naome
 */

public class Intent implements Serializable{
private static final long serialVersionUID = -87586475674551485L;


  private Integer intentID;

    private String Description;
   private String Location;
   private String Name;
   
    private List<Immigrant> immigrants;

    public Intent() {
    }

    public Intent(Integer intentID) {
        this.intentID = intentID;
    }

    public Intent(Integer intentID, String Description, String Location, String Name, List<Immigrant> immigrants) {
        this.intentID = intentID;
        this.Description = Description;
        this.Location = Location;
        this.Name = Name;
        this.immigrants = immigrants;
    }

    public Integer getIntentID() {
        return intentID;
    }

    public void setIntentID(Integer intentID) {
        this.intentID = intentID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public List<Immigrant> getImmigrants() {
        return immigrants;
    }

    public void setImmigrants(List<Immigrant> immigrants) {
        this.immigrants = immigrants;
    }

    @Override
    public String toString() {
        return Name;
    }
    
}
