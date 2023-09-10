package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ObjectMap {
    public ObjectMap() {
    }
    @Primary
    @Bean
    public Car meth()
    {   System.out.print(" new object of car in obj !!!!!!");
        return new Car("dont lnow $$$$$$$$$$");
    }
   @Bean
    public Car meth2()
    {
        return new Car("pinc");
    }
    @Bean

    public Car meth3()
    {
        return new Car("black");
    }
}
