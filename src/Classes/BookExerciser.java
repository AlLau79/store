package Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.List;
import java.util.Scanner;

public class BookExerciser {
    
    public static void main(String [] args){
        
    }

    public List<Book> readBooksFromFile(String name){
        
        try {
            FileInputStream in = new FileInputStream(name);
            InputStreamReader read = new InputStreamReader(in);
            LineNumberReader lineReader = new LineNumberReader(read);
            Scanner scan = new Scanner(lineReader);
            while(scan.hasNextLine()){
                
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
