package stack;

import org.junit.Test;

import common.Utilities;
import gov.nasa.jpf.util.test.TestJPF;

public class StackLi_push1 extends TestJPF {

	@Test
	public void test_push1() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = null;
		java.lang.Object x = null;
		//System.out.println(Utilities.repOK(obj));
		obj.push(x);
	}

	@Test
	public void test_push2() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new stack.ListNode();
		stack.ListNode next_2 = null;
		java.lang.Object x = null;
		java.lang.Object element_1 = null;
		obj.topOfStack.element = element_1;
		obj.topOfStack.next = next_2;
		//System.out.println(Utilities.repOK(obj));
		obj.push(x);
	}

}

