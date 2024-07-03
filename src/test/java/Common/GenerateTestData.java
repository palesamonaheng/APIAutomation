package Common;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class GenerateTestData {
    static Faker faker = new Faker();

    public static String weatherStationName = faker.weather().description();

    //example generation of fake data
    @Test
    public void test(){
        String fullname = faker.name().fullName();
        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();
        String username = faker.name().username();
        String password = faker.internet().password();
        String phonenumber = faker.phoneNumber().cellPhone();
        String email = faker.internet().safeEmailAddress();
        String weatherstationname = faker.name().username();

        System.out.println(faker.name().fullName());
        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.name().username());
        System.out.println(faker.internet().password());
        System.out.println(faker.phoneNumber().cellPhone());
        System.out.println(faker.internet().safeEmailAddress());
        System.out.println(faker.weather().description());
    }
}
