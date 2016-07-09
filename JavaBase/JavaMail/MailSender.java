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
		  // 开启debug调试  
        props.setProperty("mail.debug", "true");  
        // 设置邮件服务器主机名  
		props.put("mail.smtp.host", SMTP_HOST_NAME);
		
		props.put("mail.smtp.starttls.enable", "true");
	    
		props.put("mail.smtp.auth", "true");
		
        try{
        // Session管理与stmp的链接信息  
        Session session = Session.getDefaultInstance(props, new Authenticator(){  
            protected PasswordAuthentication getPasswordAuthentication(){  
                return new PasswordAuthentication(SMTP_AUTH_USER,SMTP_AUTH_PWD);  
            }  
        });  
          
        // 创建邮件对象  
        Message msg = new MimeMessage(session);  
        msg.setSubject("JavaMail测试");  
        // 设置邮件内容  
        msg.setText("这是一封由JavaMail发送的邮件！");  
        // 设置发件人  
        msg.setFrom(new InternetAddress("1944909846@qq.com"));  
        
        msg.addRecipient(RecipientType.TO, new InternetAddress("tx1103mark@163.com"));
        
        msg.setSentDate(new Date());
        
 
         
        // 发送邮件  
        Transport.send(msg);  
       
   
	}catch (Exception e) {
        e.printStackTrace();
       
    }
	}
}
