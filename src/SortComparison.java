// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author
 *  @version HT 2018
 */

class SortComparison {

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    //Start from element of index 1
    //Shift element left until it encounters a smaller element.
    //Increment first loop and repeat.
    static double [] insertionSort (double a[]){
        double cmp; int j;
        for (int i = 1; i < a.length; i++) {
            cmp = a[i];
            j = i;
            while (j > 0 && a[j - 1] > cmp) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = cmp;
        }
        return a;
        //todo: implement the sort
    }//end insertionsort

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] quickSort (double a[]){

        //todo: implement the sort
        return a;

    }//end quicksort

    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] mergeSort (double a[]){

        //todo: implement the sort
        return a;
    }//end mergesort

    /**
     * Sorts an array of doubles using Shell Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    //Take every h-th element starting from any element
    //Order the produced sequence
    //Repeat with smaller h value (based off of sequence generated by ((1/2) * (3^k + 1))  )
    static double [] shellSort (double a[]){
        double temp;
        int h = 1;
        while (h < a.length/3)  h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >= h && (a[j] < a[j - h]); j -= h) {
                    temp = a[j];
                    a[j] = a[j - h];
                    a[j - h] = temp;
                }
            }
            h /= 3;
        }
        //todo: implement the sort
        return a;
    }//end shellsort

    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    //Find the smallest entry between 'i' and 'n'.
    //Swap the smallest entry found between 'i' and 'j' with the selected element of the first loop.
    static double [] selectionSort (double a[]){
        int minNumIndex;
        double tmp;
        for (int i = 0; i < a.length - 1; i++) {
            minNumIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minNumIndex]) {
                    minNumIndex = j;
                }
            }
            tmp = a[minNumIndex];
            a[minNumIndex] = a[i];
            a[i] = tmp;
        }
        //todo: implement the sort
        return a;
    }//end selectionsort

    /**
     * Sorts an array of doubles using Bubble Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] bubbleSort (double a[]){
        double temp;
        for (int i = 0 ; i < a.length; i ++) {
            for (int j = 0; j < (a.length - i); j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        //todo: implement the sort
        return a;
    }//end bubblesort


    public static void main(String[] args) {

        //todo: do experiments as per assignment instructions
    }

}//end class
