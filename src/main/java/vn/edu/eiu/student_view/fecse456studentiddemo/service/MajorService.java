package vn.edu.eiu.student_view.fecse456studentiddemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.eiu.student_view.fecse456studentiddemo.model.Major;
import vn.edu.eiu.student_view.fecse456studentiddemo.repository.MajorRepository;
@Service
public class MajorService {
    @Autowired
    private MajorRepository majorRepository;

    public void saveMajor(Major major){
        majorRepository.save(major);
    }

    public void deleteMajor(Major major){
        majorRepository.delete(major);
    }



}
