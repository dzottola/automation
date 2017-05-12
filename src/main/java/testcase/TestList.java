package testcase;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println("Value at 1st:"+list.get(1));
		System.err.println("Size: "+list.size());
		list.remove(2);
		System.err.println("Size: "+list.size());
		list.clear();
		System.err.println("Size: "+list.size());

	}

}
