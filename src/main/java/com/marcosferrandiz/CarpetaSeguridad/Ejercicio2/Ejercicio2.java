package com.marcosferrandiz.CarpetaSeguridad.Ejercicio2;

import java.io.File;
import java.util.Arrays;

public class Ejercicio2 {
    private static final String FILE_PATH = "D:\\clase\\programacion\\intelliJ\\Tema11\\src\\main\\java\\com\\marcosferrandiz\\CarpetaSeguridad\\Ejercicio2";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        System.out.println(Arrays.toString(file.list()));
    }
}
