/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package du_objects;

import main.myBaseObject;

/**
 *
 * @author t.fotakis
 */
public class resource_obj extends myBaseObject {
    
    public String type;

    public resource_obj(String name, String type) {
        
        this.name = name;
        this.type = type;
    }
    
    @Override
    public String toString(){
        return "[resource:"+this.name+", type:"+this.type+"]";
    }
    
    @Override
    public String toJSONString(){
        return "{\"resource\":\""+this.name+"\", \"type\":\""+this.type+"\"}";
    }
}