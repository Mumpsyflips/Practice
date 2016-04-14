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
public class PolioDataPoint implements Comparable<PolioDataPoint> {
    private PolioDataPointInfo dim;
    private Integer Value;
    
    public String getCountry() {
        return dim.getCountry();
    }
    
    public int getValue() {
        return Value;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PolioDataPoint) {
            if (((PolioDataPoint) obj).getCountry().equals(this.getCountry())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(PolioDataPoint o) {        
        String otherCountry = null;
        String thisCountry = null;
        if (this.dim != null) {
            thisCountry = this.dim.getCountry();
        }
        if (o.dim != null) {
            otherCountry = o.dim.getCountry();
        }
        if (otherCountry == null || thisCountry == null) {
            if (otherCountry == null && thisCountry == null) {
                return 0;
            } else {
                if (otherCountry == null) {
                    return -1;
                } else {
                    return 1;
                }
            }
        } else {
            return otherCountry.compareTo(thisCountry);
        }
    }
    
    @Override
    public String toString() {
        return dim.getCountry() + " in " + dim.getYear() + ": " + Value + "% immunized";
    }
}
