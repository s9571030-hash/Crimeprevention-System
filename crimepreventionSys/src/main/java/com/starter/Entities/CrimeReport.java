package com.starter.Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class CrimeReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String category; // e.g., Theft, Vandalism, Suspicious Activity
    private String area;
    private String description;
    private String status = "PENDING";
    private LocalDateTime reportedAt = LocalDateTime.now();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getReportedAt() {
		return reportedAt;
	}
	public void setReportedAt(LocalDateTime reportedAt) {
		this.reportedAt = reportedAt;
	}
	public CrimeReport(Long id, String title, String category, String area, String description, String status,
			LocalDateTime reportedAt) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.area = area;
		this.description = description;
		this.status = status;
		this.reportedAt = reportedAt;
	}
	public CrimeReport() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
