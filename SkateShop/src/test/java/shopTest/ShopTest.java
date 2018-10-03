package shopTest;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

import skateshop.Decks;
import skateshop.Shoes;
import skateshop.Trucks;
import skateshop.Wheels;

public class ShopTest {
	
	Decks d;
	Shoes s;
	Trucks t;
	Wheels w;
	
	char choice;
	

	@Before
	public void setUp() throws Exception {
		
		choice='0';
		
		d = new Decks(0, " ", 0);
		s = new Shoes(0, " ", 0);
		t = new Trucks(0, " ", 0);
		w = new Wheels(0, " ", 0);
		

		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
