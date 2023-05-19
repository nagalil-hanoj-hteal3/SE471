package Code;

import Code.Blue.Notification; //notification object
import Code.Green.NotificationCollectionIF; //notifications variable
import Code.Green.NotificationIteratorIF; //for utilizing the print func

/*
 * @brief
 * @note given notifications object, it must be redeclared to use the createIterator() as
 * shown on the yellow pop up in the lab
 * 
 */
public class NotificationBar{
    private NotificationCollectionIF notifications;
    
    /*
     * @brief constructor
     * @param nb : NotificationCollectionIF
     */
    NotificationBar(NotificationCollectionIF nb){
        this.notifications = nb;
    }
    /*
     * @brief output function to print notifications 
     * @note copied the whole format given from the lab 
     */
    public void printNotifications(){
        NotificationIteratorIF iterator = notifications.createIterator();
        while(iterator.hasNext()){
            Notification n = iterator.next();
            System.out.println(n.getContent());
        }
    }
}