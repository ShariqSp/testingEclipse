package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.naming.ldap.Rdn;

import org.bouncycastle.crypto.io.MacOutputStream;
import org.bouncycastle.crypto.prng.RandomGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;
/**
 * author shariq
 */
public class justTrying 
{
	/**
	 * 
	 */
	public static List<Long> l = new ArrayList<Long>();
	public static Random rd = new Random();
	public static RandomString rs = new RandomString();
	
	public static void main(String[] args) {
		List<String> em = randomStrings("@gmail.com", 10);
		for(String e : em)
			System.out.println(e);
		List<Long> Mobile = randomNUmber(10);
		for(Long m : Mobile)
			System.out.println(m);
	}	
	/**
	 * 
	 * @param domain : enter your domain
	 * @param n : enter total number
	 * @return : returns list of strings
	 */
	public static  List<String> randomStrings(String domain,int n){
		String randomEmail="";
		List<String> Emails = new ArrayList<String>();
		while(n!=0)
		{
			if(!Emails.contains(randomEmail))
             Emails.add(rs.nextString()+domain);
             n--;
		}
		return Emails;
	}
	public static List<Long> randomNUmber(int n)
	{
		long rdNUmber=1;
		while(n!=0) {
		rdNUmber=rdNUmber+rd.nextLong(999999999l); 
		rdNUmber= new Long(9+""+rdNUmber);
		if(!l.contains(rdNUmber) &&(rdNUmber+"").length() ==10 )
		{
			l.add(rdNUmber);
			n--;
		}
		rdNUmber=1;
		
		}
		return l;
	}

}
