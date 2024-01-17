/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author himan
 */
public class StudentList {
    public static void main(String[] args){
        Student s1 = new Student(1,"Himanshu");
        Student[] studentList = new Student[3];
        
        studentList[0]= s1;
        studentList[1] = new Student(2,"abc");
        studentList[2] = new Student(3,"xyz");
        
        for(int i =0;i<studentList.length;i++){
            System.out.println(studentList[i].getSname());
        }
    
    }//end of main
    
}//end of class
