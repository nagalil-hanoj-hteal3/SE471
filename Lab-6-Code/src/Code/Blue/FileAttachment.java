package Code.Blue;

/*
 * @brief FileAttachment class 
 *  
 * @note FileAttachment extends Attachment since the relationship is an open arrow
 * @note size_Byte
 */
public class FileAttachment extends Attachment{
    private int size_Byte;
    /*
     * @brief constructor
     * @param 's1' for author initializations
     * @param 'id' for uniqueID intializations
     * @param 'size' for size_Byte initaliazations
     * @note used super to obtain attachment constructor
     */
    public FileAttachment(String s1, int id, int size){
        /*this.author = s1;
        this.uniqueID = id;*/
        super(s1, id);
        this.size_Byte = size;
    }
    /*
     * @brief translate size_Byte (int) into a String
     * @return string of byte_size
     */
    public String toString(){
        String byte_size = String.valueOf(size_Byte);
        //return String.format(preview() + " Byte Size: " + byte_size);
        return String.format("Byte size: " + byte_size);
    }
    /*
     * @brief output the necessary information of the fileAttachment
     * consisting author, uniqueID, and size_Byte
     * @note added function
     */
    public void preview(){
        System.out.println("File Attachment: " + super.getAuthor() + 
        "\nUnique ID: " + super.getUniqueID() + "\n"
        + toString());
    }
}
