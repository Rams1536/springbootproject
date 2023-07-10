package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Service.StudentService;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/save")
    public String saveStudent(@RequestBody Student student) {
        studentService.saveUpdate(student);
        return student.get_id();
    }

    @GetMapping(value = "/getAll")
    public Iterable<Student> getStudents() {
        return studentService.listAll();
    }

    @Contract("_, _ -> param1")
    @PutMapping(value = "/edit/{id}")
    private @NotNull Student updateStudent(@RequestBody Student student, @PathVariable(name = "id") String _id) {
        student.set_id(_id);
        studentService.saveUpdate(student);
        return student;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteStudent(@PathVariable("id") String _id) {
        studentService.deleteStudent(_id);
    }
}
