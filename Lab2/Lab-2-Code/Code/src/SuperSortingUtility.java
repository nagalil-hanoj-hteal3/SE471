package src;
//private SortingUtility 

public class SuperSortingUtility {
    public static SortingUtilityIF getSortingUtility(){
        return new SortingUtilityProxy(new SortingUtility());
    }
}
