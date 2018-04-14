/********************************************************************************
 * Program Name:          FileIo
 * Program Description:   FIleIo
 *
 * Program Author:        Waiyat Hamdani
 * Date Created:          12/2/2016
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    -------------------
********************************************************************************/
package inclass10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Inclass10 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
File f1 = new File("f:\\EmployeeEmails.txt");
File f2 = new File("f:\\EmployeeNames.txt");
if (f1.exists()) {
System.out.println("Error,Output File Already Exist...");
System.exit(0);
} 
else if (!f2.exists()) {
System.out.println("Error,Input File Doesn't Exist...");
System.exit(0);
} 
else {
Scanner in = new Scanner(System.in);
System.out.println("Enter domain name (e.g. ibm):");
String str = "@" + in.nextLine() + ".com";
Scanner fin = new Scanner(f2);
FileWriter fo = new FileWriter("f:\\EmployeeEmails.txt", false);
BufferedWriter bw = new BufferedWriter(fo);
String fname, mname, lname, dmn;
char f, m;

while (fin.hasNext()) {
fname = fin.next();
f = fname.charAt(0);
mname = fin.next();
m = mname.charAt(0);
lname = fin.next();
dmn = f + m + lname + str;
System.out.println(fname + " " + mname + " " + lname + " " + dmn);
bw.append(fname + " " + mname + " " + lname + " " + dmn + "\n");
}
fo.write(bw.toString());
System.out.println("data entered successfully");
}

    }
    
}
