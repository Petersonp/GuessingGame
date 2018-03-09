/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalguessinggame;

import java.util.Random;

/**
 *
 * @author Patrick
 */
public class Model {
    
    //GLOBAL VARIABLES
            private int random_number;
            private String status;
    void NewGame(){
        //I will create random number
        Random rand = new Random();
        random_number = rand.nextInt(100)+1;
        
        status = "Enter your first guess!";
    }
    void UserGuess(int guess){
        //Gte users guess and deploy message
        status = "Your guess, " + guess;
        if(guess> random_number)
        {
            status += ", was Too High! Guess again...";
        }else if (guess < random_number)
        {
            status += ", was Too Low! Guess again...";
        }else
        {
            status += ", was Correct!";
        }
        
    }
    String getStatus(){
        //Return string with current status
        return status;
    }
}
