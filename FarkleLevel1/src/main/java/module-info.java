module com.example.farklelevel1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.farklelevel1 to javafx.fxml;
    exports com.example.farklelevel1;
}