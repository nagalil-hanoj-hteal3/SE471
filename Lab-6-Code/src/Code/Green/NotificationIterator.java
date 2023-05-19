package Code.Green;
import Code.Blue.Notification;
/*
 * @brief NotificationIterator has a relationship with NotificationIteratorIF which 
 * implements its interface, and must involve notifcation as it will be used
 * 
 * @note named collection for uml purposes
 * @note index to indicate the location of the pointer
 */
public class NotificationIterator implements NotificationIteratorIF{
    private NotificationCollection collection;
    public int index;

    /*
     * @brief constructor
     * @param c : NotificationCollection of collection
     */
    NotificationIterator(NotificationCollection c){
        this.index = 0;
        this.collection = c;
    }

    /*
     * @brief if iterator has more objects versus the index that has not been iterated
     * @return true with more objects, else object is at the end
     */
    public boolean hasNext(){
        return index < collection.getLength();
    }

    /*
     * @brief get the next notification in the collection
     * @return NotificationCollection
     */
    public Notification next(){
        return collection.getItem(index++);
    }
}
