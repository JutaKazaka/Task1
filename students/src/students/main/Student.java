package students.main;

public class Student {
	
	private String name;
	
	private int id;
	
	private int mark;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id < 0) {
			throw new RuntimeException("Incorrect id for student: " + name);
		}
		this.id = id;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		if (id < 0) {
			throw new RuntimeException("Incorrect mark:" + mark);
		}
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}
