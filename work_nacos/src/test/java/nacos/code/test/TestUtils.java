package nacos.code.test;

import nacos.code.NacosSpringBootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
@SpringBootTest(classes = NacosSpringBootApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestUtils {

    @Value(value = "${server.port}")
    private String serverPort;
    @Value(value = "${spring.application.name}")
    private String springname;


    @Test
    public void test1(){
        System.out.println(serverPort);
        System.out.println(springname);
    }
}
