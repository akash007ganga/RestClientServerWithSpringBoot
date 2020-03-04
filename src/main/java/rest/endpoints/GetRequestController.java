package rest.endpoints;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import rest.beans.Student;
import rest.beans.StudentRegistration;

@RestController
public class GetRequestController {
	@GetMapping("/student/allstudent")
	@ResponseBody
	public List<Student> getAllStudents() {
		return StudentRegistration.getInstance().getStudentRecords();
	}
}
