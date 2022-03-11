package Drivers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

import Classes.Artist;
import Classes.Book;
import Classes.Item;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Item> myInv = new ArrayList<Item>();
        
        //System.out.println(myInv.get(0).toString());
        TreeSet<String> instruments = new TreeSet<String>();
        instruments.add("guitar");
        instruments.add("piano");
        instruments.add("bass");

        Artist hotPlate = new Artist("Hot Plate", new TreeSet<String>());
        hotPlate.addMember("Stan Green", instruments);

        try {

            FileInputStream in = new FileInputStream("C:\\Users\\7J4074897\\Documents\\store\\store\\src\\files\\inventory.txt");
            InputStreamReader read = new InputStreamReader(in);
            LineNumberReader lineReader = new LineNumberReader(read);
            Scanner scan = new Scanner(lineReader);
            scan.useDelimiter(",");
            while(scan.hasNextLine()){
                
                myInv.add(new Book(scan.next(),scan.nextDouble(),scan.nextInt(),scan.next(),scan.next(),scan.next()));
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!\n\n");
            e.printStackTrace();
        }
        System.out.println(hotPlate.showMembers());
    }
    
}
