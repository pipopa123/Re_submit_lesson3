module com.example.re_submit_lesson3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.re_submit_lesson3 to javafx.fxml;
    exports com.example.re_submit_lesson3;
}