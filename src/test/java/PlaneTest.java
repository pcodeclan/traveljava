import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest{

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void testGetCapacity() {
        assertEquals(20, plane.getCapacity());
    }

    @Test
    public void testGetTotalWeight() {
        assertEquals(5000, plane.getTotalWeight(), 0.01);
    }

}