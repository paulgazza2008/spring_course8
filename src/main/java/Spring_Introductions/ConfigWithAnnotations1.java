package Spring_Introductions;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext3.xml");
        Person person = context.getBean("personBean",Person.class);

               person.callYourPet();

        //Cat myCat = context.getBean("catBean",Cat.class);
       // myCat.sound();
        context.close();
    }
}
