package com.marcosferrandiz.PrimeraActividad;

import java.io.*;

public class FileWriterCat {
    private static final String FILE_PATH = "C:\\Users\\marcos.ft\\Desktop\\datos.txt";
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Debe indicar el texto a guardar");
            System.exit(-1);
        }
        String texto = args[0];
        File file = new File(FILE_PATH);

        boolean append = file.exists();

        try(FileWriter fileWriter = new FileWriter(file, append)) {
            fileWriter.write(texto);
        }catch (FileNotFoundException fnfe){
            System.out.println("El archivo no existe");
            System.exit(-1);
        }catch (IOException ioe){
            System.out.println("Error al leer el archivo");
            System.exit(-1);
        }
    }
}
