/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * Freshman class which is child of student 
 * @author ahmad
 */
public class Freshman extends Student {

        private int Credit;
        /**
         * Freshman Constructor with just with name, age, and credit as parameter
         * @param name
         * @param age
         * @param Credit 
         */
    public Freshman(String name,short age, int Credit) {
        super(name, age);
        this.Credit = Credit;
    }
    /**
     * Freshman Constructor with all the parameter, even the parent class parameter
     * @param Credit
     * @param name
     * @param age
     * @param GPA 
     */
    public Freshman(int Credit, String name, short age, int GPA) {
        super(name, age, GPA);
        this.Credit = Credit;
    }
    /**
     * toString method for the senior class, includes the parent class parameter
     * @return 
     */
    @Override
    public String toString() {
        return "Freshman{" + "Name="+this.getName()+" Age="+ this.getAge()+ " GPA="+this.getGPA()+ " Credit=" + Credit +'}';
    }
        
  
    
}
