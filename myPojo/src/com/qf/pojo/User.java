package com.qf.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable{

	// @Fields serialVersionUID : TODO
	private static final long serialVersionUID = -784957341332363861L;
	
	private int userId;
	private String userLoginName;
	private String userTel;
	private String userPwd;
	private String photo;
	private String userName;
	private Set<Job> jobs=new HashSet<>();
	private Set<MeetingNotice> meetingNotices=new HashSet<>();
	public User(int userId, String userLoginName, String userTel, String userPwd, String photo, String userName,
			Set<Job> jobs) {
		super();
		this.userId = userId;
		this.userLoginName = userLoginName;
		this.userTel = userTel;
		this.userPwd = userPwd;
		this.photo = photo;
		this.userName = userName;
		this.jobs = jobs;
	}
	public User() {
		super();
	}
	
	public Set<MeetingNotice> getMeetingNotices() {
		return meetingNotices;
	}
	public void setMeetingNotices(Set<MeetingNotice> meetingNotices) {
		this.meetingNotices = meetingNotices;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserLoginName() {
		return userLoginName;
	}
	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Set<Job> getJobs() {
		return jobs;
	}
	public void setJobs(Set<Job> jobs) {
		this.jobs = jobs;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userLoginName=" + userLoginName + ", userTel=" + userTel + ", userPwd="
				+ userPwd + ", photo=" + photo + ", userName=" + userName + "]";
	}
	
}
