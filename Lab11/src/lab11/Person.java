/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author 1812962
 */

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean insured;
    
    public Person(){
        firstName = "Joe";
        lastName = "Bloggs";
        age = 18;
        insured = false;
    }
    
    public Person(String name, String surname, int yearsOld, boolean insurance){
        firstName = name;
        lastName = surname;
        age = yearsOld;
        insured = insurance;
    }
    
    /**
    * This method returns the first name of the person
    * @return A String detailing the person's first name
    */
    
    public String getName(){
        return firstName;
    }
    
    public String getSurname(){
        return lastName;
    }
    
    public int getAge(){
        return age;
    }
    
    public Boolean getInsured(){
        return insured;
    }
    
    public void setName(String name){
        firstName = name;        
    }
    
    public void setSurname(String surname){
        lastName = surname;
    }
    
    public void setAge(int years){
        age = years;
    }
    
    public void setInsured(boolean insurance){
        insured = insurance;
    }
    
    public String toString(){
        String output = "";
        output += firstName + " " + lastName + " is " + age + " years old "
                + "and ";
        if(insured){
            output += "is insured.";
        }
        else{
            output += "is not insured.";
        }
        return output;                
    }
    
}