package Common;
import com.github.javafaker.Faker;

public class GenerateTestData {
    static Faker faker = new  Faker();
    public static String stationName= String.valueOf(faker.weather().description());
   // public static Float latitudeValue = Float.valueOf(faker.weather().equals(2).floatValue();

}
