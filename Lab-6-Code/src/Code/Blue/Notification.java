package Code.Blue;

public class Notification {
    /*
     * @brief variables used for optimization
     * @note set an attachment variable for attachments
     * @note set a message variable to set notifications
     */
    private Attachment attachment;
    private String message;
    /*
     * @brief constructor
     * @param m : String of message
     */
    public Notification(String m){
        this.message = m;
    }

    /*
     * @brief get preview of the content of the attachment
     * @return whole line of string
     * 
     * @note initially used ternary as preview() 
     * @note made two conditions to indicate the attachment process,
     * a flaw is having a void preview(), which can be satisfied for ternary
     * @note ended up doing if statement to show the process
     */
    public String getContent(){
        
        if(attachment == null){
            return String.format(message + "\n[Available to add attachment]\n");
        }else{
            attachment.preview();
            return String.format(message + "\n");
        }
        //return message + "\n" + ((attachment == null) ? "[Empty]\n" : attachment.preview());
    }
    /*
     * @brief set the attachment with passed parameter
     * @param 'a' variable of Attachment object
     */
    public void setAttachment(Attachment a){
        attachment = a;
    }
}
