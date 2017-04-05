package cn.cycle.oa.model;

public class PageModel {

	private Integer page ;//当前页
	private Integer rows;//页大小，每页显示几条数据
	private Integer start;//数据起始下标序号，需要这里处理
	private String sort;// 排序字段
	private String order = "asc";
	private Long totalRecord = 0L;//总记录 数
	
	
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
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public Long getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(Long totalRecord) {
		this.totalRecord = totalRecord;
	}
	
}
