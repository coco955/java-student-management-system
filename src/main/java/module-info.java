module com.example.javastudentmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javastudentmanagementsystem to javafx.fxml;
    exports com.example.javastudentmanagementsystem;
}