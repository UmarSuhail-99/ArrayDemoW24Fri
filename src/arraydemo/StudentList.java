/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 *
 * @author umers
 */
public class StudentList {
    
    
    public static void main(String[] args){
    //Student s1 = new Student('Umar', 1);
    
    Student[] studentlist = new Student[3];
    
    Student s1 = new Student("Umar" , 1);
    studentlist[0] = s1;
    studentlist[1] = new Student("Piyush", 2);
    studentlist[2] = new Student("Hello", 3);
    
    
    for(int i = 0; i<studentlist.length; i++){
        System.out.println(studentlist[i].getsName());
    }
    
    
    
    }
}
