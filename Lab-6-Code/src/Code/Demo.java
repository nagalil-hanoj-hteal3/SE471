package Code;

import Code.Green.NotificationCollection; //Notification Collection object, and for number 1
import Code.Blue.Attachment; //for number 2
import Code.Blue.FileAttachment; //for attach files feature
import Code.Blue.MediaAttachment; //for media files feature

public class Demo {
    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);

        //1. create Notifications and add them to nc
            //nc.addItem("string?");
        /*nc.addItem("Big Bad Wolf");
        nc.addItem("Green Eggs and Turkey");
        nc.addItem("Eye Heart Radio");
        nc.addItem("");*/

        //generate ten new notification items to be added in the collection
        for(int i = 1; i <= 10; i++){
            nc.addItem("Notification count " + i + ": Pass");
        }
        //System.out.println("Complete!\n\n");

        //nc.printNotifications();
        //2. create attachments and link them to notifications in nc
            //nc.getItem(index).attach(name of attachment);
        System.out.println("-----------Attachment Process below----------");
        Attachment text1 = new FileAttachment("Fan_Syllabus.txt", 1001, 100);
        Attachment text2 = new FileAttachment("Zheng_Syllabus.txt", 1002, 200);
        Attachment heart = new MediaAttachment("Heart.txt", 1003, 1000);
        Attachment turkey = new MediaAttachment("Turkey.txt", 1004, 2300);
        Attachment wolf = new MediaAttachment("Wolf.txt", 1005, 3000);
        Attachment wolf2 = new MediaAttachment("Wolfie", 1010, 8000);

        /*
         * cont. of part 2, set the attachment corresponding to the vars above
         */
        nc.setAttachment(text1, 0);
        nc.setAttachment(text2, 1);
        nc.setAttachment(heart, 2);
        nc.setAttachment(turkey, 3);
        nc.setAttachment(wolf, 4);
        nc.setAttachment(wolf2, 9);

        /*
         * call the notification bar object to print the rest of the attachments
         */
        nb.printNotifications();
    }
}
