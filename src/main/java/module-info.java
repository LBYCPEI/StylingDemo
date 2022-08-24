module com.example.opencsvdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.opencsv;
    requires org.controlsfx.controls;

    opens ph.edu.dlsu.lbycpei to javafx.fxml;
    exports ph.edu.dlsu.lbycpei;
}