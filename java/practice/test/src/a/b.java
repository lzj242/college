package a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.FileWriter;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {

        Cruncher crun = new Cruncher();
        char ch = 'p';
        crun.crunch(ch);
    }

}

class Cruncher {
    void crunch(int i) {
        System.out.println("int");
    }

    void crunch(String s) {
        System.out.println("String");
    }
}
