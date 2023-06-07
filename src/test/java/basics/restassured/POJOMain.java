package basics.restassured;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class POJOMain {

	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	 List<POJOData> data;
	 POJOSupport support;
	
	public int getPage() {
		return page;
	}
	
	public int getPer_page() {
		return per_page;
	}
	
	public int getTotal() {
		return total;
	}
	
	public int getTotal_pages() {
		return total_pages;
	}
	
	
	public List<POJOData> getData(){
		return data;
	}
	
	
	public void setPage(int page) {
		this.page=page;
	}
	
	public void setPer_page(int per_page) {
		this.per_page=per_page;
	}
	
	public void setTotal(int total) {
		this.total=total;
	}
	
	public void setTotal_pages(int toal_pages) {
		this.total_pages=toal_pages;
	}
	
	public void setData(List<POJOData> data) {
		this.data=data;
	}
	
	public void setSupport(POJOSupport support) {
		this.support=support;
	}
	
	public POJOSupport getSupport() {
		return this.support;
	}
}
