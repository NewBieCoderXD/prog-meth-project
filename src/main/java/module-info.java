module org.example.prog_meth_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires component.inspector.fx;

    opens org.example.prog_meth_project.application to javafx.fxml;
    exports org.example.prog_meth_project.application;
}