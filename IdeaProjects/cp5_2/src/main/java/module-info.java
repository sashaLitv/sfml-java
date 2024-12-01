module package.cp5_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens package.cp5_2 to javafx.fxml;
    exports package.cp5_2;
}