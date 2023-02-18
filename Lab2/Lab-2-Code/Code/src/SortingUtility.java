package src;

import java.util.List;
//import java.util.Collection;
import java.util.Collections;

// Resources gathered
//https://docs.oracle.com/javase/7/docs/api/java/util/List.html -- get()
//https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html -- swap()

public class SortingUtility implements SortingUtilityIF{
    /*
     * calling which sort function 
     * 
     * challenges/mistakes
     * -forgot to make it a public function
     * -not assign a return statement
     * -call it an interface instead of class
     */
    public List<Product> sort(List<Product> items, int sortingApproach){
        /*
         * choice of number to choose
         * between quick/bubble sort
         */
        switch(sortingApproach){
            case 1: items = bubbleSort(items); break;
            case 2: items = quickSort(items); break;
            default: break;
        }
        return items;
    }
    
    /*
     * Needed to call the List<Product> for
     * sorting the quick sort algorithm
     */
    public List<Product> quickSort(List<Product> l) {
		/*
         * https://www.geeksforgeeks.org/java-program-for-quicksort/
         */
        partition(l, 0, l.size()-1);
        return l;   
	}

    /*
     * Use for recursion (partition)
     * https://youtu.be/7h1s2SojIRw
     */
    public void partition(List<Product> l, int front, int rear){
        int i = front;
        int j = rear;
        int pivot = l.get((front+rear)/2).getProductID();

        //when front is not at rear position
        while (i <= j) {
            //when i is getting bigger element
            while(l.get(i).getProductID() < pivot){
                i++; //proceed forward
            }
            //when j is getting smaller element
            while(l.get(j).getProductID() > pivot){
                j--; //proceed backward
            }
            //interchange both i and j when theres no more comparisons left
            if(i <= j){
                Collections.swap(l, i, j);
                i++;
                j--;
            }
        }
        //when while condition satisfied, check
        //the updated positions and recursively
        //move to do new comparisons
        if(front < j){
            partition(l, front, j);
        }
        if(i < rear){
            partition(l, i, rear);
        }
    }

    // This is the function that will be used by the proxy. 
    /*
     * Products (books, bags, buttons)
     */
    public List<Product> bubbleSort(List<Product> l){
        int max_size = l.size(); // set to the size of list
        /*
         * https://www.geeksforgeeks.org/bubble-sort/
         */
        for(int i = 0; i < max_size - 1; i++){
            for(int j = i+1; j < max_size; j++){    
                if(l.get(i).getProductID() > l.get(j).getProductID()){
                //get(i/j) gets the current index of the list
                    Collections.swap(l, i, j);
                }
            }
        }
        return l;
    }
}