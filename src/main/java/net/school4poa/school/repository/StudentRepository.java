package net.school4poa.school.repository;

import net.school4poa.school.model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentModel, Integer>{

}
