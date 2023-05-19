package Code.Blue;

public abstract class Attachment {
    /*
     * @brief variables that are used
     * @note specifies the name of the author
     * @note uniquely identify the attachment
     */
    private String author;
    private int uniqueID;
    /*
     * @brief Constructor
     * @param a : String for author
     * @param u : int for uniqueID
     */
    public Attachment(String a, int u){
        this.author = a;
        this.uniqueID = u;
    }
    /*
     * @brief get unique ID in attachment class
     * @return int, uniqueID
     * @note added function
     */
    public int getUniqueID(){
        return this.uniqueID;
    }
    /*
     * @brief get author in attachment class
     * @return String, author
     * @note added function
     */
    public String getAuthor(){
        return this.author;
    }
    /*
     * @brief Creating an output statment to display both the author and uniqueID
     * @note made as void as mentioned in the uml
     */
    public void preview(){
        System.out.println("Attachment: " + author + "\nUnique ID: "+ uniqueID +"\n");
    }
}
