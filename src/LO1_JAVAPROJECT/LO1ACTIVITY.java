/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LO1_JAVAPROJECT;

/**
 *
 * @author Erick James Rubin
 */
public class LO1ACTIVITY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] Motors = {"AEROX 155","Sniper 150","Ducatti 1000cc","Honda Click","XRM 125"};  
        // Array 'Cars' is initialized with 5 car names
        
        System.out.println("Some list of fascinating motors: ");  
        // Prints an introductory message
        
        // Loop through each element in the 'Cars' array
        for (int i = 0; i < Motors.length; i++){  
            // Prints each car name from the array
            System.out.println(Motors[i]);
        }
    }
    
}
