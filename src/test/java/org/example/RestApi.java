package org.example;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RestApi {
    public static void main(String[] args) {

        }

        @BeforeClass
        public void setup(){

            RestAssured.baseURI ="https://gorest.co.in/";
        }

        @Test
    public void testGetDetails(){

        //Send GET request to the user details endpoint
            Response response = RestAssured
                    .given()
                    .when()
                    .get("public/v2/posts"); // endpoint

            //Validating status code 200ok
            int statusCode = response.getStatusCode();
            Assert.assertEquals(statusCode,200);

            // Validating name field in the response
            String name = response.jsonPath().getString("name");
            Assert.assertEquals(name,"Rita Menon");
            System.out.println(name);

            //Validating id field is of type integer
//           Integer id = response.jsonPath().getInt("7651796");
//           Assert.assertTrue(id instanceof Integer);


        }

    }

