package vn.edu.eiu.student_view.fecse456studentiddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.eiu.student_view.fecse456studentiddemo.model.Major;
@Repository
public interface MajorRepository extends JpaRepository<Major, Long> {
}
