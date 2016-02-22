package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class GreetingController {
    @RequestMapping("/greeting")
     public ArrayList greeting(){
      Greeting g1 = new Greeting(1,"project");
      Greeting g2 = new Greeting(2,"work");
      Greeting g3 = new Greeting(3,"hiii");
      ArrayList al=new ArrayList();
      al.add(g1);
      al.add(g2);
      al.add(g3);
      return al;
      
   /* private static final Object[] template =[{id:1},{id:2}];
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Object greeting(@RequestParam(value="name", defaultValue="priya") String name) {
        Greeting result = new Greeting(counter.incrementAndGet(),
                            String.format(template, name));*/
      
           
                        
                     
    }
}
