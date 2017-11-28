/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.uib.pathwaymatcher.model;

/**
 *
 * @author Luis Francisco Hernández Sánchez
 */
public class Pathway {
    public String stId;
    public String displayName;
    
    public Pathway(String id, String name) {
        this.stId = id;
        this.displayName = name;
    }
    
    @Override
    public String toString(){
        return this.stId + "," + this.displayName;
    }
}
