public class ArraySorter {
    /** Precondition: Every element in anArray has a value. Action: Sorts the array into ascending order.*/
    public static void selectionSort(int[] anArray){
        for (int index = 0; index < anArray.length - 1; index++){
            int indexOfNextSmallest = getIndexOfSmallest(index, anArray); 
            interchange(index, indexOfNextSmallest, anArray);
        } 
    }

    /** Returns the index of the smallest value in the portion of the array that begins at the element whose index is startIndex and ends at the last element. */
    private static int getIndexOfSmallest(int startIndex, int[] a){
        int indexOfMin = startIndex;
        for( int i=startIndex; i< a.length ; i++ ){
            if( a[i] < a[indexOfMin] ) indexOfMin = i;
        }
        return indexOfMin;
    }

    /** Precondition: i and j are valid indices for the array a. Postcondition: Values of a[i] and a[j] have been interchanged.*/ 
    private static void interchange(int i, int j, int[] a){
        int temp = a[i]; 
        a[i] = a[j]; 
        a[j] = temp; //original value of a[i] 
    }
}