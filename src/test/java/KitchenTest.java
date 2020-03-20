import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class KitchenTest {

	Kitchen emptyKitchen;
	Kitchen kitchenWithOne;
	Kitchen kitchenWithMany;

	@Before
	public void setUp(){
		emptyKitchen = new Kitchen();

		kitchenWithOne = new Kitchen();
		kitchenWithOne.add("yellow corn");

		kitchenWithMany = new Kitchen();
		kitchenWithMany.add("red corn");
		kitchenWithMany.add("blue corn");
		kitchenWithMany.add("white corn");
		kitchenWithMany.add("yellow corn");
	}

	@Test
	public void testIsEmpty(){
		assertTrue(emptyKitchen.isEmpty());
		assertFalse(kitchenWithOne.isEmpty());
	}

	@Test
	public void testSize(){
		assertSame(0, emptyKitchen.size());
		assertSame(1, kitchenWithOne.size());
		assertSame(4, kitchenWithMany.size());
	}

	@Test
	public void testAdd(){
		assertTrue(emptyKitchen.isEmpty());
		assertFalse(kitchenWithOne.isEmpty());
		assertFalse(kitchenWithMany.isEmpty());
	}

	@Test
	public void testRemove(){
		kitchenWithOne.pop();
		assertSame(0, kitchenWithOne.size());
		kitchenWithMany.pop();
		assertSame(3, kitchenWithMany.size());
	}

	@Test
	public void testContains(){
		assertFalse(emptyKitchen.contains("blue corn"));
		assertTrue(kitchenWithOne.contains("yellow corn"));
		assertTrue(kitchenWithMany.contains("blue corn"));
	}
}
