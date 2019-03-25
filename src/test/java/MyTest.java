import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {

    @Test
    public void testFunction(){
        Kata kata = new Kata();
        String result = kata.expandedForm(22 );
        assertEquals("20 + 2",result );
    }


    @Test
    public void testFunction2(){
        Kata kata = new Kata();
        String result = kata.expandedForm(222 );
        assertEquals("200 + 20 + 2",result );
    }

    @Test
    public void testFunction3(){
        Kata kata = new Kata();
        String result = kata.expandedForm(2202 );
        assertEquals("2000 + 200 + 2",result );
    }

}
