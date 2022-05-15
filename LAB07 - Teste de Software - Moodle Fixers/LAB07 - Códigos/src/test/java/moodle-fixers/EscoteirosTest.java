package moodle-fixers;

import moodle-fixers.Escoteiros;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EscoteirosTest {

    public EscoteirosTest() {

    }

    Escoteiros objectEscoteiro = new Escoteiros();

    @Test
    public void testSubsidioSocio() {
        assertEquals(25, objectEscoteiro.subsidioSoc(1));

        assertEquals(35, objectEscoteiro.subsidioSoc(2));

        assertEquals(50, objectEscoteiro.subsidioSoc(3));
    }

    @Test
    public void testSubsidioPosto() {
        assertEquals(10, objectEscoteiro.subsidioPosto("LOBO"));

        assertEquals(15, objectEscoteiro.subsidioPosto("URSO"));

        assertEquals(20, objectEscoteiro.subsidioPosto("LEÃO"));

        assertEquals(0, objectEscoteiro.subsidioPosto("LOBINHO"));
    }
}
