/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package du_objects;

/**
 *
 * @author t.fotakis
 */
public class ses_tree_obj {

    public String uproc;
    public String type;
    public String mu;
    public String parent;
    public int pid;
    public String connection_type;

    public ses_tree_obj(String myname, String textContent, String mymu, String myparent, int myparentID, String con_type) {
        this.uproc = myname;
        this.type = textContent;
        this.mu = mymu;
        this.parent = myparent;
        this.pid = myparentID;
        this.connection_type = con_type;
    }
    
    @Override
    public String toString() {
        return "[uproc:"+this.uproc+", type:"+this.type+", mu:"+this.mu+", parent:"+this.parent+", pid:"+this.pid+"]";
    }
    
    public String toJSONString() {
        return "{\"uproc\":\""+this.uproc+"\", \"type\":\""+this.type+"\", \"mu\":\""+this.mu+"\", \"parent\":\""+this.parent+"\", \"pid\":"+this.pid+"}";
    }
    
}
