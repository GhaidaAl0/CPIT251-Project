/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ustudy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hanan Adel
 */
public class UStudy {

    /**
     * @param args the command line arguments
     */
    public static void menu(){
        System.out.println("---- Menu ----");
        System.out.println("1: Add Subject");
        System.out.println("2: View Subjects");
        System.out.println("3: Delete Subject");
        System.out.println("4: Edit Subject");
        System.out.println("5: Quit");
        System.out.print("\nChoose from the menu: ");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num; //number by user
        int id = 0; //subject ID
        ArrayList<Subject> subjects = new ArrayList<>();
        do{
            menu();
            num = input.nextInt();
            
            switch(num){
                case 1: {
                    
                    System.out.print("Enter Subject Name: ");
                    id++;
                    String subjectName = input.next();
                    Subject obj = new Subject(id,subjectName);
                    subjects.add(obj);
                    break;
                }
                case 2:{
                    System.out.println("Subjects List: ");
                    for (int i = 0; i < subjects.size(); i++) {
                        System.out.println("ID: "+ subjects.get(i).getId() + " Subject Name: "+ subjects.get(i).getName());
                    }
                    break;
                    
                }
                case 3: {
                    System.out.print("Enter The Subject ID to Delete: ");
                    num = input.nextInt();
                    boolean found = false;
                    for (int i = 0; i < subjects.size(); i++) {
                        if(num == subjects.get(i).getId()){
                           found = true;
                           subjects.remove(i); 
                           System.out.println("Subject Deleted Sucessfuly");
                        }
                    }
                    if(!found){
                        System.out.println("ID not found!");
                    }
                    break;
                   
                }
                case 4: {
                    System.out.print("Enter Subject ID to Edit: ");
                    
                    num = input.nextInt();
                    for (int i = 0; i < subjects.size(); i++) {
                        if(num == subjects.get(i).getId()){
                           System.out.print("Enter New Subject Name: ");
                           String name = input.next();
                           subjects.get(i).setName(name); 
                        }
                    }
                    break;
                    
                }
                case 5: break;
            }
        } while(num != 5);
        
    }
    
}
