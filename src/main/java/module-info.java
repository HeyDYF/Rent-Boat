module com.example.boat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.boat to javafx.fxml;
    exports com.example.boat;
}