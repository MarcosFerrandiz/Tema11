package com.marcosferrandiz.CarpetaSeguridad.EjercicioExtra;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class EjerciciotextoAMorse {
    private static Map<Character,String> mapaConversionMorse = new HashMap<>();
    public static void main(String[] args) {

        rellenarMapa();

        if (args.length != 1) {
            System.out.println("Debe indicar la ruta del archivo");
            System.exit(-1);
            // throw new RuntimeException("Debe indicar la ruta del archivo");
        }

        String rutaArchivo = args[0];
        File file = new File(rutaArchivo);
        codificarTextoAMorse(file);

    }

    public static void rellenarMapa(){
        mapaConversionMorse.put('A',"._");
        mapaConversionMorse.put('B',"_...");
        mapaConversionMorse.put('C',"_._.");
        mapaConversionMorse.put('D',"_..");
        mapaConversionMorse.put('E',"_.");
        mapaConversionMorse.put('F',".._.");
        mapaConversionMorse.put('G',"__.");
        mapaConversionMorse.put('H',"....");
        mapaConversionMorse.put('I',"..");
        mapaConversionMorse.put('J',".___");
        mapaConversionMorse.put('K',"_._");
        mapaConversionMorse.put('L',"._..");
        mapaConversionMorse.put('M',"__");
        mapaConversionMorse.put('N',"_.");
        mapaConversionMorse.put('O',"___");
        mapaConversionMorse.put('P',".__.");
        mapaConversionMorse.put('Q',"__._");
        mapaConversionMorse.put('R',"._.");
        mapaConversionMorse.put('S',"...");
        mapaConversionMorse.put('T',"_");
        mapaConversionMorse.put('U',".._");
        mapaConversionMorse.put('V',"..._");
        mapaConversionMorse.put('W',".__");
        mapaConversionMorse.put('X',"_.._");
        mapaConversionMorse.put('Y',"_.__");
        mapaConversionMorse.put('Z',"_.__");
        mapaConversionMorse.put('0',"_____");
        mapaConversionMorse.put('1',".____");
        mapaConversionMorse.put('2',"..___");
        mapaConversionMorse.put('3',"...__");
        mapaConversionMorse.put('4',"...._");
        mapaConversionMorse.put('5',".....");
        mapaConversionMorse.put('6',"_....");
        mapaConversionMorse.put('7',"__...");
        mapaConversionMorse.put('8',"___..");
        mapaConversionMorse.put('9',"____.");
        mapaConversionMorse.put('.',".-.-.-");
        mapaConversionMorse.put(',',"--..--");
        mapaConversionMorse.put(' ',"   ");
    }

    public static void codificarTextoAMorse(File file){
        try (
                FileWriter fileWriter = new FileWriter("D:\\clase\\programacion\\intelliJ\\Tema11\\src\\main\\java\\com\\marcosferrandiz\\CarpetaSeguridad\\EjercicioExtra\\TextoEnMorse");
                FileReader fileReader = new FileReader(file);
                BufferedWriter bw = new BufferedWriter(fileWriter);
                )
        {
            char c;
            while ((c = (char) fileReader.read()) != -1){
                
                String lectraMorse = mapaConversionMorse.get(c);
                bw.write(lectraMorse);
                bw.write(" ");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
