package src;

import java.util.List;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

/*
 * https://stackoverflow.com/questions/34112276/java-format-string-spacing (used for outputting statements in quick/bubble sorts)
 */

public class SortingUtilityProxy implements SortingUtilityIF{
    //call the interface object
    private SortingUtilityIF sUtility; 

    /*
     * Constructor
     * @param s
     */
    SortingUtilityProxy(SortingUtilityIF s){
        this.sUtility = s; 
    }

    /*
     * Getting the sort method
     * @param m to specify method
     * returns the sorted method
     * throw both exceptions
     */
    private Method sortMethod(String m) throws NoSuchMethodException, InvocationTargetException{
        Method sortM = sUtility.getClass().getDeclaredMethod(m, List.class);
        sortM.setAccessible(true);
        return sortM;
    }

    // This is where we sort our list of products
    /* (non-Javadoc)
     * @see src.SortingUtilityIF#sort(java.util.List, int)
     */
    /* (non-Javadoc)
     * @see src.SortingUtilityIF#sort(java.util.List, int)
     */
    public List<Product> sort(List<Product> items, int sortingApproach)
    {
        try {
            switch (sortingApproach) {
                case 1: /*call bubble sort*/
                        items = (List<Product>)(this.sortMethod("bubbleSort")).invoke(sUtility, items);
                        printBubbleSort(items);
                        break;
                case 2: /*call quick sort*/
                        items = (List<Product>)(this.sortMethod("quickSort")).invoke(sUtility, items);
                        printQuickSort(items);
                        break;
                default: break;
            }
        
        } catch (NoSuchMethodException e) {
            // TODO: handle exception
            System.out.println("Unrecognized method");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO: handle exception
            //e.printStackTrace();
        } catch (IllegalAccessException e) {/*Do Nothing*/}
        return items;
    }

    /*
     * Printing the list for bubble sort
     */
    private void printBubbleSort(List<Product> l){
       /*
        * s = spacing (string)
        * f = float (double)
        * d = digit (int)
        */
        System.out.println("\nBubble Sort Selected");
        System.out.printf("%-11s %-50s %-7s\n", "Product ID", "Product Name", "Product Price");
        System.out.printf("%-11s %-50s %-7s\n", "===========", "=============", "============");

        for (Product product : l) {
            System.out.printf("%-11d %-50s $%10.2f\n", product.getProductID(),
            product.getProductName(), product.getProductPrice());
        }
    }
    /*
     * Printing the list for quick sort
     */
    private void printQuickSort(List<Product> l){
        /*
        * s = spacing (string)
        * f = float (double)
        */
        System.out.println("\nQuick Sort Selected");
        System.out.printf("%-50s %-11s %-7s\n", "Product Name", "Product ID", "Product Price");
        System.out.printf("%-50s %-11s %-7s\n", "===========", "==========", "=============");

        for (Product product : l) {
            System.out.printf("%-50s %-11s $%10.2f\n", product.getProductName(),
            product.getProductID(), product.getProductPrice());
        }
    }
}
