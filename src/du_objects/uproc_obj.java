/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package du_objects;

import main.myBaseObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 *
 * @author t.fotakis
 */
public class uproc_obj extends myBaseObject {
    
    public ArrayList<dep_obj> notsim;
    public ArrayList<dep_obj> dependencies;
    public ArrayList<String> IS;
    public String myclass;
    public ArrayList<String> incompatibilities;
    public ArrayList<String> successors;
    public ArrayList<resource_obj> resources;
    public LinkedHashMap<String, String> variables;
    
    public uproc_obj() {
        this.name = "";
        this.notsim = new ArrayList<>();
        this.dependencies = new ArrayList<>();
        this.IS = new ArrayList<>();
        this.myclass = "";
        this.incompatibilities = new ArrayList<>();
        this.successors = new ArrayList<>();
        this.resources = new ArrayList<>();
        this.variables = new LinkedHashMap<>();
    }
    
    @Override
    public String toString() {
        String ret="[name:"+this.name+", class:"+this.myclass;
        ret+=", incompatibilities:[";
        for (Iterator<String> it = this.incompatibilities.iterator(); it.hasNext();) {
            String con1 = it.next();
            ret+="[class:"+con1+"]";
            if (it.hasNext()) {
                ret+=", ";
            }
        }
        ret+="], successors:[";
        for (Iterator<String> it = this.successors.iterator(); it.hasNext();) {
            String con1 = it.next();
            ret+="[uproc:"+con1+"]";
            if (it.hasNext()) {
                ret+=", ";
            }
        }
        ret+="], resources:[";
        for (Iterator<resource_obj> it = this.resources.iterator(); it.hasNext();) {
            resource_obj con1 = it.next();
            ret+=con1;
            if (it.hasNext()) {
                ret+=", ";
            }
        }
        ret+="], notsim:[";
        for (Iterator<dep_obj> it = this.notsim.iterator(); it.hasNext();) {
            dep_obj con1 = it.next();
            ret+=con1;
            if (it.hasNext()) {
                ret+=", ";
            }
        }
        ret+="], dependencies:[";
        for (Iterator<dep_obj> it = this.dependencies.iterator(); it.hasNext();) {
            dep_obj con1 = it.next();
            ret+=con1;
            if (it.hasNext()) {
                ret+=", ";
            }
        }
        ret+="], variables:[";
        Set<String> itk = this.variables.keySet();
        
        for (Iterator iter = itk.iterator(); iter.hasNext();) {
            String key = (String) iter.next();
            ret+="[variable:"+key+", value:"+this.variables.get(key)+"]";
            if (iter.hasNext()) {
                ret+=", ";
            }
        }
        ret+="]";
        return ret;

    }
    
    @Override
    public String toJSONString() {
        String ret="{\"name\":\""+this.name+"\", \"class\":\""+this.myclass+"\"";
        ret+=", \"incompatibilities\":[";
        for (Iterator<String> it = this.incompatibilities.iterator(); it.hasNext();) {
            String con1 = it.next();
            ret+="{\"class\":\""+con1+"\"}";
            if (it.hasNext()) {
                ret+=", ";
            }
        }
        ret+="], \"successors\":[";
        for (Iterator<String> it = this.successors.iterator(); it.hasNext();) {
            String con1 = it.next();
            ret+="{\"uproc\":\""+con1+"\"}";
            if (it.hasNext()) {
                ret+=", ";
            }
        }
        ret+="], \"resources\":[";
        for (Iterator<resource_obj> it = this.resources.iterator(); it.hasNext();) {
            resource_obj con1 = it.next();
            ret+=con1.toJSONString();
            if (it.hasNext()) {
                ret+=", ";
            }
        }
        ret+="], \"notsim\":[";
        for (Iterator<dep_obj> it = this.notsim.iterator(); it.hasNext();) {
            dep_obj con1 = it.next();
            ret+=con1.toJSONString();
            if (it.hasNext()) {
                ret+=", ";
            }
        }
        ret+="], \"dependencies\":[";
        for (Iterator<dep_obj> it = this.dependencies.iterator(); it.hasNext();) {
            dep_obj con1 = it.next();
            ret+=con1.toJSONString();
            if (it.hasNext()) {
                ret+=", ";
            }
        }
        ret+="], \"variables\":[";
        Set<String> itk = this.variables.keySet();
        
        for (Iterator iter = itk.iterator(); iter.hasNext();) {
            String key = (String) iter.next();
            ret+="{\"variable\":\""+key+"\", \"value\":\""+this.variables.get(key)+"\"}";
            if (iter.hasNext()) {
                ret+=", ";
            }
        }
        ret+="]}";
        return ret;

    }
}
