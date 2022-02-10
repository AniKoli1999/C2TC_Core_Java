package javaTutorial;
import java.util.ArrayList;
import java.util.stream.*;
public class StreamApiDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(10);
		marks.add(0);
		marks.add(35);
		marks.add(5);
		marks.add(45);
		marks.add(17);
		marks.add(16);
		
		System.out.println(marks);
		Stream<Integer> stream=marks.stream();
		ArrayList<Integer> UpdatedMarks=(ArrayList<Integer>) marks.stream().map(i->+5).collect(Collectors.toList());
		System.out.println(UpdatedMarks);

		long failed=marks.stream().filter(i->i<10).count();
		System.out.println(failed);
	}

}
