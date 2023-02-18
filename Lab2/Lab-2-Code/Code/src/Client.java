package src;

import java.util.ArrayList; //for storing id, name, and price
import java.util.List; //to use add func to store to product object
import java.util.Scanner; //reading in inputs to choose the following options

public class Client {
    public static void main(String[] args) {
        //ABC (ABC company) variable to include attributes within Product object
        List<Product> ABC = new ArrayList<Product>();
        //SortingUtilityIF sUtility = SuperSortingUtility.getSortingUtility();

        /* Test inputs to use for the program */
        ABC.add(new Product(1001101, "SE461 Textbook", 9.99));
        ABC.add(new Product(9991104, "Secrets to Pass SE471: Book", 92.00));
        ABC.add(new Product(33224, "Stuffed-Button", 50.00));
        ABC.add(new Product(1099122, "Louis Vuitton Model 8 Bag", 800.00));
        ABC.add(new Product(554423, "Teddy Bear Exclusive", 421.04));
        ABC.add(new Product(2333220, "A quarter and four pennies", 0.29));
        ABC.add(new Product(40111, "Chocolate Chip Cookie Crumbl", 4.00));
        ABC.add(new Product(11230, "Amplifier", 50.99));
        ABC.add(new Product(10030, "MacBook Pro", 300.89));
        ABC.add(new Product(1999122, "Mac X OS", 991.21));
        ABC.add(new Product(1, "Fan is the best professor", 911911.91));
        ABC.add(new Product(99999999, "Kenny sleeps 3 times a day in average: exclusive", 0.99));
        ABC.add(new Product(11111, "CougarsApps featuring John Doe: Limited Edition", 100000.99));
        ABC.add(new Product(012, "Dal is ranked diamond 1 (Valorant). Sorry Tuan", 666420.69));
        ABC.add(new Product(69, "Free tacos by financial aid", 420.69));
        ABC.add(new Product(6942021, "Lupe: The newest version of lubricant", 0.01));


        //test case to use without switch statement
        //System.out.println("Bubble Sort");
        //sUtility.sort(ABC, 1);
    
        //include bubblesort and quicksort in the menu
        
        SortingUtilityIF s = SuperSortingUtility.getSortingUtility();
        Scanner scanner = new Scanner(System.in);
        int selection = 0;

        //check to see that the selection does not terminate the program
        while (selection != 4) {
            menu();
            selection = scanner.nextInt();
            if (selection > 4 || selection < 1) {
                System.out.println("Silly goose! You put an invalid number. Try again!");
            }
            else{
                switch (selection) {
                    case 1:
                        ABC = s.sort(ABC, selection);
                        break;
                    case 2:
                        ABC = s.sort(ABC, selection);
                        break;
                    case 3:
                        printList(ABC);
                        break;
                    default:
                        System.out.println("Thank you for using the program. Have a nice day.");
                        break;
                }
            }
        }     
    }

    /* 
     * provide a menu in the client file to provide options in the 
     */
    public static void menu(){
        //System.out.println("\n--------------------------");
        System.out.println("\n#######################################################################################");
        System.out.printf("Welcome to the Client Menu! Lets get started!\n\n");
        System.out.printf("1. Sort List with BubbleSort\n",1);
        System.out.printf("2. Sort List with QuickSort\n",2);
        System.out.printf("3. Print Sorted List\n",3);
        System.out.printf("4. Exit the Program\n\n",4);
        System.out.println("#######################################################################################");
        System.out.print("Select: ");
    }

    /*
     * print function to display the 
     * list of products that are
     * collected from the main
     */
    public static void printList(List<Product> l){
        System.out.println("Printing by price using the Products class\n");
        for(Object i : l){
            System.out.println(((Product) i).displayProduct());
        }
    }

    
}
