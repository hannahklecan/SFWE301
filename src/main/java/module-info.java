module com.sfwe301.sfwe301_v2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.sfwe301.sfwe301 to javafx.fxml;
    exports com.sfwe301.sfwe301;
}