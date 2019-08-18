module TopCorridaFX {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires sqlite.jdbc;


    opens br.com.topcorridafx to javafx.fxml;
    opens br.com.topcorridafx.Controller to javafx.fxml;
    opens br.com.topcorridafx.Model to javafx.base;

    exports br.com.topcorridafx.Model;
    exports br.com.topcorridafx;
    exports br.com.topcorridafx.Controller;
}