package Pojo2;

import java.util.List;

public class List_Users {
	
	private int page;
	private int pre_page;
	private int total;
	private int total_pages;
	private List<Data> data;
	private Support support;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPre_page() {
		return pre_page;
	}
	public void setPre_page(int pre_page) {
		this.pre_page = pre_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public List<Data> getData() {
		return data;
	}
	
	public Support getSupport() {
		return support;
	}
	
	

}
