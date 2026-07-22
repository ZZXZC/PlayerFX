module FirstFx {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.media;
    requires org.apache.poi.ooxml;
    requires org.apache.poi.poi;

    opens application to javafx.graphics, javafx.fxml;
}