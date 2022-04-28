package com.tjmovies.api.Entity;

import java.lang.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MovieTB")
public class MovieEntity {
	
	public MovieEntity() {
		
	}
	
	@Id
	private Integer id;
	private String mag_1;
	private String mag_2;
	private String mag_3;
	private String mag_4;
	private String mag_5;
	
	private String src_1;
	private String src_2;
	private String src_3;
	private String src_4;
	private String src_5;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMag_1() {
		return mag_1;
	}
	public void setMag_1(String mag_1) {
		this.mag_1 = mag_1;
	}
	public String getMag_2() {
		return mag_2;
	}
	public void setMag_2(String mag_2) {
		this.mag_2 = mag_2;
	}
	public String getMag_3() {
		return mag_3;
	}
	public void setMag_3(String mag_3) {
		this.mag_3 = mag_3;
	}
	public String getMag_4() {
		return mag_4;
	}
	public void setMag_4(String mag_4) {
		this.mag_4 = mag_4;
	}
	public String getMag_5() {
		return mag_5;
	}
	public void setMag_5(String mag_5) {
		this.mag_5 = mag_5;
	}
	public String getSrc_1() {
		return src_1;
	}
	public void setSrc_1(String src_1) {
		this.src_1 = src_1;
	}
	public String getSrc_2() {
		return src_2;
	}
	public void setSrc_2(String src_2) {
		this.src_2 = src_2;
	}
	public String getSrc_3() {
		return src_3;
	}
	public void setSrc_3(String src_3) {
		this.src_3 = src_3;
	}
	public String getSrc_4() {
		return src_4;
	}
	public void setSrc_4(String src_4) {
		this.src_4 = src_4;
	}
	public String getSrc_5() {
		return src_5;
	}
	public void setSrc_5(String src_5) {
		this.src_5 = src_5;
	}
	public MovieEntity(Integer id, String mag_1, String mag_2, String mag_3, String mag_4, String mag_5, String src_1,
			String src_2, String src_3, String src_4, String src_5) {
		
		this.id = id;
		this.mag_1 = mag_1;
		this.mag_2 = mag_2;
		this.mag_3 = mag_3;
		this.mag_4 = mag_4;
		this.mag_5 = mag_5;
		this.src_1 = src_1;
		this.src_2 = src_2;
		this.src_3 = src_3;
		this.src_4 = src_4;
		this.src_5 = src_5;
	}

}
