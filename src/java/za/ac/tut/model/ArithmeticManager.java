/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

/**
 *
 * @author moren
 */
public class ArithmeticManager {
    public int add(int num1, int num2) throws NumbersException{
        if (isValid(num1, num2)) {
            return num1 + num2;
        }else{
            throw new NumbersException("The numbers must be positive {" +num1+ ", " + num2 + "} " );
        }
    }
    public int subtract(int num1, int num2)throws NumbersException{
        if (isValid(num1, num2)) {
            return num1 - num2;
        }else{
            throw new NumbersException("The numbers must be positive {" +num1+ ", " + num2 + "} " );
        }
    }
    public int multiply(int num1, int num2)throws NumbersException{
        if (isValid(num1, num2)) {
            return num1 * num2;
        }else{
            throw new NumbersException("The numbers must be positive {" +num1+ ", " + num2 + "} " );
        }
    }
    public double divide(int num1, int num2)throws NumbersException{
        if (isValid(num1, num2)) {
            return ((num1 / num2) / 100.0 ) * 100;
        }else{
            throw new NumbersException("The numbers must be positive {" +num1+ ", " + num2 + "} " );
        }
    }

    private boolean isValid(int num1, int num2) {
        boolean isValid = false;
        
        if (num1 > 0 && num2 > 0) {
            isValid = true;
        }
        return isValid; 
    }
}
