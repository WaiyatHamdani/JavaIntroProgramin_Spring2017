/*
****************************************************************************************
 * Program Name:             Lab10  
 *                         
 * Program Description:      This programm takes input from the file, calculates number 
 *                           of character.
 *                          
 *                                                   
 *
 * Program Author:           Waiyat
 * Date Created:             12/09/2016
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
*****************************************************************************************
*/
package lab10waiyat;

import java.io.BufferedWriter;
 import java.io.File;
 import java.io.FileWriter;
 import java.util.Scanner;


public class Lab10Waiyat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try {
            
            if (args.length < 2) {

               System.out.println("Enter input and output file names ");
                return;

           }

           File onFile = new File(args[0]);
            File outFile = new File(args[1]);
            // check input file exist
            if (!onFile.exists()) {
                System.out.println(args[0] + " not exist");
                return;

           }

           Scanner input = new Scanner(onFile);
            int numOfLines = 0, numOfChars = 0;

           boolean flag = true;
            while (input.hasNext()) {

               String line = input.nextLine();
                numOfLines++;
                numOfChars += line.length();
                if (flag) {
                    if (line.toUpperCase().contains("JAVA"))
                        flag = false;
                }

           }


           if (!outFile.exists()) {
                outFile.createNewFile();
            }

           FileWriter files = new FileWriter(outFile.getAbsoluteFile());
            try (BufferedWriter files1 = new BufferedWriter(files)) {
                files1.write("File " + args[0] + " has\n");
                files1.write(numOfChars + " characters\n");
                files1.write(numOfLines + " lines\n");
                if (!flag) {
                    files1.write("Java appears in the input file");
                } else {
                    files1.write("Java not appears in the input file");
                }
            }

       } catch (Exception e) {
            // TODO: handle exception
        }
    }
 }
