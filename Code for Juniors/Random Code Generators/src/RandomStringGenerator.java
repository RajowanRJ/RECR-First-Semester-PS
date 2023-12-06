import java.util.*;
import java.util.Random;

public class RandomStringGenerator {

    public static void main(String[] args) {
        
        int userInput = getUserInput();
        
        if (userInput == 0) {
            fixedRole();
        }

        else {
            String randomString = generateRandomString(userInput);
            System.out.println(randomString);
        }
    }

    private static int getUserInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("****** Enter Any Number between 1 to 5 ******");
            return in.nextInt();
        
    }

    private static String generateRandomString(int userInput) {
        
        Random random = new Random();
        String[][] stringSets = {
                
            {   
                    "Act Like a Begger!",
                    "Dance on Hero Alom's Song",
                    "Act as a Transgender!",
                    "Sing a Song in the style of Hero Alom",
                    "Act with Zayed khan's Famous Dialogues",
                    "Act like Mad",
                    "Recite a poem", 
                    "Act as a bus helper",
                    "Act on any dialogue of dipjol",
                    "Introduce yourself in bengali without using a English word",
                    "Sing a song, tell a jokes",
            },
            
                {
                    "Act Like a Begger!",
                    "Dance on Hero Alom's Song",
                    "Act as a Transgender!",
                    "Sing a Song in the style of Hero Alom",
                    "Act with Zayed khan's Famous Dialogues",
                    "Act like Mad",
                    "Recite a poem", 
                    "Act as a bus helper",
                    "Act on any dialogue of dipjol",
                    "Introduce yourself in bengali without using a English word",
                    "Sing a song, tell a jokes",
                },
                
                {
                    "Act Like a Begger!",
                    "Dance on Hero Alom's Song",
                    "Act as a Transgender!",
                    "Sing a Song in the style of Hero Alom",
                    "Act with Zayed khan's Famous Dialogues",
                    "Act like Mad",
                    "Recite a poem", 
                    "Act as a bus helper",
                    "Act on any dialogue of dipjol",
                    "Introduce yourself in bengali without using a English word",
                    "Sing a song, tell a jokes",
                },
                
                {
                   "Act Like a Begger!",
                    "Dance on Hero Alom's Song",
                    "Act as a Transgender!",
                    "Sing a Song in the style of Hero Alom",
                    "Act with Zayed khan's Famous Dialogues",
                    "Act like Mad",
                    "Recite a poem", 
                    "Act as a bus helper",
                    "Act on any dialogue of dipjol",
                    "Introduce yourself in bengali without using a English word",
                    "Sing a song, tell a jokes",
                },
                
                {
                    "Act Like a Begger!",
                    "Dance on Hero Alom's Song",
                    "Act as a Transgender!",
                    "Sing a Song in the style of Hero Alom",
                    "Act with Zayed khan's Famous Dialogues",
                    "Act like Mad",
                    "Recite a poem", 
                    "Act as a bus helper",
                    "Act on any dialogue of dipjol",
                    "Introduce yourself in bengali without using a English word",
                    "Sing a song, tell a jokes",
                },
        };
        if (userInput < 1 || userInput > 5) {
            return "Invalid input. Please enter a number between 1 and 5.";
        }

        int randomIndex = random.nextInt(7);
        return stringSets[userInput - 1][randomIndex];
    }
    
    public static void fixedRole() {
        Scanner in = new Scanner (System.in);
        System.out.println("****** Enter Any Number between 1 to 5 ******");
        
        int x = in.nextInt();
        
        if (x == 1 || x == 2 || x == 3 || x == 4 || x == 5)
            System.out.println("Dance on a Random Song");
        else
            System.out.println("Invalid Input : Enter 1 to 5");   
    }
}