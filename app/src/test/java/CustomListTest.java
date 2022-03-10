import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void testHasCity() {
        //CityList cityList = mockCityList();
        City city = new City("Kamloops", "BC");
        assertFalse(list.hasCity(city));
        list.addCity(city);
        assertTrue(list.hasCity(city));
        assertFalse(list.hasCity(new City("Hamilton", "Ontario")));
    }

    @Test
    public void testDeleteCity() {
        City city = new City("Calgs", "Alberta");
        list.addCity(city);
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }
//
//    @Test
//    public void testCountCities()
//    {
//        City city = new City("Winnipeg", "Manitoba");
//        assertEquals(0, list.countCities());
//        list.addCity(city);
//        assertEquals(1, list.countCities());
//        list.addCity(new City("ded reer", "berta"));
//        assertEquals(2, list.countCities());
//        list.deleteCity(city);
//        assertEquals(1, list.countCities());
//    }
}
