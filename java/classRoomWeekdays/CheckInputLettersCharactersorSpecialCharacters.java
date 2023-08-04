package classRoomWeekdays;

import org.junit.Assert;

import org.junit.Test;

public class CheckInputLettersCharactersorSpecialCharacters {

	
//		I/P O/P
//		a - alphabet
//		7 - number
//		@ - special char
		
		/*
		 * receive input as character
		 * output as String
		 * if the input is 'a'> and less than 'z' 'A' to 'Z'
		 * 
		 * if great than 0 less than 9 print as number
		 * 
		 * if not any of the above print as special character
		 * 
		 */
		
		@Test
		public void Test1() {
			Assert.assertEquals("Number", CheckCharacter('2'));
		}
		
		@Test
		public void Test2() {
			Assert.assertEquals("Alphabet", CheckCharacter('z'));
		}
		@Test
		public void Test3() {
			Assert.assertEquals("Special character", CheckCharacter('{'));
		}
		
		public String CheckCharacter(char inp) {
		String output = "";
		if (!(inp>='A'&&inp<='z'||inp>='0'&&inp<='9')) {
			output = "Special character";
		}		
		if (inp>='A'&&inp<='z') {
			output = "Alphabet";
		}
		if (inp>='0'&&inp<='9') {
			output = "Number";
		}
		return output;
		}
	}


