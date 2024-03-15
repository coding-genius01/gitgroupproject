module org.example.groupproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.groupproject to javafx.fxml;
    exports org.example.groupproject;
}