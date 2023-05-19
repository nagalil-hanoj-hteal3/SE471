package Code.Green;

import Code.Blue.Notification; //needed since Notification object is used

/*
 * @brief creating a Notification Iterator interface to create
 * hasNext() and next()
 */
public interface NotificationIteratorIF {
    public boolean hasNext();
    public Notification next();
}
