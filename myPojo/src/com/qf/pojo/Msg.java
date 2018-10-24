package com.qf.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Msg implements Serializable{

	// @Fields serialVersionUID : TODO
	private static final long serialVersionUID = -3422644679203557181L;
	
	private int state;
	private String msg;
	private Map<Object,Object> extend=new HashMap<>();
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<Object, Object> getExtend() {
		return extend;
	}
	public void setExtend(Map<Object, Object> extend) {
		this.extend = extend;
	}
	  public static Msg success(){
	        Msg result=new Msg();
	        result.setState(1);
	        result.setMsg("处理成功!");
	        return result;
	    }
	  public static Msg fail(){
	        Msg result=new Msg();
	        result.setState(200);
	        result.setMsg("处理失败!");
	        return result;
	    }
	  public Msg add(Object key,Object value){
	        this.getExtend().put(key,value);
	        return this;
	    }
}
