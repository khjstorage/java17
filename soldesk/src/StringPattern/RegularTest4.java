package StringPattern;

import java.util.*;
import java.util.regex.*;

public class RegularTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = null;
		String str = "<html><body>...<img src='http://www.temp.com/test.jpg'/> asdf "
				+ "<img src='http://www.test.com/img.jpg'/>...</body></html>";
		list = getImgScr(str);
		
		for(String imgUrl : list){
			System.out.println(imgUrl);
		}
	}
	
	public static List<String> getImgScr(String str){
		Pattern nonValidPattern = Pattern.compile("<img[^>]*src=[\"']?([^>\"']+)[\"']?[^>]*>");
		
		List<String> result = new ArrayList<String>();
		Matcher match = nonValidPattern.matcher(str);
		
		while(match.find()){
			result.add(match.group(1));
		}
		
		return result;
	}

}








