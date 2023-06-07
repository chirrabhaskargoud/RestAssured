package basics.restassured;

import java.util.ArrayList;
import java.util.List;

public class Serialisation {

	public static void main(String[] args) {
		
		POJOMain pojoMain=new POJOMain();
		
		pojoMain.setPage(2);
		pojoMain.setPer_page(6);
		pojoMain.setTotal(12);
		pojoMain.setTotal_pages(2);
		
		POJOSupport support=new POJOSupport();
		support.setText("hello");
		support.setUrl("www.google.com");
		pojoMain.setSupport(support);
		
	
		List<POJOData> list=new ArrayList<POJOData>();
		POJOData data=new POJOData();
		data.setID(7);
		data.setAvatar("avatar");
		data.setEmail("saa@gmail.com");
		data.setFirst_name("chirra");
		data.setLast_name("Bhaskar");
		
		list.add(data);
		data=new POJOData();
		data.setID(7);
		data.setAvatar("avatar");
		data.setEmail("saa@gmail.com");
		data.setFirst_name("chirra");
		data.setLast_name("Bhaskar");
		
		list.add(data);
				
		pojoMain.setData(list);
	}

}
