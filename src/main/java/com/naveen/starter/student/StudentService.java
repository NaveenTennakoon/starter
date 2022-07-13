package com.naveen.starter.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "Naveen",
                        "naveen.tennakoon@gmail.com",
                        LocalDate.of(1997, 8, 12),
                        24
                )
        );
    }
}
