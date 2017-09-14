package students.main;

import students.utils.Logger;


public class Runner {

	public static void main(String[] args) {
		University bsu = new University();

		
		Group firstGroup = new Group();
		firstGroup.setName("FPM");

		Student vasya = new Student();
		vasya.setName("Vasya");
		vasya.setId(1);
		vasya.setMark(9);
		
		Student petya = new Student();
		petya.setName("Petya");
		petya.setId(2);
		petya.setMark(4);
		
		firstGroup.addStudent(vasya);
		firstGroup.addStudent(petya);


		Group secondGroup = new Group();
		secondGroup.setName("Fizmat");

		Student ksenia = new Student();
		ksenia.setName("Ksenia");
		ksenia.setId(3);
		ksenia.setMark(3);
		
		Student lyda = new Student();
		lyda.setName("Lyda");
		lyda.setId(4);
		lyda.setMark(5);
		
		secondGroup.addStudent(ksenia);
		secondGroup.addStudent(lyda);
		
		bsu.addGroup(firstGroup);
		bsu.addGroup(secondGroup);
		
		firstGroup.assessGroup();
		secondGroup.assessGroup();
		
		Logger.log(bsu.getRewardedGroups());
		
	}
	

}
