package com.marcosferrandiz.PrimerEjemplo;

import java.io.File;
import java.io.FileReader;

public class Cat {
    public static void main(String[] args) {
        if (args.length != 1){
            throw new RuntimeException("Debe indicar la ruta del archivo");
        }
        String rutaArchivo = args[0];
        File file = new File(rutaArchivo);

        if(file.exists()){
            System.out.println("El archivo existe");
        }else {
            System.out.println("El archivo no existe");
        }

    }
}
