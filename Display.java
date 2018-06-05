package com.epdubiso;

import java.util.Scanner;

public class Display {
	Substitution substitution = new Substitution();
    Scanner scan;
    public Display(){
    	scan= new Scanner(System.in);
    	setSubstitutionAttributes();
      	addCertificates();
      	displaySubstitution();
    }
    
    private void setSubstitutionAttributes(){
    	System.out.println("Enter the Substitution ID");
    	substitution .setSubstitutionID(scan.nextLine());
    	
    	System.out.println("Enter the SubstitutionCourse ID");
    	substitution.setSubstitutionCourseID(scan.nextLine());
    	
    	System.out.println("Enter the Substitution Certificate ID");
    	substitution.setSubstitutionCertificateID(scan.nextLine());
    	
    	System.out.println("Enter the Date");
    	substitution.setSubstitutionDate(scan.nextLine());
    	
    	System.out.println("Enter the show time");
    	substitution.setSubstitutionTime(scan.nextLine());
    	
    	substitution.setRestricted(false);
    	
    	System.out.println("Enter Authorised By");
    	substitution.setAuthorisedBy(scan.nextLine());
        
    }
    
    private void addCertificates(){
    	System.out.println("How many certificates do you want to substitute");
    	int number=scan.nextInt();
    	scan.nextLine();
    	for (int i=0;i<number;i++)
    	{
    		Certificate c = new Certificate();
    		System.out.println("Enter the Certificate");
       		c.setCertificateName(scan.nextLine());
       		 substitution.AddCertificate(c);
    	}
    }
    
    private void displaySubstitution(){
    	System.out.println(substitution.toString());
    } 
    
}