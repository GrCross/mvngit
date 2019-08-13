package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static LinkedList<Double> linked = new LinkedList<Double>();
    public static void main( String[] args ) throws FileNotFoundException
    {
        File file = new File(".\\entry2.in"); 
                

        Scanner sc = new Scanner(file);
        while(sc.hasNext()){
            Double a = Double.parseDouble(sc.nextLine());
            linked.add(a);
        }

        System.out.println("mean: "+ mean());
    }

    private static double mean(){    
        double sum = 0;
        for (int i = 0; i < linked.size(); i++) {
            
            sum += linked.get(i);
            
        }
        
        Double mean = (double)sum/linked.size();
        return mean;
    }

    
}
