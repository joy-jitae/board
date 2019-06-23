package com.spring.jitae.vo;

import java.util.Date;

public class BoardVO {
	private Integer board_no;
	private String title;
	private String content;
	private String writer;
	private Date register_date;
	private Date update_date;

	private Integer num;
	private String name;
	private Integer readCount;
	private Date writeDate;

	public Integer getBoard_no() {
		return board_no;
	}

	public String getWriter() {
		return writer;
	}

	public Date getRegister_date() {
		return register_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setBoard_no(Integer board_no) {
		this.board_no = board_no;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
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
	public Integer getReadCount() {
		return readCount;
	}
	public void setReadCount(Integer readCount) {
		this.readCount = readCount;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", name=" + name + ", title=" + title + ", content=" + content + ", readCount="
				+ readCount + ", writeDate=" + writeDate + "]";
	}

}
