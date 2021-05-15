package com.example.segundaWeb;
import java.util.ArrayList;
import java.util.List;

public class AlumnaDAO {
    public static List<Alumna> getAlumnas() {
        List<Alumna> alumnas = new ArrayList<>();

        alumnas.add(new Alumna("natalia","back5"));
        alumnas.add(new Alumna("sabri","back5"));
        alumnas.add(new Alumna("juli","front8"));
        alumnas.add(new Alumna("agus","back5"));
        alumnas.add(new Alumna("anto","front8"));
        alumnas.add(new Alumna("alba","front8"));
        alumnas.add(new Alumna("brigitte","front8"));
        alumnas.add(new Alumna("eve","front8"));
        alumnas.add(new Alumna("vane","back5"));
        alumnas.add(new Alumna("libia","front8"));
        alumnas.add(new Alumna("justyne","back5"));


        return alumnas;
    }
}