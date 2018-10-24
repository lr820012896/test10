package com.qf.pojo;

import java.io.Serializable;

public class MeetingAgender implements Serializable{

	// @Fields serialVersionUID : TODO
	private static final long serialVersionUID = 3227110760145882183L;
	private int meetingAgenderId;
	private String meetingAgenderName;
	private String meetingAgenderURL;
	private MeetingNotice meetingNotice;
	
	public String getMeetingAgenderName() {
		return meetingAgenderName;
	}
	public void setMeetingAgenderName(String meetingAgenderName) {
		this.meetingAgenderName = meetingAgenderName;
	}
	public int getMeetingAgenderId() {
		return meetingAgenderId;
	}
	public void setMeetingAgenderId(int meetingAgenderId) {
		this.meetingAgenderId = meetingAgenderId;
	}
	public String getMeetingAgenderURL() {
		return meetingAgenderURL;
	}
	public void setMeetingAgenderURL(String meetingAgenderURL) {
		this.meetingAgenderURL = meetingAgenderURL;
	}
	public MeetingNotice getMeetingNotice() {
		return meetingNotice;
	}
	public void setMeetingNotice(MeetingNotice meetingNotice) {
		this.meetingNotice = meetingNotice;
	}
	public MeetingAgender(int meetingAgenderId, String meetingAgenderURL, MeetingNotice meetingNotice) {
		super();
		this.meetingAgenderId = meetingAgenderId;
		this.meetingAgenderURL = meetingAgenderURL;
		this.meetingNotice = meetingNotice;
	}
	public MeetingAgender() {
		super();
	}
	@Override
	public String toString() {
		return "MeetingAgender [meetingAgenderId=" + meetingAgenderId + ", meetingAgenderURL=" + meetingAgenderURL
				+ "]";
	}
	
	
}
