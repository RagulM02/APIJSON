package org.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;
import org.pojo.Details;

public class JsonDay2 {

	@Test
	public void json() throws FileNotFoundException, IOException, ParseException {
		JSONParser j = new JSONParser();
		Object parse = j
				.parse(new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\JSON\\details.json"));
		JSONObject jobj = (JSONObject) parse;

		Details d = new Details();
		// Setters
		
		d.setFrom(jobj.get("from").toString());
		d.setTo(jobj.get("to").toString());
		d.setTripType(jobj.get("tripType").toString());
		d.setFromDate(jobj.get("fromDate").toString());
		d.setToDate(jobj.get("toDate").toString());
		d.setFlightNo(jobj.get("flightNo").toString());
		d.setName(jobj.get("name").toString());
		d.setDob(jobj.get("dob").toString());
		d.setStreetName(jobj.get("streetName").toString());
		d.setCityName(jobj.get("cityName").toString());
		d.setDistrctName(jobj.get("distrctName").toString());
		d.setStateName(jobj.get("stateName").toString());
		d.setMobileNo(Long.valueOf(jobj.get("mobileNo").toString()));
		d.setLandlineNo(jobj.get("landlineNo").toString());
		d.setPersonalEmail(jobj.get("personalEmail").toString());
		d.setOfficialEmail(jobj.get("officialEmail").toString());
		d.setCardName(jobj.get("cardName").toString());
		d.setCardHolderName(jobj.get("cardHolderName").toString());
		d.setCardNo(Long.valueOf(jobj.get("cardNo").toString()));
		d.setCvvNo(Double.valueOf(jobj.get("cvvNo").toString()));
		 //Getters
		 System.out.println(d.getFrom());
		System.out.println(d.getTo());
		 System.out.println(d.getTripType());
		 System.out.println(d.getFromDate());
		 System.out.println(d.getToDate());
		 System.out.println(d.getFlightNo());
		 System.out.println(d.getName());
		 System.out.println(d.getDob());
		 System.out.println(d.getStreetName());
		 System.out.println(d.getCityName());
		 System.out.println(d.getDistrctName());
		 System.out.println(d.getStateName());
		 System.out.println(d.getMobileNo());
		 System.out.println(d.getLandlineNo());
		 System.out.println(d.getPersonalEmail());
		 System.out.println(d.getOfficialEmail());
		 System.out.println(d.getCardName());
		 System.out.println(d.getCardHolderName());
		 System.out.println(d.getCardNo());
		 System.out.println(d.getCvvNo());
		// Assertion
		Assert.assertEquals("Verify the From", "covi", d.getFrom());
		Assert.assertEquals("Verify the To", "madurai", d.getTo());
		Assert.assertEquals("Verify the tripType", "RoundTrip", d.getTripType());
		Assert.assertEquals("Verify the fromDate", "10-7-2020", d.getFromDate());
		Assert.assertEquals("Verify the toDate", "22-7-2020", d.getToDate());
		Assert.assertEquals("Verify the flightNo", "spijet1", d.getFlightNo());
		Assert.assertEquals("Verify the name", "Ragul.M", d.getName());
		Assert.assertEquals("Verify the dob", "12-11-1996", d.getDob());
		Assert.assertEquals("Verify the streetName", "midilestret", d.getStreetName());
		Assert.assertEquals("Verify the cityName", "Thanjai", d.getCityName());
		Assert.assertEquals("Verify the distrctName", "Thiruvarur", d.getDistrctName());
		Assert.assertEquals("Verify the stateName", "Tamilnadu", d.getStateName());
		Assert.assertEquals("Verify the mobileNo", 8220792954l, d.getMobileNo());
		Assert.assertEquals("Verify the landlineNo", "123-5634567", d.getLandlineNo());
		Assert.assertEquals("Verify the personalEmail", "123456@gmail.com", d.getPersonalEmail());
		Assert.assertEquals("Verify the officialEmail", "qwert@hexaware.in", d.getOfficialEmail());
		Assert.assertEquals("Verify the cardName", "Visa", d.getCardName());
		Assert.assertEquals("Verify the cardHolderName", "Ragul.M", d.getCardHolderName());
		Assert.assertEquals("Verify the cardNo", 123456784567l, d.getCardNo());
		Assert.assertEquals("Verify the cvvNo", 568.0, d.getCvvNo(),0.0);
		
		/*
		 * Object ofrom = jobj.get("from"); 
		 * Object oto = jobj.get("to"); 
		 * Object otripType = jobj.get("tripType");
		 *  Object ofromDate = jobj.get("fromDate");
		 * Object otoDate = jobj.get("toDate"); 
		 * Object oflightNo = jobj.get("flightNo");
		 * Object oname = jobj.get("name"); Object odob = jobj.get("dob"); Object
		 * ostreetName = jobj.get("streetName"); Object ocityName =
		 * jobj.get("cityName"); Object odistrctName = jobj.get("distrctName"); Object
		 * ostateName = jobj.get("stateName"); Object omobileNo = jobj.get("mobileNo");
		 * Object olandlineNo = jobj.get("landlineNo"); Object opersonalEmail =
		 * jobj.get("personalEmail"); Object oofficialEmail = jobj.get("officialEmail");
		 * Object ocardName = jobj.get("cardName"); Object ocardHolderName =
		 * jobj.get("cardHolderName"); Object ocardNo = jobj.get("cardNo"); Object
		 * ocvvNo = jobj.get("cvvNo");
		 */

	}
}
