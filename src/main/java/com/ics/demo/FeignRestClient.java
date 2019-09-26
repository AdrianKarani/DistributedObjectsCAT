package com.ics.demo;

import com.ics.demo.models.MockAppointment;
import com.ics.demo.models.MockLecturer;
import com.ics.demo.models.MockStudent;
import com.ics.demo.models.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@FeignClient(name = "client", url = "10.51.10.111/2200")
public interface FeignRestClient {

    @RequestMapping(method = RequestMethod.POST, value = "students")
    MockStudent createMockStudent(@RequestBody MockStudent mockStudent);

    @RequestMapping(method = RequestMethod.PATCH, value = "appointment/{id}")
    MockAppointment confirmMockAppointment(@PathVariable(name = "id") Long id, @RequestParam(value = "studentId") Long studentId);



//
//    @RequestMapping(method = RequestMethod.GET, value = "students")
//    MockStudent findById(@RequestParam(name = "student Number")String number);
//
//    @RequestMapping(method = RequestMethod.GET, value = "lecturers")
//    List<MockLecturer> getAllMockLecturers();
//
//    @RequestMapping(method = RequestMethod.POST, value = "appointment")
//    MockAppointment createMockAppointmnet(@RequestBody MockAppointment mockAppointment);
//
//
}
