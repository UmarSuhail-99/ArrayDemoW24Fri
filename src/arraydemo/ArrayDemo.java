/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo;

import java.util.Scanner;

/**
 *
 * @author umers
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter a String");
        Scanner input = new Scanner(System.in);
        String myword = input.nextLine();
        
        
        char[] myletters = new char[myword.length()]; 
        
        for(int i=0 ; i<myletters.length; i++){
            myletters[i] = myword.charAt(i);
        }
        System.out.println("in reverse");
        
        for(int i= myletters.length-1 ; i>=0; i--){
            System.out.println(myletters[i]);
        }
             
    }// end of main
    
}
