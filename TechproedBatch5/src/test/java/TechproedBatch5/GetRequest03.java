package TechproedBatch5;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.*;

public class GetRequest03 {
/*
Positive Scenario:
When Asagidaki Endpoint'e bir Get request yollayalim
https://restful-booker.herokuapp.com/booking/7
And Accept type "application/json" mi?
Then
HTTP Status Code 200
And Response format "application/json"
And firstname "susan"
And lastname "ericson"
And checkin date"2018-03-19"
And check out date"2019-02-17"
 */

 @Test
 public void get02(){
     Response response=given().accept("application/json").when().get("https://restful-booker.herokuapp.com/booking/7");
     response.prettyPrint();

     response.then().assertThat().statusCode(200);

     assertEquals(200,response.getStatusCode());

     response.then().statusCode(200).
             contentType("application/json").
             body("firstname", Matchers.equalTo("Eric")).
             body("lastname", Matchers.equalTo("Brown")).
             body("totalprice", Matchers.equalTo(498)).
             body("depositpaid",Matchers.equalTo(false)).
             body("checkin", Matchers.equalTo("2019-10-17")).
             body("checkout",Matchers.equalTo("2020-09-14"));
            // body("additionalneeds",Matchers.equalTo("Breakfast"));





 }





}
