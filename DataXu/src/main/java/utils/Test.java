package utils;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;




public class Test {
	public static void main(String args[]) throws UnsupportedEncodingException{
				String aa = Base64.encodeBase64String("data".getBytes());
		byte[] bb = Base64.encodeBase64("data".getBytes());
		System.out.println(new String(Base64.decodeBase64(bb)));
		System.out.print("1");
		System.out.print(aa);
		System.out.print(new String(bb));
		System.out.println("cc");
		
	}
}
