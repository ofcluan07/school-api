package net.school4poa.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import net.school4poa.school.model.StudentModel;
import net.school4poa.school.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@CrossOrigin(maxAge = 3600)
@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository repository;
	
	@GetMapping("/api/students")
    public List<StudentModel> getAllStudents() {
        return (List<StudentModel>) repository.findAll();
    }
	
	@GetMapping(path = "/api/students/{id}")
    public ResponseEntity consultar(@PathVariable("id") Integer id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/students/create")
    public StudentModel salvar(@RequestBody StudentModel student) {
        return repository.save(student);
    }
    
    @PutMapping("api/students/update/{id}")
	public ResponseEntity<StudentModel> updateStudent(@PathVariable(value = "id") Integer studentId, @RequestBody StudentModel studentDetails)  {
    	
    	Optional<StudentModel> studentOptional = repository.findById(studentId);

    	if (!studentOptional.isPresent())
    		return ResponseEntity.notFound().build();

    	studentDetails.setId(studentId);
    	
    	repository.save(studentDetails);

    	return ResponseEntity.noContent().build();
	}

    @DeleteMapping("api/students/delete/{id}")
    public void deleteStudent(@PathVariable(value = "id") Integer studentId) {
    	repository.deleteById(studentId);
    }

}
