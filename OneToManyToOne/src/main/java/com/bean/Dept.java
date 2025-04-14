package com.bean;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "dept")
public class Dept {

	private int did;
	private String dname,loc;
	private Collection<Emp> emp;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@OneToMany(mappedBy = "dept",fetch = FetchType.LAZY)
	public Collection<Emp> getEmp() {
		return emp;
	}
	public void setEmp(Collection<Emp> emp) {
		this.emp = emp;
	}
	
}
