package org.json;


import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;

import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDay1 {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader f = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\JSON\\details.json");
		JSONParser jparser = new JSONParser();
		Object parse = jparser.parse(f);
		JSONObject j = (JSONObject) parse;
		// using enrtyset
		Set entrySet = j.entrySet();
		for (Object x : entrySet) {
			System.out.println(x);
		}
		System.out.println("***contins***");
		System.out.println(j.containsValue("Tamilnadu"));
		System.out.println(j.containsKey("distrctName"));
		// using Keyset()
		Set keySet = j.keySet();
		for (Object x1 : keySet) {
			System.out.println(x1);
		}
		// using values()
		Collection values = j.values();
		System.out.println(values);
		boolean r = j.containsKey("name");
		System.out.println(r);
		// using getkey
		Object object = j.get("toDate");
		System.out.println(object);
		Object object2 = j.get("officialEmail");
		System.out.println(object2);
	}

}
