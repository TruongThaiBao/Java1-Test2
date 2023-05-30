module com.example.java1bt1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java1bt1 to javafx.fxml;
    exports com.example.java1bt1;
}