package com.marcosferrandiz.CarpetaSeguridad.Ejercicio7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio7 {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Debe indicar la ruta del archivo");
            System.exit(-1);
            // throw new RuntimeException("Debe indicar la ruta del archivo");
        }

        String rutaArchivo = args[0];
        File file = new File(rutaArchivo);
        leerArchivoBinario(file);
    }

    public static void leerArchivoBinario(File file){
        try (FileInputStream fis = new FileInputStream(file)) {
            while (fis.read() != -1){
                System.out.printf("%02X ", fis.read());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
