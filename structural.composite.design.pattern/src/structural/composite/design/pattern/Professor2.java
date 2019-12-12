package structural.composite.design.pattern;
import java.util.ArrayList;
import java.util.List;

public class Professor2 implements college 
{

private String name;
	 List<college> students = new ArrayList<>();
	 
	 public Professor2(String name)
	 {
	 this.name = name;
	 }
	 
	 public void addstudents(college c) {
	 students.add(c);
	 }
	 
	 public void removestudents(college c) {
	 students.remove(c);
	 }
	 
	 @Override
	 public void PrintDetails()
	 {
	 System.out.println(name);
	 System.out.println("has this group of students"); 
	 for(college c : students)
	 {
	 c.PrintDetails();
	 }
	 }
	 
	}