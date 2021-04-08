package edu.eci.arsw.saenz_arsw_t2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.apache.http.HttpStatus;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.ArrayList;
import java.util.List;

public class UnirestTest {

    @Test
    public void shouldFetchAllCitiesWeatherData() throws UnirestException {
        List<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Berlin");

        for (String city : cities) {
            String url = String.format("http://api.openweathermap.org/data/2.5/weather?q=%s&appid=00e6056a80771fabd8617694dc22cf23", city);
            HttpResponse<JsonNode> response = Unirest
                    .get(url)
                    .asJson();

            assertNotNull(response.getBody());
            assertEquals((int) HttpStatus.SC_OK, response.getStatus());
        }

    }

}

