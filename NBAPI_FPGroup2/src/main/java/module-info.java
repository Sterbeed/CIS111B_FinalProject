module com.group2.nbapi_fpgroup2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.group2.nbapi_fpgroup2 to javafx.fxml;
    exports com.group2.nbapi_fpgroup2;
}