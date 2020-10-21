/**
 * 
 */
package org.cipher;
import java.util.*;

/**
 * @author Shemar
 *
 */
public class CipherBuilderExample {
private int offset = 0;



// Create an object where a message is written in the parameter as well as the offset number
StringBuilder cipher(String message, int offset) {
	offset = offset% 26;

// Create a ciphered sentence
StringBuilder result = new StringBuilder();

//Loop thorugh the characters  
for (char character : message.toCharArray()) {
    if (character != ' ') {
        int originalLetter = character - 'a';
        int newLetter = (originalLetter + offset) % 26;
        char newCharacter = (char) ('a' + newLetter);
        //add the new 
        result.append(newCharacter);
    } else {
        result.append(character);
    }
}
return result;
}

	
	
}

