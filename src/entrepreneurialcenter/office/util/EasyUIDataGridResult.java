package entrepreneurialcenter.office.util;

import java.util.List;

public class EasyUIDataGridResult {

	private long totalCounnt;
	private long totalPage;
	private List<?> rows;
	private long nextPage;
	private long prevPage;
	private long page;
	private Integer[] digitalPage;
	
	public EasyUIDataGridResult(long totalCount, long totalPage, List<?> rows, long nextPage, long prevPage, long page, Integer[] digitalPage) {
		this.totalCounnt = totalCount;
		this.totalPage = totalPage;
		this.rows = rows;
		this.nextPage = nextPage;
		this.prevPage = prevPage;
		this.page = page;
		this.digitalPage = digitalPage;
	}
	
	public long getTotalCounnt() {
		return totalCounnt;
	}
	public void setTotalCounnt(long totalCounnt) {
		this.totalCounnt = totalCounnt;
	}
	public long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	public long getNextPage() {
		return nextPage;
	}
	public void setNextPage(long nextPage) {
		this.nextPage = nextPage;
	}
	public long getPrevPage() {
		return prevPage;
	}
	public void setPrevPage(long prevPage) {
		this.prevPage = prevPage;
	}
	public long getPage() {
		return page;
	}
	public void setPage(long page) {
		this.page = page;
	}

	public Integer[] getDigitalPage() {
		return digitalPage;
	}

	public void setDigitalPage(Integer[] digitalPage) {
		this.digitalPage = digitalPage;
	}
	
	
}
