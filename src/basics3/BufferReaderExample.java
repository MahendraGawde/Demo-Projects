package src.basics3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferReaderExample {

    public static void main(String[] args) throws IOException {
        int num =0;
        BufferedReader br=null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            System.out.println("Enter the number");
            num=Integer.parseInt(br.readLine());
            System.out.println(num);

        } finally {
            System.out.println("bye");
            br.close();
        }

    }
}
