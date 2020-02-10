import java.util.ArrayList;
import java.util.List;
public class ProjectEuler{
	public static void main(String[] args){
		Mult35 mClass = new Mult35();
		mClass.print(10);
		// mClass.print(1000);

		FiboSum fClass = new FiboSum();
		fClass.print(11);
		// fClass.print(4000001);

		LargestPrime lClass = new LargestPrime();
		lClass.print();

		Amazon aClass = new Amazon();
		int[] cells = {1,0,0,0,0,1,0,0};
		System.out.println("test case1");
		List<Integer> states = new ArrayList<Integer>();
		states.add(1);
		states.add(0);
		states.add(0);
		states.add(0);
		states.add(0);
		states.add(1);
		states.add(0);
		states.add(0);
		aClass.cells(states, 1);

		System.out.println("test case2");
		List<Integer> states2 = new ArrayList<Integer>();
		states2.add(1);
		states2.add(1);
		states2.add(1);
		states2.add(0);
		states2.add(1);
		states2.add(1);
		states2.add(1);
		states2.add(1);
		aClass.cells(states2, 2);
	}
}