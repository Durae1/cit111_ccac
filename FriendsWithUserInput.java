/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components.comp1_languagecore.lc3_controlOfFlow.friends;

import java.util.Scanner;

/**
 *
 * @author christopher.lewis
 */
public class FriendsWithUserInput {

    public static void main(String[] args) {
        System.out.println("Can we be friends?");

        int responseCars;
        int responseLs;
        int responseRwd;        
        int responseDrift;
        int compScore = 0;

        System.out.println("Q1/4 Do you like japanese cars? (0 = no, 1 = yes)");

        Scanner keyboardReader = new Scanner(System.in);
        responseCars = keyboardReader.nextInt();
        System.out.println("Would you ls swap a japanese car? (0 = no, 1 = yes)");
        responseLs = keyboardReader.nextInt();
        System.out.println("Do you like rwd cars? (0 = no, 1 = yes)");
        responseRwd = keyboardReader.nextInt();
        System.out.println("Is drifting a good time? (0 = no, 1 = yes)");
        responseDrift = keyboardReader.nextInt();
      

        if (responseCars == 1) {
            compScore = compScore + 10;

            System.out.println("Your compatibility score is: " + compScore);
        } else {
            System.out.println("... You must like junk cars!");
        }
        System.out.println("*****************");
        System.out.println("Final Friend Determination");
        System.out.println("*****************");

        if (compScore > 5) {
            System.out.println("Based on our compatibility score, we might\n"
                    + "indeed make good friends");

        } else {
            System.out.println("Yikes, according to my \ndecision tree,"
                    + "we probably wouldn't make good friends.");

        }// end of if/else block

    }// close main

}// close class

