import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class SetTest {

    private MySet set;

    @BeforeEach
    public void initializer(){
        set = new MySet();
    }

    @Test
    public void MySetIsEmptyTest(){
        assertFalse(set.mySetIsEmpty());
    }

    @Test
    public void addElementToTheSet_elementIsAddedTest(){
        assertFalse(set.mySetIsEmpty());

    }




}
