package JavaMail;


import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {

	  private static final String SMTP_HOST_NAME = "smtp.qq.com";
	  private static final String SMTP_AUTH_USER = "1944909846";
	  private static final String SMTP_AUTH_PWD  = "zhengjun1994";

	public static void main(String[] args) {
		Properties props = new Properties();  
		
		System.setProperty("javax.net.debug", "all"); 
		  // ����debug����  
        props.setProperty("mail.debug", "true");  
        // �����ʼ�������������  
		props.put("mail.smtp.host", SMTP_HOST_NAME);
		
		props.put("mail.smtp.starttls.enable", "true");
	    
		props.put("mail.smtp.auth", "true");
		
        try{
        // Session������stmp��������Ϣ  
        Session session = Session.getDefaultInstance(props, new Authenticator(){  
            protected PasswordAuthentication getPasswordAuthentication(){  
                return new PasswordAuthentication(SMTP_AUTH_USER,SMTP_AUTH_PWD);  
            }  
        });  
          
        // �����ʼ�����  
        Message msg = new MimeMessage(session);  
        msg.setSubject("JavaMail����");  
        // �����ʼ�����  
        msg.setText("����һ����JavaMail���͵��ʼ���");  
        // ���÷�����  
        msg.setFrom(new InternetAddress("1944909846@qq.com"));  
        
        msg.addRecipient(RecipientType.TO, new InternetAddress("tx1103mark@163.com"));
        
        msg.setSentDate(new Date());
        
 
         
        // �����ʼ�  
        Transport.send(msg);  
       
   
	}catch (Exception e) {
        e.printStackTrace();
       
    }
	}
}
