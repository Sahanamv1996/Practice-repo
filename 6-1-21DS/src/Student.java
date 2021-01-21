import java.util.Date;

public class Student {
private String name;
private String id;
private Date dob;
public Student() {}
public Student(String name, String id, Date dob) {
	super();
	this.name = name;
	this.id = id;
	this.dob = dob;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String string) {
	this.id = string;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", dob=" + dob + "]";
}
@Override
public boolean equals(Object arg0) {
	Student arg=(Student) args();
	return super.equals(arg0);
}
private Student args() {
	return null;
}
//hello this is sahana
}
