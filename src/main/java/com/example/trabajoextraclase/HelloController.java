package com.example.trabajoextraclase;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TableColumn<Estudiantes, String>Carne;

    @FXML
    private TableColumn<Estudiantes, String> Correo;

    @FXML
    private TableColumn<Estudiantes, String>Nickname;

    @FXML
    private TableColumn<Estudiantes, String> Nombre;

    @FXML
    private TableColumn<Estudiantes, String> NotaPro1;

    @FXML
    private TableColumn<Estudiantes, String> NotaPro2;

    @FXML
    private TableColumn<Estudiantes, String> NotaPro3;

    @FXML
    private TableColumn<Estudiantes, String> PromEQT;

    @FXML
    private TableColumn<Estudiantes, String> PromExam;

    @FXML
    private TableColumn<Estudiantes, String> PromProyecto;

    @FXML
    private TableColumn<Estudiantes, String> PromQuices;

    @FXML
    private TableColumn<Estudiantes, String> PromTares;

    @FXML
    private TableView<Estudiantes> Tabla;

    @FXML
    private TableColumn<Estudiantes, String> Telefono;

    @FXML
    private TableColumn<Estudiantes, String> TipoEstud;

    @FXML
    private TableColumn<Estudiantes, String> NotFinal;

    @FXML
    private Label welcomeText;
    public void initialize(URL url, ResourceBundle resourceBundle){


        Nombre.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>( "nombre"));
        NotaPro1.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>( "notaPro1"));
        NotaPro2.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>( "notaPro2"));
        NotaPro3.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>( "notaPro3"));
        Carne.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>( "carne"));
        Correo.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>( "correo"));
        Nickname.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>( "nickname"));
        PromExam.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>( "promExam"));
        PromQuices.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>( "promQuices"));
        PromTares.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>( "promTareas"));
        Telefono.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>( "telefono"));
        TipoEstud.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>( "tipoEstud"));
        PromProyecto.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>( "promProyecto"));
        PromEQT.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>( "promEQT"));
        NotFinal.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>( "NotFinal"));
        Estudiantes.leerCSV();
        Tabla.setItems(Estudiantes.lista);


    }

}
