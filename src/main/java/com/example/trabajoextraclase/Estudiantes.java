package com.example.trabajoextraclase;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Estudiantes extends Main {

    private final SimpleStringProperty carne;
    private final SimpleStringProperty nombre;
    private final SimpleStringProperty correo;
    private final SimpleStringProperty telefono;
    private final SimpleStringProperty nickname;
    private final SimpleStringProperty promExam;
    private final SimpleStringProperty promQuices;
    private final SimpleStringProperty promTareas;
    private final SimpleStringProperty notaPro1;
    private final SimpleStringProperty notaPro2;
    private final SimpleStringProperty notaPro3;
    private final SimpleStringProperty tipoEstud;
    private final SimpleStringProperty promProyecto;
    private final SimpleStringProperty promEQT;
    private final SimpleStringProperty nFinal;










    public Estudiantes(String carne, String nombre, String correo, String telefono, String nickname, String promExam,
                       String promQuices, String promTareas, String notaPro1, String notaPro2,
                       String notaPro3, String tipoEstud, String promProyecto,String promEQT,String nFinal) {
        this.carne = new SimpleStringProperty(carne) ;
        this.nombre =new SimpleStringProperty( nombre);
        this.correo =new SimpleStringProperty( correo);
        this.telefono =new SimpleStringProperty(telefono);
        this.nickname = new SimpleStringProperty(nickname);
        this.promExam = new SimpleStringProperty(promExam);
        this.promQuices = new SimpleStringProperty(promQuices);
        this.promTareas = new SimpleStringProperty( promTareas);
        this.notaPro1 = new SimpleStringProperty(notaPro1);
        this.notaPro2 = new SimpleStringProperty(notaPro2);
        this.notaPro3 = new SimpleStringProperty(notaPro3);
        this.tipoEstud = new SimpleStringProperty(tipoEstud);
        this.promProyecto =new SimpleStringProperty(promProyecto);
        this.promEQT =new SimpleStringProperty(promEQT);
        this.nFinal =new SimpleStringProperty(nFinal);



    }

    public String getCarne() {
        return carne.get();
    }

    public void setCarne(String carne) {
        this.carne.set(carne);
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public void setCorreo(String correo) {
        this.correo.set(correo);
    }

    public void setTelefono(String telefono) {
        this.telefono.set(telefono);
    }

    public void setNickname(String nickname) {
        this.nickname.set(nickname);
    }

    public void setPromExam(String promExam) {
        this.promExam.set(promExam);
    }

    public void setPromQuices(String promQuices) {
        this.promQuices.set(promQuices);
    }

    public void setPromTareas(String promTareas) {
        this.promTareas.set(promTareas);
    }

    public void setNotaPro1(String notaPro1) {
        this.notaPro1.set(notaPro1);
    }

    public void setNotaPro2(String notaPro2) {
        this.notaPro2.set(notaPro2);
    }

    public void setNotaPro3(String notaPro3) {
        this.notaPro3.set(notaPro3);
    }

    public void setTipoEstud(String tipoEstud) {
        this.tipoEstud.set(tipoEstud);
    }

    public void setPromProyecto(String promProyecto) {this.promProyecto.set(promProyecto);}

    public void setPromEQT(String promEQT) {this.promEQT.set(promEQT);}

    public void setnFinal(String nFinal) {this.nFinal.set(nFinal);}

    public String getNombre() {
        return nombre.get();
    }

    public String getCorreo() {
        return correo.get();
    }

    public String getTelefono() {
        return telefono.get();
    }

    public String getNickname() {
        return nickname.get();
    }

    public String getPromExam() {
        return promExam.get();
    }

    public String getPromQuices() {
        return promQuices.get();
    }

    public String getPromTareas() {
        return promTareas.get();
    }

    public String getNotaPro1() {
        return notaPro1.get();
    }

    public String getNotaPro2() {
        return notaPro2.get();
    }

    public String getNotaPro3() {
        return notaPro3.get();
    }

    public String getTipoEstud() {
        return tipoEstud.get();
    }
    public String getPromProyecto(){return promProyecto.get();}
    public String getPromEQT() {return promEQT.get();}
    public String getnFinal() {return nFinal.get();}

    public String notaPromedio(int promExam, int promQuices, int promTareas, int notaPro1, int notaPro2, int notaPro3){
        return null;
    }
    public String notaFinal(int promExam,int promQuices,int promTareas,int notaPro1,int notaPro2,int notaPro3) {
        return null;
    }
    public static ObservableList<Estudiantes> lista = FXCollections.observableArrayList();



    public static void leerCSV() {
        String ArchivoCsv = "C:\\Users\\Alvaro Duarte\\Documents\\GitHub\\TrabajoExtraClase" +
                "\\src\\main\\java\\com\\example\\trabajoextraclase\\EXCEL_PRUEBA.csv";
        String FieldDelimiter = ";";


        BufferedReader lector;
        try {
            lector = new BufferedReader(new FileReader(ArchivoCsv));
            String linea;



            while ((linea = lector.readLine()) != null) {
                String[] celdas = linea.split(FieldDelimiter, -1);
                EstudiantesA estudiantesA = new EstudiantesA("","","","","","","",""
                        ,"","","","","","","");
                EstudiantesB estudiantesB = new EstudiantesB("","","","","","","",""
                        ,"","","","","","","");
            //System.out.println(estudiantesB.notaFinal(Integer.parseInt(celdas[5]),Integer.parseInt(celdas[6]),Integer.parseInt(celdas[7]),
                    //Integer.parseInt(celdas[8]),Integer.parseInt(celdas[9]),Integer.parseInt(celdas[10])));

                if (celdas[11].equals("A")) {
                    System.out.println(estudiantesA.notaFinal(Integer.parseInt(celdas[5]),Integer.parseInt(celdas[6]),Integer.parseInt(celdas[7]),
                            Integer.parseInt(celdas[8]),Integer.parseInt(celdas[9]),Integer.parseInt(celdas[10])));
                    estudiantesA.setCarne(celdas[0]);
                    estudiantesA.setNombre(celdas[1]);
                    estudiantesA.setCorreo(celdas[2]);
                    estudiantesA.setTelefono(celdas[3]);
                    estudiantesA.setNickname(celdas[4]);
                    estudiantesA.setPromExam(celdas[5]);
                    estudiantesA.setPromQuices(celdas[6]);
                    estudiantesA.setPromTareas(celdas[7]);
                    estudiantesA.setNotaPro1(celdas[8]);
                    estudiantesA.setNotaPro2(celdas[9]);
                    estudiantesA.setNotaPro3(celdas[10]);
                    estudiantesA.setTipoEstud(celdas[11]);
                    estudiantesA.setPromEQT(estudiantesA.notaPromedio(Integer.parseInt(celdas[5]),Integer.parseInt(celdas[6]),Integer.parseInt(celdas[7]),0,0,0));
                    estudiantesA.setnFinal(estudiantesA.notaFinal(Integer.parseInt(celdas[5]),Integer.parseInt(celdas[6]),Integer.parseInt(celdas[7]),
                            Integer.parseInt(celdas[8]),Integer.parseInt(celdas[9]),Integer.parseInt(celdas[10])));
                    System.out.println(estudiantesA.getnFinal());



                    lista.add(estudiantesA);


                }
                else{

                    estudiantesB.setCarne(celdas[0]);
                    estudiantesB.setNombre(celdas[1]);
                    estudiantesB.setCorreo(celdas[2]);
                    estudiantesB.setTelefono(celdas[3]);
                    estudiantesB.setNickname(celdas[4]);
                    estudiantesB.setPromExam(celdas[5]);
                    estudiantesB.setPromQuices(celdas[6]);
                    estudiantesB.setPromTareas(celdas[7]);
                    estudiantesB.setNotaPro1(celdas[8]);
                    estudiantesB.setNotaPro2(celdas[9]);
                    estudiantesB.setNotaPro3(celdas[10]);
                    estudiantesB.setTipoEstud(celdas[11]);
                    estudiantesB.setPromProyecto(estudiantesB.notaPromedio(0,0,0,Integer.parseInt(celdas[5]),Integer.parseInt(celdas[6]),Integer.parseInt(celdas[7])));
                    estudiantesB.setnFinal(estudiantesB.notaFinal(Integer.parseInt(celdas[5]),Integer.parseInt(celdas[6]),Integer.parseInt(celdas[7]),
                            Integer.parseInt(celdas[8]),Integer.parseInt(celdas[9]),Integer.parseInt(celdas[10])));
                    lista.add(estudiantesB);
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Estudiantes.class.getName())
                    .log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Estudiantes.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

    }


}



