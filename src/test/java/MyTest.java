import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {

    @Test
    public void testFunction(){
        Kata kata = new Kata();
        String result = kata.expandedForm(22 );
        assertEquals("20 + 2",result );

    }


}
