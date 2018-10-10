package shopTest;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

import skateshop.Decks;
import skateshop.Shoes;
import skateshop.SkateFloor;
import skateshop.Trucks;
import skateshop.Wheels;

public class ShopTest {
	
	SkateFloor sf;
	Shoes s;
	Trucks t;
	Wheels w;
	Decks d;
	
	int a,b;
	

	
	@Test
	public void testCalc() {
		a = 20;
		b = 10;
		
		int ans = d.calculate(a, b);
		
		assertEquals(10, ans);		
	}
}
