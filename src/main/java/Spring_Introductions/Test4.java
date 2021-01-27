package Spring_Introductions;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext2.xml");

        Dog myDog = context.getBean("myPet",Dog.class);
        myDog.setName("Belka");
        Dog yourDog = context.getBean("myPet",Dog.class);
        yourDog.setName("strelka");
        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());
        context.close();


    }
}
