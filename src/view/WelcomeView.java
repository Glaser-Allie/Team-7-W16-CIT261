/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.Player;

/**
 *
 * @author maloriegomm
 */
public class WelcomeView {
   
    public WelcomeView(){
        
    }
    
    public void displayBanner(){
        
        System.out.println("*********************************");
        System.out.println("Welcome to the City.");
        System.out.println("You wake up in a hotel room feeling lost and confused.");
        System.out.println("You don't remember how you got here or why you");
        System.out.println("are even here. Suddenly, something slams into the hotel room door.");
        System.out.println("After a short time, you hear scratching against the door.");
        System.out.println("You pick up the lamp on the nightstand and approach the door.");
        System.out.println("");
        System.out.println("Good luck!");
        System.out.println("************************************");
        
    }
    
    public String getPlayerName(){
        
        Scanner in = new Scanner(System.in);
        String name = "";
        
        while(name.length() < 2) {
            System.out.println("Please Enter Your Name:");
            name = in.nextLine();
            
            if(name.length() < 2){
                System.out.println("Please Enter a name with at least 2 characters.");
            }
        }
               
        
        return name;
    }
    
    public void displayPlayerNameBanner(Player player){
     
        System.out.println("************************************");
        System.out.println("Welcome " + player.getName() + "!");
        System.out.println("Enjoy the Game!");
        System.out.println("************************************");
    }
    
    
    
}
