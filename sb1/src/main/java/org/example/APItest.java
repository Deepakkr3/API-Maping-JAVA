package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class APItest {
   @Autowired
    Car helo;
    @GetMapping("api/app")  //endpoint
    public String meth()
    {
        return "deepak";
    }
    @GetMapping("api/car")
    public  String mycar()
    {
        return helo.getColor();
    }
    @PutMapping ("api/put")
    public Car putmeth()
    {
        helo.setColor("yello");
       return helo;

    }
    @GetMapping("my/name")
    public String myn()
    {
        return "my name is deepak kumar";
    }

    @GetMapping("app/towice/{x}")
    public int twoiseOf(@PathVariable  int x)
    {
        return 2*x;
    }
    @GetMapping("api/sum/{num1}/and/{num2}")
    public  int sumof2(@PathVariable int num1,@PathVariable int num2)
    {
        return num1+num2;
    }
}
