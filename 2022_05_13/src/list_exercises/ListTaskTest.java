package list_exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListTaskTest {

    @Test
    void testListWithoutNamesLength4() {
        List<String> actual = Arrays.asList("Ivan", "Maryia", "Stepan", "John", "Amalia");
        List<String> expected = Arrays.asList("Maryia", "Stepan", "Amalia");
        assertEquals(expected,ListTask.listWithoutNamesLength4(actual));

    }
    @Test
    void testYesOrNo() {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(5,2,3,0);
        List<String> expected = Arrays.asList("No","Yes","Yes","No");
        assertEquals(expected,ListTask.YesOrNo(list1,list2));

    }

    @Test
    void testReversList() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        List<Integer> expected = Arrays.asList(4,3,2,1);
        assertEquals(expected,ListTask.ReversList(list));

    }
}