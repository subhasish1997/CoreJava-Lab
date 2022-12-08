package lab0812;

import java.util.*;


class ContactBook{
	String Name,Email_ID;
	double Contact_number;
	
  public static void main(String args[]){
	  
	  Scanner scc=new Scanner(System.in);
	  int n=0;
	  int a;
	  System.out.println("How many Contacts you want to add: ");
	   a =scc.nextInt();
	   Scanner sc=new Scanner(System.in);
	  while(n<a) {
	    System.out.println("Enter Name ");
	    String Name=sc.nextLine();
	    System.out.println("Enter Contat_number ");
	    String Contact_number= sc.nextLine();
	    System.out.println("Enter Email_ID ");
	    String Email_ID=sc.nextLine();
	   
	  
    ArrayList<String> arrList=new ArrayList<>();
    
    arrList.add("Contact_Name:"+ Name);
    arrList.add("Contact_Number:"+ Contact_number);
    arrList.add("Contact_Email:"+ Email_ID);

	  
   
    
    for(String str:arrList)
    	
      System.out.println(str);
      System.out.println();
       n=n+1;
	  }
}}
