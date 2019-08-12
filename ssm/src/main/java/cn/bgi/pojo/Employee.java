package cn.bgi.pojo;

import java.io.Serializable;

public class Employee implements Serializable {
	private int eno;
	private String username;
	private String ename;
	private String sex;
	private String first;
	private String second;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}
	
	public String toString() {
		return "employee[eno:"+eno+"|username:"+username+"|ename:"+ename+"|sex:"+sex+"|first:"+first+"|second:"+second+"]";
	}

}
