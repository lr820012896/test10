package com.qf.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Delegation implements Serializable{

	// @Fields serialVersionUID : TODO
	private static final long serialVersionUID = 4545400175666768699L;
	private int delegationId;
	private String delegationName;
	private Set<Job> jobs=new HashSet<>();
	public Delegation(int delegationId, String delegationName) {
		super();
		this.delegationId = delegationId;
		this.delegationName = delegationName;
	}
	public Delegation() {
		super();
	}
	
	public Set<Job> getJobs() {
		return jobs;
	}
	public void setJobs(Set<Job> jobs) {
		this.jobs = jobs;
	}
	public int getDelegationId() {
		return delegationId;
	}
	public void setDelegationId(int delegationId) {
		this.delegationId = delegationId;
	}
	public String getDelegationName() {
		return delegationName;
	}
	public void setDelegationName(String delegationName) {
		this.delegationName = delegationName;
	}
	@Override
	public String toString() {
		return " [delegationId=" + delegationId + ", delegationName=" + delegationName + "]";
	}
	
}
