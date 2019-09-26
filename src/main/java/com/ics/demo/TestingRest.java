package com.ics.demo;

import com.ics.demo.models.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class TestingRest implements CommandLineRunner {
    private final FeignRestClient feignRestClient;

    public TestingRest(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {

            MockStudent mockStudent1 =feignRestClient.createMockStudent(new MockStudent("2","Andrew Maina","Male"));
            System.out.println("Student Updated: "+mockStudent1.toString());

            MockStudent mockStudent2 =feignRestClient.createMockStudent(new MockStudent("3","Vivs Rayna ","Female"));
            System.out.println("Student Updated: "+mockStudent2.toString());


        }
    }










//
//        MockStudent mockStudent2 =feignRestClient.createMockStudent(new MockStudent("3","Vivian Jasmine Keith","Female"));
//        System.out.println("Student Updated: "+mockStudent2.toString());
//
//
//        MockStudent registeredStudent=feignRestClient.findById(mockStudent1.getStudentnumber(1));
//        System.out.println("Student Registered: "+registeredStudent);
//
//
//
//
//        List<MockLecturer> lecturers= feignRestClient.getAllMockLecturers();
//        System.out.println("Lecturers are: "+lecturers);
//
//        MockAppointment mockAppointment= feignRestClient.createMockAppointment(new MockAppointment(mockStudent1.getId(),3L));
//        System.out.println("New Appointment: "+mockAppointment.toString());





//        List<University> universities = response.getBody();
//        System.out.println("Response:" + universities.toString());
//
//        University university = restTemplate.getForObject(
//                "http://10.51.10.111:9090/universities/1",
//                University.class
//        );



//    Student student =new Student(94007,"Tyrone Mugambi");    }
//}
