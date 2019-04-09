import java.util.Scanner;

public class ReturnArrayDemo {
    // Listing 7.5
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
            double[] possibleAverage = getArrayOfAverages (firstScore, nextScore); 
            System.out.println ("If your score on exam 2 is " + nextScore [i]); 
            System.out.println ("your average will be " + possibleAverage[i]);
        } 
    }
    
    public static double[] getArrayOfAverages (int n1, int[] n2)  {
        double[] average = new double[n2.length];
        for(int i=0;i<average.length;i++){
            average[i] = getAverage(n1,n2[i]);
        }
        return average;
    }

    public static double getAverage(int n1,int n2){
        return (n1 + n2) / 2.0;
    } 
}