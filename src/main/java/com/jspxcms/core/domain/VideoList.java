package com.jspxcms.core.domain;

import java.util.List;

public class VideoList {
	private int currpage;
	private int isfirst;//1:是;0:否
	private int islast;//1:是;0:否
	private int totalpage;
	private long totalcount;
	private List<VideoTwo> videoList;
	public int getCurrpage() {
		return currpage;
	}
	public void setCurrpage(int currpage) {
		this.currpage = currpage;
	}
	public int getIsfirst() {
		return isfirst;
	}
	public void setIsfirst(int isfirst) {
		this.isfirst = isfirst;
	}
	public int getIslast() {
		return islast;
	}
	public void setIslast(int islast) {
		this.islast = islast;
	}
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	
	public long getTotalcount() {
		return totalcount;
	}
	public void setTotalcount(long totalcount) {
		this.totalcount = totalcount;
	}
	public List<VideoTwo> getVideoList() {
		return videoList;
	}
	public void setVideoList(List<VideoTwo> videoList) {
		this.videoList = videoList;
	}
	

}
