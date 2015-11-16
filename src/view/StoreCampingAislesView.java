/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Maxine
 */
public class StoreCampingAislesView extends View {
    
    public StoreCampingAislesView() {
        super ("Camping Store Aisles:\n"
                + "T - Tents and canopies\n"
                + "L - Lighting\n"
                + "C - Cooking supplies\n"
                + "X - Return to Game Menu");
    }
    
    @Override
    public boolean doAction(char input) {
    
        switch(input) {
            case 'T':
                enterTentsAsle();
                break;
            case 'L':
                enterLightingAisle();
                break;
            case 'C':
                enterCookingAisle();
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please enter a valid input");
                break;
        }
        return true;
    }    

    private void enterTentsAsle() {
        System.out.println("NOT YET IMPLEMENTED");
    }

    private void enterLightingAisle() {
        System.out.println("NOT YET IMPLEMENTED");
    }

    private void enterCookingAisle() {
        System.out.println("NOT YET IMPLEMENTED");
    }
}
