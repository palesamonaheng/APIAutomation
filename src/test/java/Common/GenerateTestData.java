package Common;
import com.github.javafaker.Faker;

public class GenerateTestData {
    static Faker faker = new  Faker();
    public static String stationName= String.valueOf(faker.weather().description());
    public static String external_id_name = String.valueOf(faker.name().title());
  //  public static String latitudeValue = String.valueOf(faker.address().latitude());
 //   public static float latval = Float.parseFloat(latitudeValue);
  //  public static String logituteValue = String.valueOf(faker.address().longitude());
   // public static float longval = Float.parseFloat(logituteValue);

}
