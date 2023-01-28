package com.ex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.ex.controller.ExpenseController;
import com.ex.model.Expense;
import com.ex.service.Expenseservice;
@RunWith(SpringRunner.class)
@SpringBootTest(classes=com.ex.SpringExpenseApplication.class,
webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class SpringExpenseApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private Expenseservice expenseService;

	@BeforeEach
	public void setUp() {
		ExpenseController controller=new ExpenseController();
		controller.setExpenseService(expenseService);
		mockMvc=MockMvcBuilders.standaloneSetup(controller).build();
	}
	Expense expense= new Expense("shopping",2000,"online",9987286979L, 78);
 @Test
   public void findById() throws Exception{
	 Mockito.when(expenseService.findById(Mockito.anyLong())).thenReturn(expense);
RequestBuilder requestBuilder=MockMvcRequestBuilders.get("/expense/69").accept(MediaType.APPLICATION_JSON);
MvcResult result=mockMvc.perform(requestBuilder).andReturn();
String expectedExpense="{'name':'shopping','amount':2000,'payment_type':'online','mobileNumber':9987286979,'tripId':78}";
JSONAssert.assertEquals(expectedExpense, result.getResponse().getContentAsString(), true);



}

}
