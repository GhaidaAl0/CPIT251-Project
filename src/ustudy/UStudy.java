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
    public static void menu() {
        System.out.println("********************************************************************");
        System.out.println("****************************** UStudy ******************************");
        System.out.println("********************************************************************");
        System.out.println("1: Add Subject");
        System.out.println("2: View Subjects");
        System.out.println("3: Delete Subject");
        System.out.println("4: Edit Subject");
        System.out.println("5: Add material to a subject ");
        System.out.println("6: View Learning Material");
        System.out.println("7: Delete material of a subject ");
        System.out.println("8: Quit");
        System.out.println(" -------------------------------------------------------------------");
        System.out.print("\nChoose from the menu: ");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num; //number by user
        int id = 0; //subject ID
        ArrayList<Subject> subjects = new ArrayList<>();
        ArrayList<LearningMaterial> LM = new ArrayList<>();

        do {
            menu();
            num = input.nextInt();

            switch (num) {
                case 1: {

                    System.out.print("Enter Subject Name: ");
                    id++;
                    String subjectName = input.next();
                    Subject obj = new Subject(id, subjectName);
                    subjects.add(obj);
                    System.out.println("");
                    break;
                }
                case 2: {
                    System.out.println("\t\t\tSubjects List: ");
                    for (int i = 0; i < subjects.size(); i++) {
                        System.out.println("\t\t  ID: " + subjects.get(i).getId() + " Subject Name: " + subjects.get(i).getName());
                    }
                    System.out.println();
                    break;

                }
                case 3: {
                    System.out.print("Enter The Subject ID to Delete: ");
                    num = input.nextInt();
                    int target = searchID(num, subjects);
                    if (target >= 0) {
                        subjects.remove(target);
                        System.out.println("Subject Deleted Sucessfuly");
                    } else {
                        System.out.println("ID not found!");
                    }
                    break;

                }
                case 4: {
                    System.out.print("Enter Subject ID to Edit: ");

                    num = input.nextInt();
                    for (int i = 0; i < subjects.size(); i++) {
                        if (num == subjects.get(i).getId()) {
                            System.out.print("Enter New Subject Name: ");
                            String name = input.next();
                            subjects.get(i).setName(name);
                            System.out.println();
                        }
                    }
                    break;

                }
                case 5: {
                    System.out.print("Enter the subject ID too add material: ");
                    num = input.nextInt();
                    int materialPage;

                    int target = searchID(num, subjects);

                    if (target >= 0) {
                        int LM_ID = num * 50;
                        while (true) {
                            System.out.print("\nEnter the names of the Learning Materials... type \"stop\" to exit: ");
                            String MaterialName = input.next();

                            if (!MaterialName.equalsIgnoreCase("stop")) {
                                System.out.print("Number of page: ");
                                materialPage = input.nextInt();
                                LearningMaterial LM_obj = new LearningMaterial(num, LM_ID++, MaterialName, materialPage);
                                LM.add(LM_obj);

                            } else {
                                System.out.println("");
                                break;
                            }
                        }

                    } else {
                        System.out.println("ID not found!");
                    }
                    break;

                }
                case 6: {
                    System.out.print("Enter subject ID to view Learning Materials: ");
                    num = input.nextInt();
                    int numOfM = 0;
                    int target = searchID(num, subjects);
                    if (target >= 0) {
                        System.out.println("\n\n\t\t\tID: " + subjects.get(num - 1).getId() + " Subject Name: " + subjects.get(num - 1).getName());
                    } else {
                        System.out.println("ID not found!");
                    }
                    for (int i = 0; i < LM.size(); i++) {
                        if (num == LM.get(i).getSubID()) {
                            System.out.println((++numOfM) + "\t\tMaterial ID: mc" + LM.get(i).getID() + " Material Name: " + LM.get(i).getName());
                        }
                    }
                    System.out.println("###################################################################3\n");

                    break;
                }
                case 7: {
                    System.out.print("Enter the subject ID: ");
                    num = input.nextInt();
                    int SubTarget = searchID(num, subjects);

                    if (SubTarget >= 0) {
                        System.out.print("enter the LM ID to delete: ");
                        int LM_num = input.nextInt();
                        int LM_Target = searchLM_ID(LM_num, LM);
                        if (LM_Target >= 0) {
                            LM.remove(LM_Target);
                            System.out.println("Learning Material Deleted Sucessfuly\n");

                        } else {
                            System.out.println("Learning Material ID is not found!\n");
                        }

                    } else {
                        System.out.println("ID not found!");
                    }
                    break;
                }
                case 8:
                    System.out.println(" > Exiting...");
                    System.out.println(" > Goodbye");
                    break;
                default:
                    System.out.println();
                    System.out.println(" > Invalid choice entered! Please try again.");
                    System.out.println();
                    break;
            }
        } while (num != 8);

    }

    public static int searchID(int num, ArrayList<Subject> subjects) {
        for (int i = 0; i < subjects.size(); i++) {
            if (num == subjects.get(i).getId()) {
                return subjects.indexOf(subjects.get(i));

            }
        }
        return -1;
    }

    public static int searchLM_ID(int num, ArrayList<LearningMaterial> LM) {
        for (int i = 0; i < LM.size(); i++) {
            if (num == LM.get(i).getID()) {
                return LM.indexOf(LM.get(i));

            }
        }
        return -1;
    }

}
