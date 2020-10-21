/**
 * 
 */
package org.cipher;

/**
 * @author Shemar
 *
 */
public class CipherMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CipherBuilderExample cipher = new CipherBuilderExample();
		 
		StringBuilder cipheredMessage = cipher.cipher("The sun did not shine, it was too wet to play, so we sat in the house all that cold, cold wet day", 3);
		System.out.println(cipheredMessage + "\n");
		
		StringBuilder cipheredMessage2 = cipher.cipher("The New England Patriots are Super Bowl champions! ", 5);
		System.out.println(cipheredMessage2);
	}

}
