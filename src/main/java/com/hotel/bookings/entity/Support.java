package com.hotel.bookings.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;



@Embeddable
public class Support implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	private String comments;
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Support() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Support(String comments) {
		super();
		this.comments = comments;
	}
	

	@Override
	public String toString() {
		return "Support [status=" + status + ", comments=" + comments + "]";
	}
	
}
