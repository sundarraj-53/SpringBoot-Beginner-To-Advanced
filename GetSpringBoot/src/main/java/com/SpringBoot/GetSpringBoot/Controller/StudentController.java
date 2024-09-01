package com.SpringBoot.GetSpringBoot.Controller;

import java.util.ArrayList;
import java.util.List;
import com.SpringBoot.GetSpringBoot.Bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

    //http://localhost:8080/student/get-student-details

    @GetMapping("get-student-details")
    public ResponseEntity<Student> getStudent(){


        //Basics of ResponseEntity

/*
        return new ResponseEntity<>(new Student(
                  1,
                "Sundarraj",
                23,
                7582525,
                "Test@gmail.com"
        ),HttpStatus.OK);

*/

        //It  have the ok method like body builder
/*
        return ResponseEntity.ok(new Student(
                1,
                "Sundarraj",
                23,
                7582525,
                "Test@gmail.com"
        ));

 */
        return ResponseEntity.ok()
                .header("createdBy","Sundarraj")
                .body(new Student( 1, "Sundarraj", 23, 7582525, "Test@gmail.com"));
    }


    //http://localhost:8080/student/get-students-details

    @GetMapping("get-students-details")
    @ResponseBody
    public ResponseEntity<List<Student>> getStudentList(){
        List<Student> StudentList=new ArrayList<Student>();
        StudentList.add(new Student( 1, "Ajay Rathnam", 23, 7582525, "TestAjay@gmail.com"));
        StudentList.add(new Student( 2, "Nagarajan", 22, 7582525, "TestNaga@gmail.com"));
        StudentList.add(new Student( 3, "Anandha Rishi Kesavan", 21, 7582525, "TestRishi@gmail.com"));
        StudentList.add(new Student( 4, "Sri Sutharsan", 20, 7582525, "TestSri@gmail.com"));
        StudentList.add(new Student( 5, "Sundarraj", 19, 7582525, "TestSundar@gmail.com"));

        return new ResponseEntity<>(StudentList,HttpStatus.OK);

    }

    //http://localhost:8080/student/get-student-details/5/Sundarraj/TestSundar@gmail.com
    //{id}-->URI template variable
    //{name}->URI template variable
    //{studentEmail}-->URI template variable
    //Spring BOOT Rest API Using Path Variable


    @GetMapping("get-student-details/{id}/{name}/{email}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") int studentId,@PathVariable("name") String studentName,@PathVariable("email") String studentEmail){

        return new ResponseEntity<>(new Student(studentId,studentName,21,7582525,studentEmail),HttpStatus.OK);
    }

    //Spring Boot Application with Request Param
    //http://localhost:8080/student/get-student-detail/query?id=1&name="Sundarraj"&email="TestSundar@gamil.com"
    //Query parameter to get the extract the specifi values

    @GetMapping("get-student-detail/query")
    public ResponseEntity<Student> getQueryData(@RequestParam int id,@RequestParam String name,@RequestParam String email){
        return new ResponseEntity<>(new Student(id,name,10,4555,email),HttpStatus.OK);
    }


    //Spring Boot Application With Post mapping
    //http://localhost:8080/student/create-student
    //we can define the response status code manually using response entity

    @PostMapping("create-student")
//    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println(student.getPrint());
        return new ResponseEntity<>(student,HttpStatus.CREATED);
    }

    //Spring Boot Application With Put mapping
    //Working on Thunder client not on postman
    //http://localhost:8080/student/1/update


    @PutMapping("{id}/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id") int newStudentId){
        System.out.println(student.getPrint());
        return new ResponseEntity<>(new Student(newStudentId,student.getName(),student.getAge(),student.getPhonenumber(),student.getEmail()),HttpStatus.OK);

    }

    //Spring Boot Application With Put mapping
    //Working on Thunder client not on postman
    //http://localhost:8080/student/1/delete



    @DeleteMapping("{id}/delete")

    public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId){
        return new ResponseEntity<>("Student Deleted Successfully",HttpStatus.OK);
    }



}
