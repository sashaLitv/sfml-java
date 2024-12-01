module all{
    requires javafx.controls;
    requires javafx.fxml;
    opens all to javafx.fxml;
    exports all;
}