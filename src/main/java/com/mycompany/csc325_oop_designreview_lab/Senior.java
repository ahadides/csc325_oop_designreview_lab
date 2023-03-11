/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * Senior class which is child of student 
 * @author ahmad
 */
public class Senior extends Student{

int Credit;
    /**
     * Senior Constructor with just credit as parameter 
     * @param Credit - student total credits
     */
    public Senior(int Credit) {
       if(Credit > 85) //Senior need more than 85 credits
            this.Credit = Credit;
        else{
            System.out.println("Not A Senior.");
        }
    }
    /**
     * Senior Constructor with just with name, age, and credit as parameter 
     * @param name
     * @param age
     * @param Credit 
     */ 
    public Senior(String name, short age,int Credit) {
        super(name, age);
        if(Credit > 85)
            this.Credit = Credit;
        else{
            System.out.println("Not A Senior.");
        }
    }
/**
 * Senior Constructor with all the parameter, even the parent class parameter
 * @param name
 * @param age
 * @param Credit
 * @param GPA 
 */
    public Senior(String name,short age,int Credit, int GPA) {
        super(name, age, GPA);
        if(Credit > 85)
            this.Credit = Credit;
        else{
            System.out.println("Not A Senior.");
        }
    }
    /**
     * Getter for the credit parameter
     * @return 
     */
    public int getCredit() {
        return Credit;
    }
    /**
     * Setter for the credit parameter 
     * @param Credit 
     */
    public void setCredit(int Credit) {
       if(Credit > 85)
            this.Credit = Credit;
        else{
            System.out.println("Not A Senior.");
        }
    }
    /**
     * toString method for the senior class, includes the parent class parameter
     * @return 
     */
    @Override
    public String toString() {
        return "Senior{" + "Name="+this.getName()+" Age="+ this.getAge()+ " GPA="+this.getGPA()+ " Credit=" + Credit +'}';
    }
    
    

    
    
    
}
