package com.qf.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Job implements Serializable{
	// @Fields serialVersionUID : TODO
	private static final long serialVersionUID = 6081789520478404932L;
	private int jobId;
	private String jobName;
	private Set<User> users=new HashSet<>();
	private int delegationId;
	public Job(int jobId, String jobName, Set<User> users) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
		this.users = users;
	}
	public Job() {
		super();
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	
	public int getDelegationId() {
		return delegationId;
	}
	public void setDelegationId(int delegationId) {
		this.delegationId = delegationId;
	}
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobName=" + jobName + "]";
	}
	
}
