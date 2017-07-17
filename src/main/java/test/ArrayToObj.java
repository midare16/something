package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;

import com.google.gson.Gson;

import VO.TestVO;

public class ArrayToObj {
	public static void main(String[] args) {
//		String s ="[{&quot;measurePointName&quot;:&quot;凤凰1&quot;},{&quot;measurePointName&quot;:&quot;凤凰2&quot;}]";
////		String s ="[{\"measurePointName\":\"凤凰1\"},{\"measurePointName\":\"凤凰2\"}]";
//		String re = s.replace("&quot;", "\"");
//		Gson g = new Gson();
//		TestVO[] t = g.fromJson(re, TestVO[].class);
//		List<TestVO> l = Arrays.asList(t);
//		System.out.println(l);
		
//		String s2 ="{&quot;measurePointName&quot;:&quot;凤凰1&quot;}";
//		
//		TestVO[] t2 = g.fromJson(s2, TestVO[].class);
//		System.out.println(t2);
		
//		String[] s = null;
//		s = ArrayUtils.add(s, "1");
//		s = ArrayUtils.add(s, "1");
//		s = ArrayUtils.add(s, "1");
//		System.out.println(ArrayUtils.toString(s));
//		List<String> l = new ArrayList<String>();
//		l.add("fd");
//		l.add("fd");
//		l.add("fd");
//		System.out.println(l.toString());
//		String str = "dsa";
//		str = str.concat(",");
//		str = str.concat("5995");
//		System.out.println(str);
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "1");
		String value = map.get("2");
		System.out.println(value);
		System.out.println("******");
	}
}
