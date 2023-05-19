package Code.Blue;

public class MediaAttachment extends Attachment{
    private int length_Second;
    /*
     * @brief Constructor
     * @param 'a' for author intializations
     * @param 'u' for uniqueID initalizations
     * @param 'l' for length_Second initalizations
     * @note used super to obtain attachment constructor
     */
    public MediaAttachment(String a, int u, int l){
        /*this.author = a;
        this.uniqueID = u;*/
        super(a, u);
        this.length_Second = l;
    }
    /*
     * @brief translate length_Second (int) to a String
     * @return String seconds 
     */
    public String toString(){
        String seconds = String.valueOf(length_Second);
        return String.format("Seconds: " + seconds);
    }
    /*
     * @brief output the necessary information of the mediaAttachment
     * consisting author, uniqueID, and length_Second
     * @note added function
     */
    public void preview(){
        System.out.println("Media Attachment: " + super.getAuthor() + 
        "\nUnique ID: " + super.getUniqueID() + "\n"
        + toString());
    }
}
