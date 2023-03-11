/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * Student class extends to the Human class
 * @author MoaathAlrajab
 */
public class Student extends Human {

    // ToDo 1: Make this class a child of Person
    // ToDo 1: Make this class a child of Human
    // ToDo 2: Fix the resulting errors
    // ToDo 3: Add a field for GPA and create setter and getter
    // ToDo 4: Add comments to your code
    private int GPA; // only GPA parameter
    
     /**
      * Student constructor with just name and age as parameter
      * @param name
      * @param age 
      */
    public Student(String name, short age) {
        super(name, age);
    }
        /**
         * student parameter with all the parameter
         * @param name
         * @param age
         * @param GPA 
         */
    public Student(String name, short age, int GPA) {
        super(name, age);
        this.GPA = GPA;
        
    }
    /**
     * abstract methods
     * @return 
     */
    @Override
    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /**
     * GOA getter 
     * @return 
     */
    public int getGPA() {
        return GPA;
    }
    /**
     * Setter GPA
     * @param GPA 
     */
    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
    /**
     * tostring for the Student class 
     * @return 
     */
    @Override
    public String toString() {
        return "Student{" + "GPA=" + GPA + '}';
    }


    
    
}
