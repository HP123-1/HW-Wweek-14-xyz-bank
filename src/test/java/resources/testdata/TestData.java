package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

        @DataProvider(name = "credentials")
        public Object[][] getData(){
            return new Object[][]{
                    {"Oscar","Ramlal","London"},
                    {"Raj","Naam","Harrow"},
                    {"Rob","Kulca","London"},
                    {"Mo","Taru","Harrow"}

            };
        }
    }

