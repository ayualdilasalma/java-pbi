package com.mitrais.implementation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamExercise {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("D:/test.txt");
            out = new FileOutputStream("D:/output.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}