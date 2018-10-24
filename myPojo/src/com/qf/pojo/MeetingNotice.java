package com.qf.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MeetingNotice implements Serializable{

	// @Fields serialVersionUID : TODO
	private static final long serialVersionUID = 4600469101384789258L;
	private int meetingNoticeId;
	private String meetingNoticeName;
	private Date meetingNoticeTime;
	private String mettingNoticeAddress;
	private Set<User> users=new HashSet<>();
	public MeetingNotice(int meetingNoticeId, String meetingNoticeName, Date meetingNoticeTime,
			String mettingNoticeAddress, Set<User> users) {
		super();
		this.meetingNoticeId = meetingNoticeId;
		this.meetingNoticeName = meetingNoticeName;
		this.meetingNoticeTime = meetingNoticeTime;
		this.mettingNoticeAddress = mettingNoticeAddress;
		this.users = users;
	}
	public MeetingNotice() {
		super();
	}
	public int getMeetingNoticeId() {
		return meetingNoticeId;
	}
	public void setMeetingNoticeId(int meetingNoticeId) {
		this.meetingNoticeId = meetingNoticeId;
	}
	public String getMeetingNoticeName() {
		return meetingNoticeName;
	}
	public void setMeetingNoticeName(String meetingNoticeName) {
		this.meetingNoticeName = meetingNoticeName;
	}
	public Date getMeetingNoticeTime() {
		return meetingNoticeTime;
	}
	public void setMeetingNoticeTime(Date meetingNoticeTime) {
		this.meetingNoticeTime = meetingNoticeTime;
	}
	public String getMettingNoticeAddress() {
		return mettingNoticeAddress;
	}
	public void setMettingNoticeAddress(String mettingNoticeAddress) {
		this.mettingNoticeAddress = mettingNoticeAddress;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "MeetingNotice [meetingNoticeId=" + meetingNoticeId + ", meetingNoticeName=" + meetingNoticeName
				+ ", meetingNoticeTime=" + meetingNoticeTime + ", mettingNoticeAddress=" + mettingNoticeAddress + "]";
	}
	
}
