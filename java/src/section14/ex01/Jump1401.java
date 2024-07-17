package section14.ex01;

import java.io.BufferedReader;
import java.io.FileReader;

public class Jump1401 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("java\\src\\section14\\ex01\\text_smaple.txt"));
        
        String line;
        line = br.readLine();
        System.out.println(line);
        br.close();
    }
}
