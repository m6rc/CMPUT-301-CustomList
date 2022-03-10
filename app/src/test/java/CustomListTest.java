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
    void testHasCity() {
        //CityList cityList = mockCityList();
        City city = new City("Kamloops", "BC");
        assertFalse(list.hasCity(city));
        list.add(city);
        assertTrue(list.hasCity(city));
        assertFalse(list.hasCity(new City("Hamilton", "Ontario")));
    }
}
