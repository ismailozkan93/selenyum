package TechproedBatch5;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest05 {

     /*
       2)When I send a GET request to REST API URL
         https://restful-booker.herokuapp.com/booking/5
         Then HTTP Status Code should be 200
         And response content type is “application/JSON”
         And “firstname” should be “Jim”,
         And “totalprice” should be 602
         And “checkin” should be “2015-06-12”
     */
    @Test
    public void get01(){
    Response response=given().
    accept("application/json").
            when().
            get("https://restful-booker.herokuapp.com/booking/5");
        response.prettyPrint();

     response.
             then().
             assertThat().
             statusCode(200).contentType(ContentType.JSON).
            body("firstname", Matchers.equalTo("Jim"),
                "totalprice",Matchers.equalTo(179),
                "bookingdates.checkin",Matchers.equalTo("2016-06-07"));






    }

}