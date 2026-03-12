package school;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class studentService {

	private studentRepo repo;

	studentService(studentRepo repo) {
		this.repo = repo;
	}

	public List<student> getAll() {
		return repo.findAll();
	}

	public student getOne(Long id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("student not Found" + id));
	}

	public student create(student s) {
		return repo.save(s);
	}

	public student update(Long id, student updated) {
		student s = getOne(id);
		s.setName(updated.getName());
		s.setAge(updated.getAge());
		s.setEmail(updated.getEmail());

		return repo.save(s);
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

}
