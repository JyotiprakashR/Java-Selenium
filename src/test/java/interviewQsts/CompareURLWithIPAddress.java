package interviewQsts;

import java.net.MalformedURLException;
import java.net.URL;

public class CompareURLWithIPAddress {

	public static void main(String[] args) {
		
		
		try {
			URL url=new URL("https://www.flipkart.com/");
			URL url1=new URL("https://163.53.76.86");
			System.out.println(new URL("https://www.orangehrm.com/").equals(new URL("https://50.19.134.225")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
