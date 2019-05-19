package sample;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import requests.RequestHelper;
import utils.TestDataReader;
import utils.TestUtils;

import javax.xml.bind.JAXBException;

public class TestBase {
    protected TestDataReader testDataReader;
    protected RequestSpecification requestSpecification;
    protected RequestHelper requestHelper;

    @Parameters({"pathToFile", "baseUri"})
    @BeforeClass(alwaysRun = true)
    public void setUp(String pathToFile, String baseUri) throws JAXBException {
        testDataReader = new TestUtils<>(TestDataReader.class).getTestDataFromFile(pathToFile);

        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(baseUri)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

        requestHelper = new RequestHelper(requestSpecification);
    }
}
