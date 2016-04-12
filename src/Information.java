/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csstudent
 */
public class Information {
    private String PUBLISHSTATE;
    private String WORLDBANKINCOMEGROUP;
    private String REGION;
    private String COUNTRY;
    private String GHO;
    private String YEAR;
    public Information(){
    }
    
    @Override
    public String toString(){
        if(COUNTRY != null){
            return "\n" + COUNTRY;
        } else if(REGION != null){
            return "\n(Country in " + REGION + ")";
        } else{
            return "\n(Country unknown)";
        }
    }
}
