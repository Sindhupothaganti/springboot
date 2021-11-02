package sbrest1;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller controls the incoming requests ie it maps the url to a java method
 * @author Admin
 *
 */
@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getStudents(){
		return studentService.getStudents();

	}

	@RequestMapping("/students/{id}")
	public Student findStudent(@PathVariable int id){//in url path there's a variable

		return studentService.findStudent(id);

	}


	@GetMapping("/")
	public String home() {
		return ("<h1>welcome home</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>welcome admin</h1>");
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>welcome user</h1>");
	}
}