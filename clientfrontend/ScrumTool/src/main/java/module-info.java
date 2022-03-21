module com.example.scrumtool {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scrumtool to javafx.fxml;
    exports com.example.scrumtool;
}