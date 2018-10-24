package com.qf.pojo;

import java.io.Serializable;

public class MeetingNew implements Serializable{

	// @Fields serialVersionUID : TODO
	private static final long serialVersionUID = 4417230750765262990L;
	private int meetingNewsId;
	private String meetingNewsName;
	private String meetingNewsIntro;
	private int type;
	private String meetingNewsURL;
	private String meetingNewsPhoto;
	public MeetingNew(int meetingNewsId, String meetingNewsName, String meetingNewsIntro, int type,
			String meetingNewsURL, String meetingNewsPhoto) {
		super();
		this.meetingNewsId = meetingNewsId;
		this.meetingNewsName = meetingNewsName;
		this.meetingNewsIntro = meetingNewsIntro;
		this.type = type;
		this.meetingNewsURL = meetingNewsURL;
		this.meetingNewsPhoto = meetingNewsPhoto;
	}
	public MeetingNew() {
		super();
	}
	public int getMeetingNewsId() {
		return meetingNewsId;
	}
	public void setMeetingNewsId(int meetingNewsId) {
		this.meetingNewsId = meetingNewsId;
	}
	public String getMeetingNewsName() {
		return meetingNewsName;
	}
	public void setMeetingNewsName(String meetingNewsName) {
		this.meetingNewsName = meetingNewsName;
	}
	public String getMeetingNewsIntro() {
		return meetingNewsIntro;
	}
	public void setMeetingNewsIntro(String meetingNewsIntro) {
		this.meetingNewsIntro = meetingNewsIntro;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getMeetingNewsURL() {
		return meetingNewsURL;
	}
	public void setMeetingNewsURL(String meetingNewsURL) {
		this.meetingNewsURL = meetingNewsURL;
	}
	public String getMeetingNewsPhoto() {
		return meetingNewsPhoto;
	}
	public void setMeetingNewsPhoto(String meetingNewsPhoto) {
		this.meetingNewsPhoto = meetingNewsPhoto;
	}
	@Override
	public String toString() {
		return "MeetingNew [meetingNewsId=" + meetingNewsId + ", meetingNewsName=" + meetingNewsName
				+ ", meetingNewsIntro=" + meetingNewsIntro + ", type=" + type + ", meetingNewsURL=" + meetingNewsURL
				+ ", meetingNewsPhoto=" + meetingNewsPhoto + "]";
	}
	
}
