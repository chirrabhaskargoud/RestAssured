package basics.restassured;

public class POSTPOJO {
	private String name;
	private String job;
	private String id;
	private String createdAt;
	
	
	public String getName() {
		return name;
	}
	
	public String getJob() {
		return job;
	}
	
	public String getID() {
		return id;
	}
	
	public String getCreatedAt() {
		return createdAt;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setJob(String job) {
		this.job=job;
	}
	
	public void setID(String id) {
		this.id=id;
	}
	
	public void setCreatedAt(String createdAt ) {
	
		this.createdAt=createdAt;
	}
}
