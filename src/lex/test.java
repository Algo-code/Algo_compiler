package lex;
import java.io.*;
import java.util.Arrays;

public class test {

    public static void main(String[] args) throws Exception {
        File file = new File("Source.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();
        String line;
        String[]tokens = new String[1000];
        while ((line = br.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
            tokens = line.split("\\s");
        }
        fr.close();
        System.out.println("Contents of file: \n");
        System.out.print(Arrays.toString(tokens));

    }
}