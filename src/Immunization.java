/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csstudent
 */
public class Immunization {
    private Information dim;
    private String Value;
    public Immunization(){
    }
    
    @Override
    public String toString(){
        return dim.toString() + ": " + Value + "% immunized";
    }
}
