package ru.learn.springnettycxfpublish;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.learn.api.BookServiceEndPoint;

@Configuration
public class AppConfig {

    @Bean(name= Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        SpringBus cxfBus = new SpringBus();
        return cxfBus;
    }

    @Bean
    public javax.xml.ws.Endpoint endpoint(Bus bus, BookServiceEndPoint bookServiceEndPoint) {
        EndpointImpl endpoint = new EndpointImpl(bus, bookServiceEndPoint);
        endpoint.publish("http://localhost:8091/soap-api/service/books");
        return endpoint;
    }

}
