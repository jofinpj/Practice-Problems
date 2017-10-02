package DSA.SLL;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SLLTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}
	
	/*@Test
	public void testSLL() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testPush() {
		fail("Not yet implemented"); // TODO
	}
*/
	@Test
	public void testInsert() {
		SLL linkedList = new SLL();
		linkedList.insert(8);
		linkedList.insert(9);
		linkedList.display();
		assertEquals("8 9 ", outContent.toString());
	}

	@Test
	public void testInsertAt() {
		SLL linkedList = new SLL();
		linkedList.insert(12);
		linkedList.insert(1);
		linkedList.display();
		assertEquals("12 1 ", outContent.toString());
		outContent.reset();
		linkedList.insertAt(3, 1);
		linkedList.display();
		assertEquals("3 12 1 ", outContent.toString());
		outContent.reset();
		linkedList.insertAt(5, 3);
		linkedList.display();
		assertEquals("3 12 5 1 ", outContent.toString());
		outContent.reset();
		linkedList.insertAt(7, 6);
		linkedList.display();
		assertEquals("3 12 5 1 7 ", outContent.toString());
		outContent.reset();
	}

/*
	@Test
	public void testPop() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testRemoveAt() {
		fail("Not yet implemented"); // TODO
	}
*/
	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}
}
