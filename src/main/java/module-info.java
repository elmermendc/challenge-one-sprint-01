module com.challenge.challenge {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.challenge.challenge to javafx.fxml;
    exports com.challenge.challenge;
    exports com.challenge.challenge.controllers;
    opens com.challenge.challenge.controllers to javafx.fxml;
}