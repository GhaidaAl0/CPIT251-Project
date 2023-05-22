/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ustudy;

/**
 *
 * @author Hanan Adel
 */
public class Subject {
    
    int id;
    String name;
    int minimumTime; //time in mintues or hours
    int progress; // progress "%" compeltion

    public Subject(int id, String name, int minimumTime, int progress) {
        this.id = id;
        this.name = name;
        this.minimumTime = minimumTime;
        this.progress = progress;
    }
    
    public Subject(int id, String name){
        this.id = id;
        this.name = name;
        this.minimumTime = 0;
        this.progress = 0;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinimumTime() {
        return minimumTime;
    }

    public void setMinimumTime(int minimumTime) {
        this.minimumTime = minimumTime;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
