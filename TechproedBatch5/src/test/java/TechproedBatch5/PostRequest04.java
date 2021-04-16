package TechproedBatch5;

public class PostRequest04 extends TestBase{
       /*
    *Post Scenario
    Content Type Json olsun
    When
    POST request yolladigimda
             1)https://restful-booker.herokuapp.com/booking
            2)Request body
                "firstname": "susan",
                        "lastname ": "ericson",
                        "totalprice": "123",
                        "depositpaid": "true",
                        "bookingdates": {
                         "checkin": "2019-02-17"
                         "checkout":"2020-05-05"
                         },
                           "addionalneeds":"Wifi"
                            }
                        Then
                        Status Code 200 olmali
                        Response Body,Request Body ile ayni oldugunu verify ediniz.

        * POJO:Plain Old Java Object
          POJO:Json formatindaki data'yi Class lara cevirme islemi denir.
          http://www.jsonschema2pojo.org/ adresine gidilir.
          Data parantezden diger paranteze kopyalanip siteye tasinir.
          sol tarafta class name -->Booking  target-->Java source type--->Json olacak
          daha sonra preview ile class olusturulacak.
          Keylerin hepsine variable olarak tanimlandi.


* */

}
