// 4. Write a java program to send email via javax.mail.API
package Lab6;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
public class Q4 {
    public static void main(String[] args) {
        String to = "siddbazbuzz@gmail.com";
        String from = "aayushbadal922@gmail.com";
        String subject = "Test Mail";
        String msg = "This is a Mail Sent from Apache NetBeans Application using Java Programming Language.\nK chha Haal Khabar?";
        Send(to,from,subject,msg);
    }
    private static void Send(String to, String from, String subject, String msg){
        Properties prop = new Properties();
        // Set Properties
        prop.put("mail.smtp.auth","true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.starttls.enable","true");
        prop.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        
        //Get Session Object
        String username = "aayushbadal922@gmail.com";
        String password = "nhed nihn jgja xyhk";
        
        Session session = Session.getInstance(prop,new Authenticator(){
           @Override
           protected PasswordAuthentication getPasswordAuthentication(){
               return new PasswordAuthentication(username,password);
           }
        });
        //Compose or define mail
        try{
            MimeMessage m = new MimeMessage(session);
            m.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            m.setFrom(new InternetAddress(from));
            m.setSubject(subject);
            m.setText(msg);
            //Send Mail
            Transport.send(m);
            System.out.println("Successfully Sent Mail.");
        } catch(Exception e){e.printStackTrace();}
    }
}
