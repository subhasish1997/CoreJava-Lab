package lab1011;

import java.util.Scanner;
public class StudentMarks {
public static void main(String[] args) {
    


	Scanner sc = new Scanner(System.in);                                                                                                                                                                   
    double[] marks = new double[10];
    String[] names = new String[10];
    double max;                                                                                                                                                                                             
    int i;                                                                                                                                                                                                     

    for(i=0; i<3; i++) {  
         System.out.println("Enter name of student: ");                                                                                                                                                                   
        names[i] = (sc.nextLine()); 
        System.out.println("Enter marks: ");                                                                                                                                                                   
        marks[i] = sc.nextDouble(); 
        sc.nextLine();
    }                         
    int position = 0;
    max = marks[i];                                                                                                                                                                                            
    for(i = 0; i < 3; i++) {                                                                                                                                                                                  
        if(max < marks[i]) {                                                                                                                                                                                   
            max = marks[i]; 
            position = i;
        }                                                                                                                                                                                                      
    }                                                                                                                                                                                                          
    System.out.println("Highest marks:"+ marks[position] + " student name " + names[position]);
}
}
