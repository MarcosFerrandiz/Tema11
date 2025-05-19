package com.marcosferrandiz.CarpetaSeguridad.Ejercicio10;

import java.io.*;
import java.nio.file.attribute.DosFileAttributes;

public class Ejercicio10 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Debe indicar la ruta del archivo");
            System.exit(-1);
            // throw new RuntimeException("Debe indicar la ruta del archivo");
        }

        File file1 = new File(args[0]);
        File file2 = new File(args[1]);
        concat(file1,file2);

    }
    public static void concat(File file1, File file2){
        try (
                FileReader fileReader1 = new FileReader(file1);
                FileReader fileReader2 = new FileReader(file2);
                FileWriter fileWriter = new FileWriter("D:\\clase\\programacion\\intelliJ\\Tema11\\src\\main\\java\\com\\marcosferrandiz\\CarpetaSeguridad\\Ejercicio10\\TextosJuntados");
                BufferedWriter bw = new BufferedWriter(fileWriter);
        ) {
            int c;
            while ((c = fileReader1.read()) != -1){
                bw.write((char)c);
            }
            bw.write(" ");
            while ((c = fileReader2.read()) != -1){
                bw.write((char)c);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
