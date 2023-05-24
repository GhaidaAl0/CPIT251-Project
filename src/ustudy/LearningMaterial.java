/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ustudy;

/**
 *
 * @author PC
 */
public class LearningMaterial {
    int ID;
    String name;
    String status;
    int page_number;
    int subID;

    public LearningMaterial(int subID, int ID, String name, String status, int page_number) {
       this.subID = subID;
        this.ID = ID;
        this.name = name;
        this.status = status;
        this.page_number = page_number;
    }

    public LearningMaterial(int subID,int ID, String name, int page_number ) {
         this.subID = subID;
         this.ID = ID;
        this.name = name;
        this.page_number = page_number;
       
    }
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPage_number() {
        return page_number;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }

    public int getSubID() {
        return subID;
    }

    public void setSubID(int subID) {
        this.subID = subID;
    }
    
    
    
    
}
