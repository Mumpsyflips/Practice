/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polioimmunization;

import java.util.Arrays;
import java.util.TreeSet;

/**
 *
 * @author dwheadon
 */
public class PolioDataSet {
    private PolioDataPoint[] fact;
    
    public PolioDataPoint[] getDataPoints() {
        return fact;
    }

    void dedup() {
        TreeSet<PolioDataPoint> dpSet = new TreeSet<PolioDataPoint>();
        for (PolioDataPoint dp : fact) {
            dpSet.add(dp);
        }
        Object[] dedupedObjs = dpSet.toArray();
        fact = Arrays.copyOf(dedupedObjs, dedupedObjs.length, PolioDataPoint[].class);
    }
}
