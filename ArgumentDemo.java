import java.util.Scanner;

public class ArgumentDemo {// Listing 7.5
    public static void main (String [] args) {
        //FirstScore
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("Enter your score on exam 1:"); 
        int firstScore = keyboard.nextInt ();
        
        //NextScore
        int [] nextScore = new int [3];
        for (int i = 0 ; i < nextScore.length ; i++)
            nextScore [i] = firstScore + 5 * i;

        //PossibleScore
        for (int i = 0 ; i < nextScore.length ; i++) {
            double possibleAverage = getAverage (firstScore, nextScore [i]); 
            System.out.println ("If your score on exam 2 is " + nextScore [i]); 
            System.out.println ("your average will be " + possibleAverage);
        } 
    }
    
    public static double getAverage (int n1, int n2)  {
        return (n1 + n2) / 2.0;
    } 
}