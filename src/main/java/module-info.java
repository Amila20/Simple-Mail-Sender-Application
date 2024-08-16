module com.example.ijse.simple_mail_sender_application {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.mail;
    requires com.google.auth.oauth2;


    opens com.example.ijse to javafx.fxml;
    exports com.example.ijse;
    opens com.example.ijse.Controller to javafx.fxml;  // Allow javafx.fxml to access the Controller package

}