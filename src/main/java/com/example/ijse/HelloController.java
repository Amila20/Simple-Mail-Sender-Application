package com.example.ijse;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Properties;


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;



public class HelloController {


        public static void sendEmail(String recipient, String subject, String content) {
            // Sender's email ID and password
            final String username = "amila7640@gmail.com";
            final String password = "xoya iddh xwin geop";

            // SMTP server information
            String host = "smtp.gmail.com"; // e.g., smtp.gmail.com

            // Setup mail server properties
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587"); // Use 465 for SSL

            // Get the Session object
            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });

            try {
                // Create a default MimeMessage object
                Message message = new MimeMessage(session);

                // Set From: header field
                message.setFrom(new InternetAddress(username));

                // Set To: header field
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));

                // Set Subject: header field
                message.setSubject(subject);

                // Now set the actual message
                message.setText(content);

                // Send message
                Transport.send(message);

                System.out.println("Sent message successfully....");

            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
        }

        public static void main(String[] args) {
            String to = "ceroh40572@polatrix.com";
            String subject = "Test Email";
            String content = "This is a test email.";

            sendEmail(to, subject, content);
        }
    }



