/*
 *Gavin Scott
Choose your own adventure game
October the somethingth 2018
 */

package chooseyourownadventure;

/**
 *
 * @author gasco1246
 */
import java.util.Scanner;
public class ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        String name, mcInput ;
        
        
        Scanner keyInput = new Scanner(System.in);
        
        System.out.println("Hello, this is a choose your own adventure game.");
        System.out.println("In order to make decisions you need a name.");
        System.out.println("What is your name?\n");
        
        name = keyInput.nextLine();
        
        System.out.println("Welcome "+name+". That is the name of a true insurgent.\n");
        
        System.out.println("Insurgencies do not come easy.  But, you must start somewhere.\n");
        
                System.out.println("Your story of glorious revolution begins in a humble downtown bar...");
            System.out.println("You walk inside.  It smells distinctly like cigarettes, beer and blood");
            System.out.println("As you walk to the bar and order a drink, a man wearing a leather jacket approches you.");
            System.out.println("He says \"Son, you 'aint got no buisness being here and y'ought t' leave.\"");
            System.out.println("What do you do?");
            System.out.println("Type A to shove him and throw your drink in his face and say\"I got every reason to be here\"");
            System.out.println("Type B to say\"Well mister, i'm just here to talk to people like you\"");
            System.out.println("Type C to pull out your switch blade and stab him then and there\n");
            mcInput = keyInput.nextLine();
                
            switch(mcInput){
                case "A": case "a":
                    System.out.println("The man is greatly offended and orders the members of his gang attack you.");
                    System.out.println("Seing as how you lack any skill in combat, you die from many stab wounds.");
                    System.out.println("Game Over");
                    break;
                case "B": case "b":
                    System.out.println("The man says \"Hmm, I'd like to hear what a punk like you has to say?");
                    System.out.println("You see, us here in this organisation, we like to keep private.");
                    System.out.println("If you want to talk, you gotta join.\"");
                    System.out.println("Seeing as you are a insurgent, you obviously join.");
                    System.out.println("You preach your usual anti-goverment rhetoric and to end you make a suggestion.\n");
                    System.out.println("What do you suggest to the gang?");
                    System.out.println("Type A to arm yourself and attack city hall");
                    System.out.println("Type B to arm yourself and attack a protest");
                    System.out.println("Type C to arm the gang and call the police to report the gang for illegal weapons");
                    mcInput = keyInput.nextLine();
                    switch(mcInput){
                        case"A":case"a":
                            System.out.println("You get the gang into a frenzy and armed with pistols, you march on city hall.");
                            System.out.println("When you arrive, you order the gang to wait outside, while you enter.");
                            System.out.println("You ask the secretary to see the mayor.  She does not let you meet him.  You then ask what is his office number?");
                            System.out.println("She responds to say 303.  You say \"Thanks\" and then shoot her in the head.");
                            System.out.println("This critical error alerts the security guard and he gets up from his chair and fills you with bullets.");
                            System.out.println("After this the gang enters city hall, and in a hard fought battle, they win the day.");
                            System.out.println("Though you died, your legacy lives on as the nutjob who attacked city hall, and caused the sensless murder of every single beaurcrat.");
                            System.out.println("Congratulatons "+name);
                            break;
                        case "B": case"b":
                            System.out.println("What? Are you crazy?");
                            System.out.println("The riot poclice shoot you and your gang immediatly after you pull out your gun.");
                            System.out.println("Game Over");
                            break;
                        case "C": case "c":
                            System.out.println("Well you did a good thing");
                            System.out.println("Every member of the gang hates you and in a few years when they are released, don't expect to live much longer");
                            System.out.println("The one question is, why?  Why did you, a dead set insurgent decide to abandon your golden opportunity?");
                            System.out.println("You continue your life for a few years.  You are very unhappy.  When the day that the gang is released, you will welcome death with open arms.");
                            System.out.println("Game Over");
                            break;
                        }
                               
                        case "C": case "c":
                            System.out.println("Your hands bloody, you pronounce yourself leader of this gang.");
                            System.out.println("All of the members, respectufully and fearfullly acknoledge this fact.");
                            System.out.println("What you didn't see is the bartender quietly calling the police.");
                            System.out.println("You are promptly arrested and sent to jail for first degree murder.");
            }       
                
        }
               
            
               
               
             
                
                
                
        
    }
    

