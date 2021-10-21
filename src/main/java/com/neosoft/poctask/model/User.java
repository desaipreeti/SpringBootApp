package com.neosoft.poctask.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;






@Entity
@SQLDelete(sql = "UPDATE user SET deleted=true WHERE userId=?")
@Where(clause = "deleted = false")

public class User  {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  int userId;
	    
	    @NotNull
	    @Size(min = 2, message = "Name should have atleast 2 characters")
	    private String name;
	    
	    @NotNull
	    @Size(min = 4, message = "Name should have atleast 2 characters")
	    private  String surname;
	    
	    @NotNull
	    private  String pincode;
	    
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    @NotNull(message = "Please provide a date.")
	    private Date dob;
	    
	    
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    @NotNull(message = "Please provide a date.")
	    private  Date  doj;

	    private Boolean deleted=Boolean.FALSE;

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public String getPincode() {
			return pincode;
		}

		public void setPincode(String pincode) {
			this.pincode = pincode;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		public Date getDoj() {
			return doj;
		}

		public void setDoj(Date doj) {
			this.doj = doj;
		}

		public Boolean getDeleted() {
			return deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		@Override
		public String toString() {
			return "User [userId=" + userId + ", name=" + name + ", surname=" + surname + ", pincode=" + pincode
					+ ", dob=" + dob + ", doj=" + doj + ", deleted=" + deleted + "]";
		}
	    

		
		
	    
	    
	    
	    
	    
	    
	   
	    

}
