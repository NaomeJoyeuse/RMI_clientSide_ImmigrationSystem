/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Naome
 */


public class Embassy implements Serializable {

    private Integer embassyId;
    
    private String embassyName;

    private String location;

    private Country country;

    public Embassy() {
    }

    public Embassy(Integer embassyId) {
        this.embassyId = embassyId;
    }

    public Embassy(Integer embassyId, String embassyName, String location, Country country) {
        this.embassyId = embassyId;
        this.embassyName = embassyName;
        this.location = location;
        this.country = country;
    }

    public Integer getEmbassyId() {
        return embassyId;
    }

    public void setEmbassyId(Integer embassyId) {
        this.embassyId = embassyId;
    }

    public String getEmbassyName() {
        return embassyName;
    }

    public void setEmbassyName(String embassyName) {
        this.embassyName = embassyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
   
}
