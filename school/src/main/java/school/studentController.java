package school;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class studentController {

	private studentService service;

	studentController(studentService service) {
		this.service = service;
	}

	@GetMapping
	public List<student> getAll() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public student getOne(@PathVariable Long id) {
		return service.getOne(id);
	}

	@PostMapping
	public ResponseEntity<student> create(@RequestBody student s) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.create(s));
	}

	@PutMapping("/{id}")
	public student update(@PathVariable Long id, @RequestBody student s) {
		return service.update(id, s);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
