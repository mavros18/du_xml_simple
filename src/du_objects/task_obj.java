/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package du_objects;

import main.myBaseObject;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 *
 * @author t.fotakis
 */
public class task_obj extends myBaseObject {
    
    public String session;
    public String uproc;
    public ArrayList<String> launch;
    public String is_active;
    public String mu;
    public String template;
    public String type;
    public String isUprocHeader;
    public String queue;
    public ArrayList<String> rule;
    public String optional;
    public Integer number_of_uprocs;
    public LinkedHashMap<String,String> variables;
    
    public task_obj(String task_session, String task_uproc, ArrayList<String> task_launch, String task_active, String task_mu, String task_is_template, String task_type, String textContent,LinkedHashMap<String,String> vars,String queue,ArrayList<String> rule,String optional,String name) {
        this.session = task_session;
        this.uproc = task_uproc;
        this.launch = task_launch;
        this.is_active = task_active;
        this.mu = task_mu;
        this.template = task_is_template;
        this.type = task_type;
        this.isUprocHeader = textContent;
        this.variables = vars;
        this.queue = queue;
        this.rule = rule;
        this.optional = optional;
        
        if (name.equals("")) {
            if ("".equals(task_session)) {
                this.name = "u!" + task_uproc+"!"+task_mu;
            }
            else {
                this.name = "s!" + task_session+"!"+task_mu;
            }
        }
        else {
            this.name = name;
        }

        this.number_of_uprocs = null;
    }
    
    @Override
    public String toString() {
        String ret="[name:"+this.name+", session:"+this.session+", uproc:"+this.uproc+", mu:"+this.mu+", active:"+this.is_active+", queue:"+ this.queue +", template:"+this.template+", type:"+this.type+ ", optional:"+this.optional+", rule:"+this.rule +", isUprocHeader:"+this.isUprocHeader +", number_of_uprocs:" + this.number_of_uprocs + "]";

        return ret;
    }
    
    @Override
    public String toJSONString() {
        String ret="{\"name\":\""+this.name+"\", \"session\":\""+this.session+"\", \"uproc\":\""+this.uproc+"\", \"mu\":\""+this.mu+"\", \"active\":\""+this.is_active+"\", \"queue\":\""+ this.queue +"\", \"template\":\""+this.template+"\", \"type\":\""+this.type+ "\", \"optional\":\""+this.optional+"\", \"rule\":\""+this.rule +"\", \"isUprocHeader\":\""+this.isUprocHeader +"\", \"number_of_uprocs\":" + this.number_of_uprocs + "}";

        return ret;
    }
    
}
