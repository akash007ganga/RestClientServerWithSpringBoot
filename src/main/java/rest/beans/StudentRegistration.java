package rest.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {
	private List<Student> studentRecords;
	private static StudentRegistration stddb = null;

	private StudentRegistration() {
		studentRecords = new ArrayList<>();
	}

	public static StudentRegistration getInstance() {
		if (stddb == null) {
			stddb = new StudentRegistration();
			return stddb;
		} else {
			return stddb;
		}
	}

	public void add(Student std) {
		studentRecords.add(std);
	}

	public String upDateStudent(Student std) {
		for (int i = 0; i < studentRecords.size(); i++) {
			Student stdn = studentRecords.get(i);
			if (stdn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
				studentRecords.set(i, std);// update the new record
				return "Update successful";
			}
		}
		return "Update un-successful";
	}

	public String deleteStudent(String registrationNumber) {
		for (int i = 0; i < studentRecords.size(); i++) {
			Student stdn = studentRecords.get(i);
			if (stdn.getRegistrationNumber().equals(registrationNumber)) {
				studentRecords.remove(i);// update the new record
				return "Delete successful";
			}
		}
		return "Delete un-successful";
	}

	public List<Student> getStudentRecords() {
		return studentRecords;
	}

}
