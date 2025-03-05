module com.example.javafxtp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtp to javafx.fxml;
    exports com.example.javafxtp;
}