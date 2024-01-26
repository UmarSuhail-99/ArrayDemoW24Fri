/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 *
 * @author umers
 */
public class PartTimeStudent extends Student{
    private int NumberOfCourses;

    public PartTimeStudent(int NumberOfCourses, String sName, int sID) {
        super(sName, sID);
        this.NumberOfCourses = NumberOfCourses;
    }

    public int getNumberOfCourses() {
        return NumberOfCourses;
    }

    public void setNumberOfCourses(int NumberOfCourses) {
        this.NumberOfCourses = NumberOfCourses;
    }

    
}
    

