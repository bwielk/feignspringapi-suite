package com.springtestngfeign;

import com.springtestngfeign.frignimplementation.FeignSpringimplementationApplication;
import com.springtestngfeign.frignimplementation.configuration.APIConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest(classes = FeignSpringimplementationApplication.class)
@ContextConfiguration(classes = APIConfiguration.class)

public class BaseAPITest extends AbstractTestNGSpringContextTests {
}
