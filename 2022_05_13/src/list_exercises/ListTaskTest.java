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
        List<Integer> actual = Arrays.asList(1,2,3,4);
        List<Integer> expected = Arrays.asList(4,3,2,1);
        assertEquals(expected,ListTask.ReversList(actual));

    }
    @Test
    void testReversListEmpty() {
        List<Integer> actual = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected,ListTask.ReversList(actual));

    }
    @Test
    void testJoinTwoLists_one_element() {
        assertEquals(Arrays.asList(1,2), ListTask.joinTwoLists(Arrays.asList(1),Arrays.asList(2)));
    }
    @Test
    void testJoinTwoLists_many_element() {
        assertEquals(Arrays.asList(1,2,3,3,4,5), ListTask.joinTwoLists(Arrays.asList(1,2,3),Arrays.asList(3,4,5)));
    }
    @Test
    void testWithoutElementsMoreThan_empty() {
        assertEquals(Arrays.asList(), ListTask.withoutElementsMoreThan(Arrays.asList(),4));
    }
    @Test
    void testWithoutElementsMoreThan_no_such_element() {
        assertEquals(Arrays.asList(), ListTask.withoutElementsMoreThan(Arrays.asList(3,1,8,9),0));

    }
    @Test
    void testWithoutElementsMoreThan() {
        assertEquals(Arrays.asList(3,1,8), ListTask.withoutElementsMoreThan(Arrays.asList(3,1,8,9),8));

    }
    @Test
    public void shortest_test_one_element(){
        assertEquals("a",ListTask.shortestOrLongest(Arrays.asList("a")));
    }
    @Test
    public void shortest_test_shortestFirst(){
        assertEquals("a",ListTask.shortestOrLongest(Arrays.asList("bb","a","ff","ddd")));
    }
    @Test
    public void shortest_test_shortestFirst_eq(){
        assertEquals("bb",ListTask.shortestOrLongest(Arrays.asList("bb","aa","ff","ddd")));
    }
    @Test
    public void shortest_test_longestFirst_eq(){
        assertEquals("ddd",ListTask.shortestOrLongest(Arrays.asList("ddd","aa","ff","bb")));
    }


}