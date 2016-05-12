package com.estsoft.guestbook.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="guestbook")
public class Guestbook {
	@Id
	@Column(name="no")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long no;
	
	@Column(name="name", nullable=false, length=100)
	private String name;
	
	@Column(name="reg_date", nullable=false)
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date regDate;
	
	@Column(name="message", nullable=false)
	@Lob
	private String message;
	
	@Column(name="passwd", nullable=false, length=64)
	private String password;
	
	@Column(name="gender", nullable=false)
	@Enumerated(value=EnumType.STRING)
	private Gender gender;
	
	@Transient
	private String temp;

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Guestbook [no=" + no + ", name=" + name + ", regDate=" + regDate + ", message=" + message
				+ ", password=" + password + "]";
	}
}
