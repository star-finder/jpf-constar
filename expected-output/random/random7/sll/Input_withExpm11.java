package random.sll;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withExpm11 extends TestJPF {

	@Test
	public void test_withExpm11() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = null;
		int elem_1 = -10;
		root.elem = elem_1;
		root.next = next_2;
		obj.withExpm1(root);
	}

	@Test
	public void test_withExpm12() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = new random.sll.Node();
		random.sll.Node next_10 = new random.sll.Node();
		random.sll.Node next_12 = null;
		int elem_9 = 25;
		int elem_11 = -32;
		int elem_3 = -11;
		int elem_1 = 5;
		int elem_7 = 19;
		int elem_5 = -5;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		next_6.elem = elem_7;
		next_6.next = next_8;
		next_8.elem = elem_9;
		next_8.next = next_10;
		next_10.elem = elem_11;
		next_10.next = next_12;
		obj.withExpm1(root);
	}

	@Test
	public void test_withExpm13() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = new random.sll.Node();
		random.sll.Node next_10 = new random.sll.Node();
		random.sll.Node next_12 = new random.sll.Node();
		random.sll.Node next_14 = null;
		int elem_13 = -8;
		int elem_9 = 0;
		int elem_11 = -11;
		int elem_3 = -8;
		int elem_1 = -2;
		int elem_7 = 23;
		int elem_5 = -31;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		next_6.elem = elem_7;
		next_6.next = next_8;
		next_8.elem = elem_9;
		next_8.next = next_10;
		next_10.elem = elem_11;
		next_10.next = next_12;
		next_12.elem = elem_13;
		next_12.next = next_14;
		obj.withExpm1(root);
	}

	@Test
	public void test_withExpm14() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = null;
		int elem_3 = 12;
		int elem_1 = 0;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		obj.withExpm1(root);
	}

	@Test
	public void test_withExpm15() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = null;
		int elem_3 = 21;
		int elem_1 = -14;
		int elem_7 = 21;
		int elem_5 = 2;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		next_6.elem = elem_7;
		next_6.next = next_8;
		obj.withExpm1(root);
	}

	@Test
	public void test_withExpm16() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = null;
		int elem_3 = 5;
		int elem_1 = 31;
		int elem_5 = -4;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		obj.withExpm1(root);
	}

	@Test
	public void test_withExpm17() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = new random.sll.Node();
		random.sll.Node next_10 = new random.sll.Node();
		random.sll.Node next_12 = new random.sll.Node();
		random.sll.Node next_14 = new random.sll.Node();
		random.sll.Node next_16 = null;
		int elem_13 = 21;
		int elem_9 = -30;
		int elem_11 = -20;
		int elem_15 = -4;
		int elem_3 = 9;
		int elem_1 = -31;
		int elem_7 = 21;
		int elem_5 = -19;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		next_6.elem = elem_7;
		next_6.next = next_8;
		next_8.elem = elem_9;
		next_8.next = next_10;
		next_10.elem = elem_11;
		next_10.next = next_12;
		next_12.elem = elem_13;
		next_12.next = next_14;
		next_14.elem = elem_15;
		next_14.next = next_16;
		obj.withExpm1(root);
	}

	@Test
	public void test_withExpm18() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = new random.sll.Node();
		random.sll.Node next_10 = new random.sll.Node();
		random.sll.Node next_12 = new random.sll.Node();
		random.sll.Node next_14 = new random.sll.Node();
		random.sll.Node next_16 = new random.sll.Node();
		random.sll.Node next_18 = null;
		int elem_13 = 20;
		int elem_9 = -20;
		int elem_11 = 31;
		int elem_17 = 16;
		int elem_15 = 20;
		int elem_3 = 6;
		int elem_1 = -30;
		int elem_7 = 0;
		int elem_5 = -25;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		next_6.elem = elem_7;
		next_6.next = next_8;
		next_8.elem = elem_9;
		next_8.next = next_10;
		next_10.elem = elem_11;
		next_10.next = next_12;
		next_12.elem = elem_13;
		next_12.next = next_14;
		next_14.elem = elem_15;
		next_14.next = next_16;
		next_16.elem = elem_17;
		next_16.next = next_18;
		obj.withExpm1(root);
	}

	@Test
	public void test_withExpm19() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withExpm1(root);
	}

	@Test
	public void test_withExpm110() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = new random.sll.Node();
		random.sll.Node next_10 = null;
		int elem_9 = -5;
		int elem_3 = 10;
		int elem_1 = -14;
		int elem_7 = 30;
		int elem_5 = -32;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		next_6.elem = elem_7;
		next_6.next = next_8;
		next_8.elem = elem_9;
		next_8.next = next_10;
		obj.withExpm1(root);
	}

}

