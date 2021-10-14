package labs.lab_8;

import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Main
{
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage java labs.lab_7.Main {FILE} {MESSAGE}");
            return;
        }

        String filename = args[0];
        String msg = args[1];

        try {
            Files.write(Paths.get(filename), msg.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}