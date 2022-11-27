package stepDefinitions;

import org.junit.Test;
import utilities.DataBaseUtility;

public class US010_DbStepDef {
    @Test
    public void US010DbTest() {
        DataBaseUtility.createConnection();
    }
}
