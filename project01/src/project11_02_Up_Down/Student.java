package project11_02_Up_Down;

public class Student extends Person {
int grade;
String major;

public Student() {
	this("이름 없음", 1, 1, "없음");
}

public Student(String name,int age,int grade, String major ) {
	super(name, age);
	this.grade = grade;
	this.major = major;
}

public int getGrade() {
	return grade;
}

public void setGrade(int grade) {
	this.grade = grade;
}

public String getMajor() {
	return major;
}

public void setMajor(String major) {
	this.major = major;
}

@Override
public String toString() {
	return "Student [grade=" + grade + ", major=" + major + "]";
}



}
