package school;

import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository<student, Long>{
	
}
