package com.michaelsong.test.vo;

public class TestVo {
	private String num;
	private String name;
	private String title;
	private String content;
	private int hit;
	private String writeDate;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
		return "TestVo [num=" + num + ", name=" + name + ", title=" + title + ", content=" + content + ", hit=" + hit
				+ ", writeDate=" + writeDate + "]";
	}

}
