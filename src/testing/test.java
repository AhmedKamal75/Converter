package testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Test;

import code.ParseException;
import code.converter;

public class test {
	private converter parser = null;
	
	@Test
	public void testInputs1() {		
		try {
			String input = "ADD IMAGE WITH SOURCE \"https://www.w3schools.com/html/pic_trulli.jpg\"";
			String expectedOutput = "<img src=\"https://www.w3schools.com/html/pic_trulli.jpg\"/>";		
			parser = new converter(new ByteArrayInputStream(input.getBytes()));
			Assert.assertEquals(expectedOutput, parser.words());
			
//			input = "ADD HEADING WITH TEXT \"HelloWorld\"";
//			expectedOutput = "<h1 >HelloWorld </h1 >";
//			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
//			Assert.assertEquals(expectedOutput, parser.words());
			
//			input = "ADD PARAGRAPH WITH TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"";
//			expectedOutput = "<p  style=\"font-family:\"Arial\";color:\"Red\" \">Welcome </p>";
//			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
//			Assert.assertEquals(expectedOutput, parser.words());
			
//			input = "ADD LINK WITH TEXT \"Search\" AND WITH LINK \"http://google.com\"";
//			expectedOutput = "<a href=\"http://google.com\">Search </a>";		
//			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
//			Assert.assertEquals(expectedOutput, parser.words());
			
//			input = "ADD LINK WITH TEXT \"Email\" AND WITH LINK \"http://gmail.com\" AND WITH COLOR \"Green\"";
//			expectedOutput = "<a href=\"http://gmail.com\" style=\"color:\"Green\";\">Email </a>";		
//			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
//			Assert.assertEquals(expectedOutput, parser.words());
			
//			input = "ADD PARAGRAPH WITH FONT \"Arial\" AND WITH TEXT \"Good.bye\"";
//			expectedOutput = "<p >Good.byefont-family:\"Arial\" </p>";		
//			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
//			Assert.assertEquals(expectedOutput, parser.words());
			
//			input = "ADD PARAGRAPH WITH TEXT \"ThisIsAParagraph1\" AND WITH FONT \"ThisIsAFont1\" AND WITH COLOR \"Blue\"";
//			expectedOutput = "<p  style=\"font-family:\"ThisIsAFont1\";color:\"Blue\" \">ThisIsAParagraph1 </p>";		
//			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
//			Assert.assertEquals(expectedOutput, parser.words());
			
//			input = "ADD LINK WITH TEXT \"ThisIsAText1\" AND WITH LINK \"ThisIsALink1\"";
//			expectedOutput = "<a href=\"ThisIsALink1\">ThisIsAText1 </a>";		
//			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
//			Assert.assertEquals(expectedOutput, parser.words());
			
//			input = "ADD HEADING WITH TEXT \"ThisIsAHeading1\" AND WITH FONT \"ThisIsAFont2\" AND WITH COLOR \"pink\"";
//			expectedOutput = "<h1  style=\"font-family:\"ThisIsAFont2\";color:\"pink\" \">ThisIsAHeading1 </h1 >";		
//			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
//			Assert.assertEquals(expectedOutput, parser.words());
			
//			input = "ADD IMAGE WITH SOURCE \"www.google.com\"";
//			expectedOutput = "<img src=\"www.google.com\"/>";		
//			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
//			Assert.assertEquals(expectedOutput, parser.words());

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	public void testInputs2() {
		try {
			String input = "ADD HEADING WITH TEXT \"HelloWorld\"";
			String expectedOutput = "<h1 >HelloWorld </h1 >";
			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
			Assert.assertEquals(expectedOutput, parser.words());	
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testInputs3() {
		try {
			String input = "ADD PARAGRAPH WITH TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"";
			String expectedOutput = "<p  style=\"font-family:\"Arial\";color:\"Red\" \">Welcome </p>";
			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
			Assert.assertEquals(expectedOutput, parser.words());	
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testInputs4() {
		try {
			String input = "ADD LINK WITH TEXT \"Search\" AND WITH LINK \"http://google.com\"";
			String expectedOutput = "<a href=\"http://google.com\">Search </a>";		
			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
			Assert.assertEquals(expectedOutput, parser.words());	
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testInputs5() {
		try {
			String input = "ADD LINK WITH TEXT \"Email\" AND WITH LINK \"http://gmail.com\" AND WITH COLOR \"Green\"";
			String expectedOutput = "<a href=\"http://gmail.com\" style=\"color:\"Green\";\">Email </a>";		
			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
			Assert.assertEquals(expectedOutput, parser.words());	
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testInputs6() {
		try {
			String input = "ADD PARAGRAPH WITH FONT \"Arial\" AND WITH TEXT \"Good.bye\"";
			String expectedOutput = "<p >Good.byefont-family:\"Arial\" </p>";		
			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
			Assert.assertEquals(expectedOutput, parser.words());	
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testInputs7() {
		try {
			String input = "ADD PARAGRAPH WITH TEXT \"ThisIsAParagraph1\" AND WITH FONT \"ThisIsAFont1\" AND WITH COLOR \"Blue\"";
			String expectedOutput = "<p  style=\"font-family:\"ThisIsAFont1\";color:\"Blue\" \">ThisIsAParagraph1 </p>";		
			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
			Assert.assertEquals(expectedOutput, parser.words());	
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testInputs8() {
		try {
			String input = "ADD LINK WITH TEXT \"ThisIsAText1\" AND WITH LINK \"ThisIsALink1\"";
			String expectedOutput = "<a href=\"ThisIsALink1\">ThisIsAText1 </a>";		
			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
			Assert.assertEquals(expectedOutput, parser.words());	
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testInputs9() {
		try {
			String input = "ADD HEADING WITH TEXT \"ThisIsAHeading1\" AND WITH FONT \"ThisIsAFont2\" AND WITH COLOR \"pink\"";
			String expectedOutput = "<h1  style=\"font-family:\"ThisIsAFont2\";color:\"pink\" \">ThisIsAHeading1 </h1 >";		
			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
			Assert.assertEquals(expectedOutput, parser.words());	
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
//	@Test
//	public void testInputs10() {
//		try {
//			String input = "ADD HEADING WITH TEXT \"this_is_a_text.believe_me\" AND WITH FONT \"font23\" AND WITH COLOR \"Black\"";
//			String expectedOutput = "<h1  style=\"font-family:\"font23\";color:\"Black\" \">this_is_a_text.believe_me </h1 >";		
//			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
//			Assert.assertEquals(expectedOutput, parser.words());	
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//	}

//	
//	@Test
//	public void testInputs10() {
//		try {
//			String input = "ADD IMAGE WITH SOURCE \"www.google.com\"";
//			String expectedOutput = "<img src=\"www.google.com\"/>";		
//			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
//			Assert.assertEquals(expectedOutput, parser.words());	
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//	}

}
