/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 *
 * @author umers
 */
public class Student {
    private String sName;
    private int sID;

    public Student(String sName, int sID) {
        this.sName = sName;
        this.sID = sID;
    }

    
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }
    
    
}
