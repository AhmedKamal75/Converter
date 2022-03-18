package testing;

import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import code.ParseException;
import code.converter;

public class Testing {
	private converter parser = null;
	
	@Test
	public void testInput0() {
		try {
			String input = "ADD HEADING WITH TEXT \"this_is_a_text.believe_me\" AND WITH FONT \"font23\" AND WITH COLOR \"Black\"";
			String expectedOutput = "<h1  style=\"font-family:\"font23\";color:\"Black\" \">this_is_a_text.believe_me </h1 >";		
			parser = new converter(new ByteArrayInputStream(input.getBytes()));
			Assert.assertEquals(expectedOutput, parser.words());	
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
		
	@Test
	public void testInputs1() {
		try {
			String input = "ADD IMAGE WITH SOURCE \"www.google.com\"";
			String expectedOutput = "<img src=\"www.google.com\"/>";		
			converter.ReInit(new ByteArrayInputStream(input.getBytes()));
			Assert.assertEquals(expectedOutput, parser.words());	
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
			Assert.assertTrue(parser.words().getClass() == String.class);	
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
			Assert.assertTrue(parser.words().getClass() == String.class);	
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
			Assert.assertTrue(parser.words().getClass() == String.class);	
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
			Assert.assertTrue(parser.words().getClass() == String.class);	
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
			Assert.assertTrue(parser.words().getClass() == String.class);	
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
