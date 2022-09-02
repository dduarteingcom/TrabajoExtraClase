package com.example.trabajoextraclase;

public class EstudiantesA extends Estudiantes{
    public EstudiantesA(String carne, String nombre, String correo, String telefono, String nickname, String promExam,
                        String promQuices, String promTareas, String notaPro1, String notaPro2,
                        String notaPro3, String tipoEstud,String promProyecto, String promEQT,String nFinal){
        super(carne, nombre, correo, telefono, nickname, promExam, promQuices, promTareas, notaPro1, notaPro2, notaPro3, tipoEstud,promProyecto,promEQT,nFinal);
    }
    @Override
    public  String notaPromedio(int promExam,int promQuices,int promTareas,int notaPro1,int notaPro2,int notaPro3){
        int res = 0;
        res = (promExam + promQuices+ promTareas)/3;
        return Integer.toString(res);
    }
    /*
    @Override
    public String notaFinal(int promExam,int promQuices,int promTareas,int notaPro1,int notaPro2,int notaPro3){
        int res = 0;
        res = (promExam + promExam + promTareas + notaPro1 + notaPro2 + notaPro3)/6;
        return Integer.toString(res);
    }
    */

}