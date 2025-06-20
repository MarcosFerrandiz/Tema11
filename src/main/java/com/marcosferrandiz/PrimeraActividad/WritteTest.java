package com.marcosferrandiz.PrimeraActividad;

import java.io.*;

public class WritteTest {
    private static final String FILE_PATH = "C:\\Users\\marcos.ft\\Desktop\\datos.txt";
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Debe indicar el texto a guardar");
            System.exit(-1);
            // throw new RuntimeException("Debe indicar la ruta del archivo");
        }
        String texto = args[0];

        File file = new File(FILE_PATH);
        boolean append = file.exists();
        try (
                FileWriter fileWriter = new FileWriter(file, append);
                BufferedWriter bw = new BufferedWriter(fileWriter);
        ) {
            bw.write(texto);
        } catch (FileNotFoundException fnfe) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        } catch (IOException ioe) {
            System.out.println("Error de escritura");
            System.exit(-1);
        }

    }
}
