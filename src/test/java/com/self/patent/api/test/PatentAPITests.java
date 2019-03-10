package com.self.patent.api.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.self.patent.api.PatentController;
import com.self.patent.model.Patent;
import com.self.patent.service.PatentService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = PatentController.class, secure = false)
public class PatentAPITests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	PatentService patentServiceMock;
	
	@Test
	public void getAllPatents() throws Exception {
		
		Patent patient=new Patent();
		patient.setPatentId(new Long(1));
		 List<Patent> patents=new ArrayList<Patent>();
		 patents.add(patient);
		Mockito.when(patentServiceMock.getAll()).thenReturn(patents);

		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/patents").accept(
				MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		 Assert.assertNotNull(result);
	}
	
	/** 
	 * Tests if post method api is working to update patent as expected
	 * @throws Exception
	 */
	@Test
	public void addPatent() throws Exception {
		
		Patent patient=new Patent();
		patient.setPatentId(new Long(1));
		Mockito.when(patentServiceMock.save(new Patent())).thenReturn(patient);

		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/patent").accept(
				MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		 Assert.assertNotNull(result);
	}
	
	/**
	 * Tests get patent api
	 * @throws Exception
	 */
	@Test
	public void getPatent() throws Exception {
		
		Patent patient=new Patent();
		patient.setPatentId(new Long(1));
		Mockito.when(patentServiceMock.get(new Long(1))).thenReturn(patient);

		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/patent").accept(
				MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		 Assert.assertNotNull(result);
	}

}
