package Code.Green;

import Code.Blue.Attachment; //to set attachment
import Code.Blue.Notification; //to access notification object
import java.util.ArrayList; //data structure used to store items
/*
 * @brief NotificationCollection.java 
 * @note has an implementation arrow that connects to NotificationCollectionIF
 */
public class NotificationCollection implements NotificationCollectionIF{
    ArrayList<Notification> items;
    /*
     * @brief constructor
     */
    public NotificationCollection(){
        items = new ArrayList<>();
    }
    /*
     * @brief getItem func given an index
     * @param index : integer
     * @return get func
     */
    public Notification getItem(int index){
        return items.get(index);
    }
    /*
     * @brief adds an item into the collection (array)
     * @param str : String of added item from main
     */
    public void addItem(String str){
        items.add(new Notification(str));
    }
    /*
     * @brief gets the total length/size of the array list
     * @return size
     */
    public int getLength(){
        return items.size();
    }
    /*
     * @brief sets the attachment for the notification collection
     * @note rather than creating new variables, it is much easier
     * to recall back with using the getItem func in this java class
     * and obtaining setAttachment from the Attachment.java
     */
    public void setAttachment(Attachment a, int index){
        this.getItem(index).setAttachment(a);
    }
    /*
     * @brief gets an iterator from the Notification Collection
     * @return NotificationIterator
     */
    public NotificationIteratorIF createIterator(){
        return new NotificationIterator(this);
    }
}
