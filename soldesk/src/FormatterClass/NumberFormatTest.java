package FormatterClass;

import java.text.*;
import java.time.*;
import java.util.Locale;

public class NumberFormatTest {

	long long_01 = 1000000L;
	double double_01 = 1234567890.8888889;
	
	public void doCurrentUsingDefaultLocale(){
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		print(nf, long_01);
		print(nf, double_01);
		
		nf.setMaximumFractionDigits(3);
		print(nf, double_01);
	}
	
	public void doCurrentUsingSpecificLocale(){
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		print(nf, long_01);
		print(nf, double_01);
		
		nf = NumberFormat.getCurrencyInstance(Locale.US);
		print(nf, long_01);
		print(nf, double_01);
		
		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		print(nf, long_01);
		print(nf, double_01);
		
//		nf.setMaximumFractionDigits(1);
//		print(nf, double_01);
	}
	
	public void doPercent(){
		NumberFormat nf = NumberFormat.getPercentInstance();
		System.out.println(nf.format(1));
		
		nf = NumberFormat.getPercentInstance(Locale.CHINA);
		System.out.println(nf.format(1));
	}
	
	private void print(NumberFormat nf, long l){
		System.out.println("format of long value : "+nf.format(l));
	}
	
	private void print(NumberFormat nf, double d){
		System.out.println("format of double value : "+nf.format(d));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormatTest nft = new NumberFormatTest();
		nft.doCurrentUsingDefaultLocale();
		nft.doCurrentUsingSpecificLocale();
		nft.doPercent();
	}

}



