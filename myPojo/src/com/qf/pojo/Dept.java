package com.qf.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Dept implements Serializable{

	// @Fields serialVersionUID : TODO
	private static final long serialVersionUID = -7982729861354968717L;
	private int deptId;
	private String deptName;
	private Set<Waiter> waiters=new HashSet<>();
	public Dept(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public Dept() {
		super();
	}
	
	public Set<Waiter> getWaiters() {
		return waiters;
	}
	public void setWaiters(Set<Waiter> waiters) {
		this.waiters = waiters;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
}
