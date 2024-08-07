package com.spring.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class teacherEntity {
	
	@Id
	private int teacherID;
	private String teacherName;
	private String teachingSubject;
	
	public teacherEntity() {
		
	}

	public teacherEntity(int teacherID, String teacherName, String teachingSubject) {
		super();
		this.teacherID = teacherID;
		this.teacherName = teacherName;
		this.teachingSubject = teachingSubject;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeachingSubject() {
		return teachingSubject;
	}

	public void setTeachingSubject(String teachingSubject) {
		this.teachingSubject = teachingSubject;
	}

	@Override
	public String toString() {
		return "teacherEntity [teacherID=" + teacherID + ", teacherName=" + teacherName + ", teachingSubject="
				+ teachingSubject + "]";
	}
		
	

}
