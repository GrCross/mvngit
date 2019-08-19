package edu.escuelaing.arem.ASE.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class CalcApplication {

    public static void main(String[] args) throws FileNotFoundException,IOException{
        
        File file = new File("./inputFolder/entry.in"); 
        Calc calc = new Calc(file);

        FileWriter fw = new FileWriter("./inputFolder/answer.out");    
        fw.write("mean:\n");
        fw.write(calc.mean()+"\n");
        fw.write("desviation: \n");
        fw.write(calc.desviation()+"\n");
        fw.close();

        file = new File("./inputFolder/entry2.in"); 
        calc = new Calc(file);
        fw = new FileWriter("./inputFolder/answer2.out");    
        fw.write("mean:\n");
        fw.write(calc.mean()+"\n");
        fw.write("desviation: \n");
        fw.write(calc.desviation()+"\n");
        fw.close();


    }
}
