package entrepreneurialcenter.office.pojo.impl;

import java.util.Date;

public class CompaniesInfo {
	
	private Long comId;
	
	private String comName;
	
	private String typeTitle;
	
	private String indTitle;
	
	private String modeTitle;
	
	private Date joinDmt;

	private Date retakeDmt;
	
	private String comDetail;

	public Long getComId() {
		return comId;
	}

	public void setComId(Long comId) {
		this.comId = comId;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getTypeTitle() {
		return typeTitle;
	}

	public void setTypeTitle(String typeTitle) {
		this.typeTitle = typeTitle;
	}

	public String getIndTitle() {
		return indTitle;
	}

	public void setIndTitle(String indTitle) {
		this.indTitle = indTitle;
	}

	public String getModeTitle() {
		return modeTitle;
	}

	public void setModeTitle(String modeTitle) {
		this.modeTitle = modeTitle;
	}

	public Date getJoinDmt() {
		return joinDmt;
	}

	public void setJoinDmt(Date joinDmt) {
		this.joinDmt = joinDmt;
	}

	public Date getRetakeDmt() {
		return retakeDmt;
	}

	public void setRetakeDmt(Date retakeDmt) {
		this.retakeDmt = retakeDmt;
	}

	public String getComDetail() {
		return comDetail;
	}

	public void setComDetail(String comDetail) {
		this.comDetail = comDetail;
	}
	
	
}
