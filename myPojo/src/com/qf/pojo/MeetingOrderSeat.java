package com.qf.pojo;

import java.io.Serializable;

public class MeetingOrderSeat implements Serializable {

	// @Fields serialVersionUID : TODO
	private static final long serialVersionUID = 4405452144631494970L;
	private int meetingOrderSeatId;
	private String meetingOrderSeat;
	private MeetingNotice meetingNotice;
	private User user;
	public MeetingOrderSeat(int meetingOrderSeatId, String meetingOrderSeat, MeetingNotice meetingNotice, User user) {
		super();
		this.meetingOrderSeatId = meetingOrderSeatId;
		this.meetingOrderSeat = meetingOrderSeat;
		this.meetingNotice = meetingNotice;
		this.user = user;
	}
	public MeetingOrderSeat() {
		super();
	}
	public int getMeetingOrderSeatId() {
		return meetingOrderSeatId;
	}
	public void setMeetingOrderSeatId(int meetingOrderSeatId) {
		this.meetingOrderSeatId = meetingOrderSeatId;
	}
	public String getMeetingOrderSeat() {
		return meetingOrderSeat;
	}
	public void setMeetingOrderSeat(String meetingOrderSeat) {
		this.meetingOrderSeat = meetingOrderSeat;
	}
	public MeetingNotice getMeetingNotice() {
		return meetingNotice;
	}
	public void setMeetingNotice(MeetingNotice meetingNotice) {
		this.meetingNotice = meetingNotice;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "MeetingOrderSeat [meetingOrderSeatId=" + meetingOrderSeatId + ", meetingOrderSeat=" + meetingOrderSeat
				+ "]";
	}
	
	
}
