package school.lesson10;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostmanTest {


    private final String REQUEST_BODY = "This is expected to be sent back as part of response body.";

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test(testName = "Проверка метода GET")
    public void testGetRequest(){
        given()
                .param("foo1", "bar1")
                .param("foo2", "bar2")
        .when()
                .get("/get")
        .then()
                .statusCode(HttpStatus.SC_OK)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));

    }

    @Test (testName = "Проверка POST запроса")
    public void testPostRawText(){
        String requestBody = "value";

        given()
                .body(requestBody)
                .contentType(ContentType.TEXT)
        .when()
                .post("/post")
        .then()
                .statusCode(HttpStatus.SC_OK)
                .body("data", equalTo(requestBody));
    }

    @Test(testName = "Проверка метода POST c параметрами")
    public void testPostFromData(){
        given()
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
        .when()
                .post("/post")
        .then()
                .statusCode(HttpStatus.SC_OK)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));

    }

    @Test(testName = "Проверка метода PUT")
    public void testPutRequest(){
        given()
                .body(REQUEST_BODY)
                .contentType(ContentType.TEXT)
        .when()
                .put("/put")
        .then()
                .statusCode(HttpStatus.SC_OK)
                .body("data", equalTo(REQUEST_BODY));
    }

    @Test(testName = "Проверка метода PATCH")
    public void testPatchRequest(){
        given()
                .body(REQUEST_BODY)
                .contentType(ContentType.TEXT)
        .when()
                .patch("/patch")
        .then()
                .statusCode(HttpStatus.SC_OK)
                .body("data", equalTo(REQUEST_BODY));
    }

    @Test(testName = "Проверка метода DELETE")
    public void testDeleteRequest(){
        given()
                .body(REQUEST_BODY)
                .contentType(ContentType.TEXT)
        .when()
                .delete("/delete")
        .then()
                .statusCode(HttpStatus.SC_OK)
                .body("data", equalTo(REQUEST_BODY));
    }

}


