package com.qf.pojo;

import java.io.Serializable;

public class MeetingResource implements Serializable{

	// @Fields serialVersionUID : TODO
	private static final long serialVersionUID = -2071987449945359286L;
	private int meetingResourceId;
	private String meetingResourceName;
	private String meetingResourceIntro;
	private String meetingResourceURL;
	private MeetingNotice meetingNotice;
	public MeetingResource(int meetingResourceId, String meetingResourceURL, MeetingNotice meetingNotice) {
		super();
		this.meetingResourceId = meetingResourceId;
		this.meetingResourceURL = meetingResourceURL;
		this.meetingNotice = meetingNotice;
	}
	public MeetingResource() {
		super();
	}
	
	public String getMeetingResourceName() {
		return meetingResourceName;
	}
	public void setMeetingResourceName(String meetingResourceName) {
		this.meetingResourceName = meetingResourceName;
	}
	public String getMeetingResourceIntro() {
		return meetingResourceIntro;
	}
	public void setMeetingResourceIntro(String meetingResourceIntro) {
		this.meetingResourceIntro = meetingResourceIntro;
	}
	public int getMeetingResourceId() {
		return meetingResourceId;
	}
	public void setMeetingResourceId(int meetingResourceId) {
		this.meetingResourceId = meetingResourceId;
	}
	public String getMeetingResourceURL() {
		return meetingResourceURL;
	}
	public void setMeetingResourceURL(String meetingResourceURL) {
		this.meetingResourceURL = meetingResourceURL;
	}
	public MeetingNotice getMeetingNotice() {
		return meetingNotice;
	}
	public void setMeetingNotice(MeetingNotice meetingNotice) {
		this.meetingNotice = meetingNotice;
	}
	@Override
	public String toString() {
		return "MeetingResource [meetingResourceId=" + meetingResourceId + ", meetingResourceURL=" + meetingResourceURL
				+ "]";
	}
	
	
}
