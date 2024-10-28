import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    Dog perro;

    @Before
    public void setUp() throws Exception {
         perro = new Dog();
    }

    @Test
    public void testToString() {
        perro.display();
        String esperado = perro.toString();
        String obtenido = "૮₍ • ᴥ • ₎ა";
        assertEquals(obtenido,esperado);
    }
}