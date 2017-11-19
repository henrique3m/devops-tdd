import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestConversorRomano {

	Conversor conversor = new Conversor();
	
	@Test
	public void testConversorI() {
		String romano = conversor.converte(1);
		Assert.assertEquals("", "I", romano);
	}
	
	@Test
	public void testConversorII() {
		String romano = conversor.converte(2);
		Assert.assertEquals("", "II", romano);
	}
	
	@Test
	public void testConversorIII() {
		String romano = conversor.converte(3);
		Assert.assertEquals("", "III", romano);
	}	
	
	@Test
	public void testConversorIV() {
		String romano = conversor.converte(4);
		Assert.assertEquals("", "IV", romano);
	}
	
	@Test
	public void testConversorV() {
		String romano = conversor.converte(5);
		Assert.assertEquals("", "V", romano);
	}	
	
	
	@Test
	public void testConversorVI() {
		String romano = conversor.converte(6);
		Assert.assertEquals("", "VI", romano);
	}
	
	@Test
	public void testConversorVII() {
		String romano = conversor.converte(7);
		Assert.assertEquals("", "VII", romano);
	}
	
	@Test
	public void testConversorVIII() {
		String romano = conversor.converte(8);
		Assert.assertEquals("", "VIII", romano);
	}
	
	@Test
	public void testConversorIX() {
		String romano = conversor.converte(9);
		Assert.assertEquals("", "IX", romano);
	}
	
	@Test
	public void testConversorX() {
		String romano = conversor.converte(10);
		Assert.assertEquals("", "X", romano);
	}
			
	@Test
	public void testConversorXLVI() {
		String romano = conversor.converte(46);
		Assert.assertEquals("", "XLVI", romano);
	}
	
	@Test
	public void testConversorL() {
		String romano = conversor.converte(50);
		Assert.assertEquals("", "L", romano);
	}
	
	@Test
	public void testConversorLXVII() {
		String romano = conversor.converte(67);
		Assert.assertEquals("", "LXVII", romano);
	}
	
	
	@Test
	public void testConversorC() {
		String romano = conversor.converte(100);
		Assert.assertEquals("", "C", romano);
	}	
	
	@Test
	public void testConversorCXLIX() {
		String romano = conversor.converte(149);
		Assert.assertEquals("", "CXLIX", romano);
	}
	
	@Test
	public void testConversorCDXXII() {
		String romano = conversor.converte(422);
		Assert.assertEquals("", "CDXXII", romano);
	}
	
	@Test
	public void testConversorD() {
		String romano = conversor.converte(500);
		Assert.assertEquals("", "D", romano);
	}
	
	@Test
	public void testConversorDCCLXXIV() {
		String romano = conversor.converte(774);
		Assert.assertEquals("", "DCCLXXIV", romano);
	}

	@Test
	public void testConversorM() {
		String romano = conversor.converte(1000);
		Assert.assertEquals("", "M", romano);
	}
	
	@Test
	public void testConversorMI() {
		String romano = conversor.converte(1001);
		Assert.assertEquals("", "MI", romano);
	}
	
	@Test
	public void testConversorMMMDCLVIII() {
		String romano = conversor.converte(3658);
		Assert.assertEquals("", "MMMDCLVIII", romano);
	}
}
