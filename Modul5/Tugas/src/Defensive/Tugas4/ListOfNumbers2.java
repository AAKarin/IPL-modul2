package Defensive.Tugas4;

import java.io.*;
import java.util.Vector;

public class ListOfNumbers2 {
    private Vector<Integer> victor;
    private static final int size = 10;

    public ListOfNumbers2() {
        victor = new Vector<>(size);
        for (int i = 0; i < size; i++) {
            victor.addElement(i);
        }
        try {
            this.readList("infile.txt");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: infile.txt");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        try {
            this.writeList();
        } catch (IOException e) {
            System.err.println("Error writing to output file: " + e.getMessage());
        }
    }

    public void readList(String fileName) throws IOException {
        String line = null;
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            while ((line = raf.readLine()) != null) {
                try {
                    Integer i = Integer.parseInt(line.trim());
                    System.out.println(i);
                    victor.addElement(i);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format in file: " + line);
                }
            }
        }
    }

    public void writeList() throws IOException {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("outfile.txt"));
            for (int i = 0; i < victor.size(); i++) {
                out.println("Value at: " + i + " = " + victor.elementAt(i));
            }
        } finally {
            if (out != null) {
                out.close();
                System.out.println("PrintWriter closed successfully.");
            } else {
                System.err.println("PrintWriter was not opened.");
            }
        }
    }

    public static void main(String[] args) {
        new ListOfNumbers2();
    }
}
