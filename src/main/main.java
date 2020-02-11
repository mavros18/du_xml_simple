/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import du_objects.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author t.fotakis
 */
public class main {
    
    public static <T extends myBaseObject> T get_by_name(ArrayList<T> list_of_objects, String search_name, Boolean case_sensitive) {
        if (case_sensitive) {
            for (T obj : list_of_objects) {
                if (search_name.equals(obj.name)) {
                    return obj;
                }
            }
        }
        else {
            String name = search_name.toUpperCase();
            for (T obj : list_of_objects) {
                if (name.equals(obj.name.toUpperCase())) {
                    return obj;
                }
            }
        }
        return null;
    }
    
    public static void main(String args[]) {
        
        String nodename_regex = "[^_]+_(.*?)_X_Full_Export";
        String xml_directory = "C:\\Users\\t.fotakis\\Desktop\\exports";
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        try {
        
            System.out.println(formatter.format(new Date()) + " +--------------------- START ---------------------+\n");
            ArrayList<node_obj> du = du_xml_parser.run(xml_directory, nodename_regex);
            System.out.println("\n" + formatter.format(new Date()) + " +--------------------- FINISHED PARSING DU XML ---------------------+\n");
            
            /*
            node_obj node = get_by_name(du,"prosappl01",false);
            if (node != null) {
                uproc_obj upr = get_by_name(node.uprocs,"CHN_SAPIST_IOHS_INVOICES_XFER_GUNZIP",false);
                if (upr != null) {
                    System.out.println(upr.IS);
                }
            }
            */
        
        }
        catch (Exception ex) {
            System.err.print(ex);
        }
    }
}
