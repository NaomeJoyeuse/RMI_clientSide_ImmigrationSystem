/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Naome
 */

public class Country implements Serializable{
 private static final long serialVersionUID = -8909200136158953123L;

    private Integer countryId;

    private String name;
    private String city;
     
    private List<Immigrant> immigrants =new ArrayList<>();

  
//    private List<Visa> visas =new ArrayList<>();
private Embassy embassy;
    public Country() {
    }

    public Country(Integer countryId) {
        this.countryId = countryId;
    }

    public Country(Integer countryId, String name, String city, Embassy embassy) {
        this.countryId = countryId;
        this.name = name;
        this.city = city;
        this.embassy = embassy;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Immigrant> getImmigrants() {
        return immigrants;
    }

    public void setImmigrants(List<Immigrant> immigrants) {
        this.immigrants = immigrants;
    }

    public Embassy getEmbassy() {
        return embassy;
    }

    public void setEmbassy(Embassy embassy) {
        this.embassy = embassy;
    }
  @Override
    public String toString() {
        return name;
    }
    
}
