package sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import payloads.AddNewPostPayload;

public class SampleTest extends TestBase {

    @Test(dataProvider = "postDataProvider")
    public void addNewPost(AddNewPostPayload addNewPostPayload) {
        requestHelper.addNewPost(addNewPostPayload);

    }

    @DataProvider
    public Object[][] postDataProvider() {
        AddNewPostPayload addNewPostPayload = testDataReader.getAddNewPostPayload();

        return new Object[][]{
                new Object[]{
                        addNewPostPayload
                }
        };
    }
}
