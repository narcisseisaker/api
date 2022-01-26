package com.hr.api;
//import static org.hamcrest.CoreMatchers.containsString;
//import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.api.controller.EmployeeController;
import com.hr.api.service.EmployeeService;


@WebMvcTest(controllers = EmployeeController.class)
public class EmployeeControllerTest {
    
    @Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private EmployeeService employeeService;
    
    @Test
    @ResponseBody
    public void testGetEmployees() throws Exception {
		/*
		 * mockMvc.perform(get("/employees")) .andExpect(status().isOk());
		 */
        mockMvc.perform(get("/employees"))
        .andDo(print())
        .andExpect(status().isOk());
    /*    .andExpect(content().string(containsString("Laurentine")));
        .andExpect(jsonPath("$[0].firstName", is("Laurentine")));*/

    }
}
