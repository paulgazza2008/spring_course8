package Spring_Introductions;


import org.springframework.stereotype.Component;

@Component("catBean")

public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void sound() {
        System.out.println("mweo mweo");

    }
}
