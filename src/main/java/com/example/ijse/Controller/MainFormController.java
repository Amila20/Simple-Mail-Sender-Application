package com.example.ijse.Controller;

import com.sun.mail.smtp.SMTPTransport;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.UserCredentials;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class MainFormController {
    public TextField txtEmailAddress;
    public TextField txtSubject;
    public TextArea txtMessage;

    public void btnSendOnAction(ActionEvent actionEvent) throws IOException, MessagingException {

    }
}
