/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.zc.tut.model;

/**
 *
 * @author moren
 */
public class ArithmeticManager {
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public int subtract(int num1, int num2){
        return num1 - num2;
    }
    public int multiply(int num1, int num2){
        return num1 * num2;
    }
    public double divide(int num1, int num2){
        return ((num1 / num2) / 100.0 ) * 100;
    }
    public double mod(int num1, int num2){
        return (num1 % num2) ;
    }
}
