package test;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

public class t2 {
	public static void main(String[] args) {
//		String s = "123";
//		String[] ss = s.split(",");
//		ttdsd(ss);
		 
		Boolean b = null;
		String ss = "1";
		if(StringUtils.isNotBlank(ss)){
			System.out.println(true);
		}
	}
	
	static void tt(String... t){
		for (String string : t) {
			System.out.println(string);
		}
		
	}
}
