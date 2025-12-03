package scenario1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bf=new BufferedReader(new FileReader("scenario1/input.txt"))){
            System.out.println(bf.readAllLines());
        } catch (FileNotFoundException e) {
            System.out.println("File not found :- "+e.getMessage());
        } catch (IOException e) {
            System.out.println("An I/O error occurred :- "+e.getMessage());
        } 
    }
}