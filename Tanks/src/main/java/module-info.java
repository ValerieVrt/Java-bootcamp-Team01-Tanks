module com.example.tanks {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens edu.school21.tanks to javafx.fxml;
    exports edu.school21.tanks;
}