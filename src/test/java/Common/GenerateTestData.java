package Common;
import com.github.javafaker.Faker;

public class GenerateTestData {
    static Faker faker = new  Faker();
    public static String stationName= String.valueOf(faker.weather().description());
    public static String external_id_name = String.valueOf(faker.name().title());

}
