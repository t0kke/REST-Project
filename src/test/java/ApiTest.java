import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {
    @Test
    void getBooks() {
        given()
                .baseUri("https://testqa.kai.ru").log().all()
                .when().get("/api/book/books.php")
                .then().log().all().assertThat().statusCode(200);
    }
}
