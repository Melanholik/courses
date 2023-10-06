module com.example.javafxlessons {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxlessons to javafx.fxml;
    exports com.example.javafxlessons;
}