package com.practicalexam;

import com.practicalexam.student.Cabinet;
import util.MyToys;

/**
 *
 * @author FPT University - HCMC Java OOP Practical Exam Template
 */
public class Program {

    public static void main(String[] args) {

        // Menu here (if needed)
        // Your code here
        int choice = 0;
        Cabinet ds = new Cabinet();
        do {

            // Menu here (if needed)
            choice = menu();
            // Your code here
            switch (choice) {
                case 1: {
                    ds.add();
                    break;
                }
                case 2: {
                    ds.search();
                    break;
                }
                case 3: {
                    ds.update();
                    break;
                }
                case 4: {
                    ds.remove();
                    break;
                }
                case 5: {
                    ds.sort();
                    break;
                }

                // Other case here!!!
            }
        } while (choice > 0 && choice <6);  // Modify the condition to exit the loop!!!
    }

    public static int menu() {
        int userchoice;
        System.out.println("1.Add a pair of shoes to the list");
        System.out.println("2.Search a pair of shoes by code");
        System.out.println("3.Update a pair of shoes based on code ");
        System.out.println("4.Remove a pair of shoes by code ");
        System.out.println("5.Print the shoes list in the ascending order of model ");
        System.out.println("6.Quit");
        userchoice = MyToys.getAnInteger("Choose [1..6] to play with:", "Invalid");
        return userchoice;
    }

}
