/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csstudent
 */
public class Dataset {
    private Legend[] dimension;
    private Immunization[] fact;
    public Dataset(Immunization[] fact){
        this.fact = fact;
    }
    
    @Override
    public String toString(){
        String allStrings = "";
        for(Immunization i : fact){
            allStrings += i.toString() + "\n";
        }
        return allStrings;
    }
}
