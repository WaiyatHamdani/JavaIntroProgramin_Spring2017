/******************************************************************************
 * Program Name:          Lab09 - TestQuadratic equation/quadratic Equation
 * Program Description: two separate classes for TestQuadratic equation and quadratic Equation
 * Program Author:        Waiyat Hamdani
 * Date Created:          11/17/2016
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************/
package lab09waiyat;

public class quadraticEquation {   
private int a,b,c;
public quadraticEquation(int newA,int newB,int newC){
a=newA;
b=newB;
c=newC;
}
public int getA() {
return a;
}
public int getB() {
return b;
}
public int getC() {
return c;
}
public int getDiscriminant()
{
return b*b-4*a*c;
}

public double getRoot1()
{
if(getDiscriminant()<0)return 0;
return (-b-Math.sqrt(getDiscriminant()))/(2*a);
}
public double getRoot2()
{
if(getDiscriminant()<0)return 0;
return (-b+Math.sqrt(getDiscriminant()))/(2*a);


    }
}