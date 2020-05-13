package org.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.pojotask.Ad;
import org.pojotask.Data;
import org.pojotask.MainPojo;

public class JsonArray {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		JSONParser jp = new JSONParser();
		Object p = jp
				.parse(new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\JSON\\urlTask.json"));
		JSONObject obj = (JSONObject) p;
		Object objData = obj.get("data");
		Object objAd = obj.get("ad");
		JSONObject obj1 = (JSONObject) objAd;

		// Setter
		// data
		Data d = new Data();
		List<String> id = new ArrayList<String>();
		List<String> email = new ArrayList<String>();
		List<String> first_name = new ArrayList<String>();
		List<String> last_name = new ArrayList<String>();
		List<String> avatar = new ArrayList<String>();
		JSONArray listofData = (JSONArray) objData;

		for (Object eachdata : listofData) {
			JSONObject data = (JSONObject) eachdata;
			id.add(data.get("id").toString());
			email.add(data.get("email").toString());
			first_name.add(data.get("first_name").toString());
			last_name.add(data.get("last_name").toString());
			avatar.add(data.get("avatar").toString());

		}

		// add to data
		d.setId(id);
		d.setEmail(email);
		d.setFirst_name(first_name);
		d.setLast_name(last_name);
		d.setAvatar(avatar);

		// Set Ad
		Ad a = new Ad();
		a.setCompany(obj1.get("company").toString());
		a.setText(obj1.get("url").toString());
		a.setUrl(obj1.get("text").toString());
		
		// Main pojo
		MainPojo m = new MainPojo();

		m.setData(d);
		m.setAd(a);

		// getter
		m.setPage(obj.get("page").toString());
		m.setPer_page(obj.get("per_page").toString());
		m.setTotal(obj.get("total").toString());
		m.setTotal_pages(obj.get("total_pages").toString());

		System.out.println(m.getPage());
		System.out.println(m.getPer_page());
		System.out.println(m.getTotal());
		System.out.println(m.getTotal_pages());

		Data data = m.getData();
		
		System.out.println(data.getId());
		System.out.println(data.getEmail());
		System.out.println(data.getFirst_name());
		System.out.println(data.getLast_name());
		System.out.println(data.getAvatar());
		
		Ad ad = m.getAd();
		System.out.println(ad.getCompany());
		System.out.println(ad.getText());
		System.out.println(ad.getUrl());

	}

}
