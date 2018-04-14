/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author 01659956
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Check number of strings passed
    // Pass arguments in Netbeans: right-click on the Project, then properties, then run, then enter arguments in quotes 
    // To get the Command Prompt in Windows 8, press Win X keys simultaneously to get the   
    // Pass arguments in Command Prompt: java Calculator arg1 arg2 arg3
    if (args.length != 1) {
      System.out.println(
        "Usage: java Calculator \"operand1 operator operand2\"");
      System.exit(0);
    }

    // The result of the operation
    int result = 0;

    // The result of the operation
    String[] tokens = args[0].split(" ");

    // Determine the operator
    switch (tokens[1].charAt(0)) {
      case '+': result = Integer.parseInt(tokens[0]) +
                         Integer.parseInt(tokens[2]);
                break;
      case '-': result = Integer.parseInt(tokens[0]) -
                         Integer.parseInt(tokens[2]);
                break;
      case '*': result = Integer.parseInt(tokens[0]) *
                         Integer.parseInt(tokens[2]);
                break;
      case '/': result = Integer.parseInt(tokens[0]) /
                         Integer.parseInt(tokens[2]);
    }

    // Display result
    System.out.println(tokens[0] + ' ' + tokens[1] + ' ' 
      + tokens[2] + " = " + result);
    }
    
}
