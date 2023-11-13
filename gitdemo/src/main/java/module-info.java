module com.noortje.gitdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.noortje.gitdemo to javafx.fxml;
    exports com.noortje.gitdemo;
}