package Tests;

import com.google.gson.*;

public class LearnJSON {
    public static void main(String[] args) {
        WeatherObject weather = new WeatherObject("SF_TEST003", "Johannesburg", 37.76f, -122.43f, 150);
        AreaObject area = new AreaObject(weather.name(), weather.latitude(), weather.longitude(),314887, weather);

        System.out.println("JSON");
        System.out.println("""
                What is JSON?:
                               \s
                JSON stands for JavaScript Object Notation.
                It is a lightweight data-interchange format that is easy for humans to read and write and easy for machines to parse and generate.
                JSON is often used to transmit data between a server and a web application, but it's also used for configuration files and other data storage needs.
                JSON Syntax:
                               \s
                JSON data is represented as key/value pairs.
                Data is separated by commas.
                Curly braces {} hold objects.
                Square brackets [] hold arrays.
                Keys and string values are enclosed in double quotes " ".
                Keys are strings.
                Values can be strings, numbers, objects, arrays, booleans, or null.
               \s
                Example:
                {
                  "name": "John",
                  "age": 30,
                  "isStudent": false,
                  "address": {
                    "city": "New York",
                    "zipcode": "10001"
                  },
                  "languages": ["Java", "JavaScript", "Python"]
                }
               \s
                Key Concepts:
                               \s
                Objects: A collection of key/value pairs enclosed in curly braces.
                Arrays: An ordered list of values enclosed in square brackets.
                Strings: A sequence of characters enclosed in double quotes.
                Numbers: Integer or floating-point values.
                Boolean: Represents true or false.
                Null: Represents an empty value.
               \s
                Common Use Cases:            \s
                API Communication - JSON is widely used in web APIs for sending and receiving data between the client and the server.
                Configuration Files - Many applications use JSON for configuration settings.
                Data Storage - JSON files are often used to store and exchange structured data.
               \s""");

        System.out.printf("%nSerializing and Deserializing data%n");

        var simplePayload = new Gson().toJson(weather);
        var parsedSimpleData = new Gson().fromJson(simplePayload, WeatherObject.class);
        System.out.printf("%nSimple JSON data%n%s%n", simplePayload);
        System.out.printf("%n%nConverted from Simple JSON%n%s%n", parsedSimpleData);

        var complexPayload = new Gson().toJson(area);
        var parsedComplexData = new Gson().fromJson(complexPayload, AreaObject.class);
        System.out.printf("%nComplex JSON%n%s%n", complexPayload);
        System.out.printf("""
                        
                        Converted from Complex JSON expanded
                        {
                            "name": "%s",
                            "latitude": "%.2f",
                            "longitude": "%.2f",
                            "population": "%s",
                            "weather": {
                                "external_id": "%s",
                                "name": "%s",
                                "latitude": "%.2f",
                                "longitude": "%.2f",
                                "altitude": "%d"
                            }
                        }
                        """,
                parsedComplexData.getName(),
                parsedComplexData.getLatitude(),
                parsedComplexData.getLongitude(),
                parsedComplexData.getPopulation(),
                parsedComplexData.getWeatherObject().external_id(),
                parsedComplexData.getWeatherObject().name(),
                parsedComplexData.getWeatherObject().latitude(),
                parsedComplexData.getWeatherObject().longitude(),
                parsedComplexData.getWeatherObject().altitude());

        var personPayload = new JsonObject();
        personPayload.addProperty("id", 2);
        personPayload.addProperty("name", "Thomas");
        personPayload.addProperty("name", "Simpson");
        personPayload.addProperty("gender", "Male");
        System.out.printf("%n%nSimple JSON data");
        System.out.printf("%n%s", personPayload);

        System.out.printf("%n%nMap person data");
        var jsonMap = personPayload.asMap();
        System.out.printf("%n%s", jsonMap);
    }
}

record WeatherObject(String external_id, String name, float latitude, float longitude, int altitude) { }

class AreaObject {
    private final String name;
    private final float latitude, longitude;
    private final int population;
    private final WeatherObject weatherObject;

    public AreaObject(String name, float latitude, float longitude, int population, WeatherObject weatherObject){
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.population = population;
        this.weatherObject = weatherObject;
    }

    public WeatherObject getWeatherObject() {
        return weatherObject;
    }

    public String getName() {
        return name;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public int getPopulation() {
        return population;
    }
}

/*
The choice between using a record and a class in Java depends on your specific use case and requirements.

Here are some considerations to help you decide:

Simplicity and Conciseness:
Records: Records are more concise and provide a simpler syntax for defining data-carrying classes. They automatically generate constructors, accessors, equals(), hashCode(), and toString() methods, reducing boilerplate code.
Classes: Classes provide more flexibility and can encapsulate behavior along with state. They require explicit definition of constructors, accessors, and other methods.


Immutability:
Records: Records are inherently immutable, as their state cannot be modified once created (unless you use reflection, which is discouraged).
Classes: Classes can be mutable or immutable based on how they are designed.


Inheritance:
Records: Records cannot extend other classes and cannot have non-static fields. They are essentially final by default.
Classes: Classes support inheritance and can extend other classes or implement interfaces.


Use Cases:
Records are well-suited for representing immutable data transfer objects (DTOs), data structures, and simple data containers where behavior is not a primary concern.
Classes are more appropriate when you need to encapsulate behavior along with state, support inheritance, or create mutable objects.


Java Version Compatibility:
Records are available starting from Java 14 (preview feature) and are fully supported from Java 16 onwards.
Classes are available in all versions of Java and are the traditional way of defining custom types.


In summary, if your goal is to define simple, immutable data holders without behavior, records can offer a more concise and readable solution.
However, if you need more control over your class design, support for inheritance, or encapsulation of behavior, traditional classes might be a better choice.
It's also worth noting that you can mix and match records and classes within your application based on specific requirements.
 */