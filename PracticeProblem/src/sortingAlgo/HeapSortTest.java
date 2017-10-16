package sortingAlgo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HeapSortTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

		int[] actualResult = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int[] testSet1 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] testSet2 = {5, 2, 11, 3, 9, 1, 6, 10, 8, 4, 7};
		HeapSort.sort(testSet1);
		displayArray(testSet1);
		HeapSort.sort(testSet2);
		displayArray(testSet2);
		assertArrayEquals(testSet1, actualResult);
		assertArrayEquals(testSet2, actualResult);
	}
	
	void displayArray(int[] arr) {
		System.out.println("");
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
