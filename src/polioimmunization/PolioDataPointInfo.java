/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polioimmunization;

/**
 *
 * @author dwheadon
 */
public class PolioDataPointInfo {
    private String REGION;
    private String COUNTRY;
    private int YEAR;
    private String WORLDBANKINCOMEGROUP;    
    
    public String getRegion() {
        return REGION;
    }
    public String getCountry() {
        if (COUNTRY == null) {
            return "Undefined";
        }
        return COUNTRY;
    }
    public int getYear() {
        return YEAR;
    }
    public String getIncomeGroup() {
        return WORLDBANKINCOMEGROUP;
    }
}
