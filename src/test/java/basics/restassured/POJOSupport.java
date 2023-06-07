package basics.restassured;

public class POJOSupport {

	private String url;
	private String text;
	
	public String getUrl() {
		return this.url;
	}
	
	public String getText() {
		return this.text;
	}
	
	public void setUrl(String url) {
		this.url=url;
	}
	
	public void setText(String text) {
		this.text=text;
	}
}
