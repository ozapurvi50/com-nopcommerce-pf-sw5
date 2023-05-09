package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

        @DataProvider(name = "Register details")
        public Object[][] getData(){
            Object[][]data = new Object[][]{
                    {"Pinks","Shah", "United Kingdom", "London", "10 St Johns Parade" , "HA12 4ES", "79485647362"},

            };
            return data;
        }

    }

