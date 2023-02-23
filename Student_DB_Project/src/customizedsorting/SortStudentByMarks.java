package customizedsorting;

import java.util.Comparator;


import sdbms.Student;

public class SortStudentByMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		Double x=o1.getMarks();
		Double y=o2.getMarks();
		return x.compareTo(y);
//		return o1.getMarks().compareTo(o2.getMarks());
	}

}
