/*
 *  First lab: Review of Random class, Input through JOptionPanes,
 *  Icon Images, and Program Loops
 *  Bishwash Khadka
 *  01/20/2023
 */

import javax.swing.*;
import java.util.*;

public class ChooseAprize 
{
    public ChooseAprize()
    {   //All the information and Options for the Program
        String[] islands = { "Bermuda", "Bahama", "Jamaica", "Aruba", 
                             "Martinique", "Antigua" };
        String[] activities = {"parasailing","surfing", "snorkeling", 
                     "DeepSeaFishing", "sailBoarding", "sharkSpotting", 
                     "JetSkiing","scubaing", "shipwreck"};
        String[] options = {"Find Another Activity", "Quit"};
        String[] prompt_intromsg = {"""
                                    This Program will select random activity
                                    such as parasailing, sailBoarding and so on 
                                    for the user on a random island
                                    such as Bahama or Aruba
                                    
                                    Click Okay to Continue"""};
        String prompt_endmsg = """
                                  Have Fun with the Games
                                  on the Beautiful Island!!!""";
        int choice = 0;
        Random randGen = new Random();
        
        //Image location for the Icons
        String imageEnd = "Trip.png";
        ImageIcon IconEnd = new ImageIcon(getClass().getClassLoader().getResource(imageEnd));
        System.out.print(IconEnd);
        String imageStart = "prize.png";
        ImageIcon IconStart = new ImageIcon(getClass().getClassLoader().getResource(imageStart));
        
        //Intro Screen to tell the use of the Program
        JOptionPane.showMessageDialog(null, prompt_intromsg, "The Prize Game Hosted by Bishwash",
                                        JOptionPane.PLAIN_MESSAGE, IconStart);
        
        //do while loop to loop the program until the user is satisfied
        do{
            int island = randGen.nextInt(islands.length);
            int activity = randGen.nextInt(activities.length);
            String text = "\n<html><h1> on "+islands[island]+"</h1>";
            String activityFile =activities[activity]+".png";
            ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(activityFile));
            //Main Screen of the Program
            choice = JOptionPane.showOptionDialog(null, text,
                                    "The Prize Game Hosted by Bishwash",
                                    0, 1, icon, options, options[0]);
        }while (choice == 0);
        
        //Program Termination Message for the Program using JOptionPane
        JOptionPane.showMessageDialog(null, prompt_endmsg, "The Program Has Been Terminated!!!",
                                        JOptionPane.PLAIN_MESSAGE, IconEnd);   
    }
    //Main method 
    public static void main(String[] args) {
        ChooseAprize mainInterferance = new ChooseAprize();
    }
}
