package com.example.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.employee.controller.EmployeeController;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testStoreEmployee() throws Exception {
        String employeeJson = "{ \"employeeId\": \"E123\", \"firstName\": \"John\", \"lastName\": \"Doe\", \"email\": \"john.doe@example.com\", \"phoneNumbers\": [\"1234567890\"], \"doj\": \"2023-05-16\", \"salary\": 50000 }";
        mockMvc.perform(MockMvcRequestBuilders.post("/api/employees")
                .contentType("application/json")
                .content(employeeJson))
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }

    
}




