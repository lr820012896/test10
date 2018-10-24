package com.qf.pojo;

import java.io.Serializable;

public class Waiter implements Serializable{

	// @Fields serialVersionUID : TODO
	private static final long serialVersionUID = 4064496647703991097L;
	private int waiterId;
	private String waiterName;
	private String waiterTel;
	private String waiterPhoto;
	private int deptId;
	public Waiter(int waiterId, String waiterName, String waiterTel, String waiterPhoto, int deptId) {
		super();
		this.waiterId = waiterId;
		this.waiterName = waiterName;
		this.waiterTel = waiterTel;
		this.waiterPhoto = waiterPhoto;
		this.deptId = deptId;
	}
	public Waiter() {
		super();
	}
	public int getWaiterId() {
		return waiterId;
	}
	public void setWaiterId(int waiterId) {
		this.waiterId = waiterId;
	}
	public String getWaiterName() {
		return waiterName;
	}
	public void setWaiterName(String waiterName) {
		this.waiterName = waiterName;
	}
	public String getWaiterTel() {
		return waiterTel;
	}
	public void setWaiterTel(String waiterTel) {
		this.waiterTel = waiterTel;
	}
	public String getWaiterPhoto() {
		return waiterPhoto;
	}
	public void setWaiterPhoto(String waiterPhoto) {
		this.waiterPhoto = waiterPhoto;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "Waiter [waiterId=" + waiterId + ", waiterName=" + waiterName + ", waiterTel=" + waiterTel
				+ ", waiterPhoto=" + waiterPhoto + ", deptId=" + deptId + "]";
	}
	
	
}
