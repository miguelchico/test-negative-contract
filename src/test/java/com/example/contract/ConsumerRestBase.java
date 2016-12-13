package com.example.contract;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import com.example.MyCustomException;
import com.example.MyService;
import com.example.TestNegativeContractApplication;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=TestNegativeContractApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class ConsumerRestBase {

    @MockBean
    private MyService myService;

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setup() {
        when(myService.getFromService()).thenThrow(MyCustomException.class);
        RestAssuredMockMvc.webAppContextSetup(context);
    }

}
