package com.epdubiso;

import java.util.ArrayList;

public class Substitution {
	 private String substitutionID;
	  private String substitutionCourseID;
	  private String substitutionCertificateID;
	  private String substitutionDate;
	  private String substitutionTime;
	  private ArrayList<Certificate> certificates;
	  private boolean restricted;
	  private String authorisedBy;
	 
	  public Substitution(){
		  certificates=new ArrayList<Certificate>();

}

	public String getSubstitutionID() {
		return substitutionID;
	}

	public void setSubstitutionID(String substitutionID) {
		this.substitutionID = substitutionID;
	}

	public String getSubstitutionCourseID() {
		return substitutionCourseID;
	}

	public void setSubstitutionCourseID(String substitutionCourseID) {
		this.substitutionCourseID = substitutionCourseID;
	}

	public String getSubstitutionCertificateID() {
		return substitutionCertificateID;
	}

	public void setSubstitutionCertificateID(String substitutionCertificateID) {
		this.substitutionCertificateID = substitutionCertificateID;
	}

	public String getSubstitutionDate() {
		return substitutionDate;
	}

	public void setSubstitutionDate(String substitutionDate) {
		this.substitutionDate = substitutionDate;
	}

	public String getSubstitutionTime() {
		return substitutionTime;
	}

	public void setSubstitutionTime(String substitutionTime) {
		this.substitutionTime = substitutionTime;
	}

	public boolean isRestricted() {
		return restricted;
	}

	public void setRestricted(boolean restricted) {
		this.restricted = restricted;
	}

	public String getAuthorisedBy() {
		return authorisedBy;
	}

	public void setAuthorisedBy(String authorisedBy) {
		this.authorisedBy = authorisedBy;
	}
	
	public void AddCertificate(Certificate c){
		certificates.add(c);
	}
	 
	public String toString(){
	   String  substitutionInfo = getSubstitutionID() + "\n" + getSubstitutionCourseID() + "\n"  
	+ getSubstitutionCertificateID() + "\n" + getSubstitutionDate() + "\n" + getSubstitutionTime()
	   + "\n" + getAuthorisedBy() + "\n";
	   
	   for(Certificate c : certificates){
		   substitutionInfo += c.getCertificateName() + "\n";
	   }
	   return  substitutionInfo;
	}

	
	
}
