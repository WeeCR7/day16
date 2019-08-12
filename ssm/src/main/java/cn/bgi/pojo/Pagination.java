package cn.bgi.pojo;

/**
 * ·ÖÒ³
 * 
 * @author zhanjiawei
 *
 */
public class Pagination {
	private Integer page;
	private Integer rows;
	private Integer start;
	
	public Pagination() {}
	public Pagination(Integer page,Integer rows) {
		this.page = page;
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getStart() {
		start = (page-1)*rows;
		return start;
	}

}
