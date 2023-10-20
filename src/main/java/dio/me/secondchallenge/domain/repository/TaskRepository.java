package dio.me.secondchallenge.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.me.secondchallenge.domain.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    boolean existsById(Long  taskId); 
}
