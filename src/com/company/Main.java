// finding duplicate values in an array
package com.company;

public class Main {

    public static void main(String[] args) {

        //another way to declare an array...
        int a[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};

        //arrays have length, collections have size()
        System.out.printf("The size of the array is %d\n",a.length);
	    int numberOfMatches = 0;

	    // for each element in the array...
	    for (int i=0; i<a.length;i++){
            numberOfMatches = 0;
            // for each element again: check the first item against every item, and so on ...
	        for(int j=0; j<a.length; j++) {
                //count number of duplicates
                if (a[i] == a[j]) {
                    numberOfMatches++;
                }
            }
            if (numberOfMatches > 1){
                System.out.printf("%d is a duplicate value\n", a[i]);
            }
        }
    }
}
