import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeExamTest extends TestCase {

    @Test
    public void testAll() {
        assertTrue(CodeExam.testTrues());
        assertTrue(CodeExam.isAnagram("Silent", "Listen"));
        assertTrue(CodeExam.isAnagram("Triangle", "Integral"));
        assertTrue(CodeExam.isAnagram("Dormitory", "Dirty room"));
        assertTrue(CodeExam.isAnagram("School master", "The classroom"));
        assertTrue(CodeExam.isAnagram("Conversation", "Voices rant on"));

        assertEquals(CodeExam.getKey("test123b"), "test123");
        //assertTrue(CodeExam.isAnagram("Conversation", "nana"));
        assertEquals(CodeExam.solutionA(new String[]{"test1a", "test2", "test1b", "test1c", "test3"}, new String[]{"Wrong answer", "OK", "Runtime error", "OK", "Time limit exceeded"}),33);
        assertEquals(CodeExam.solutionB(new int[]{2, 1, 3}, 2), 3);
        assertEquals(CodeExam.solutionB(new int[]{0, 4, 3, -1}, 2), 2);

        List<Integer> intList = Arrays.asList(1,3,3,2,4);
        assertEquals(3, CodeExam.minDiff(intList));
        intList = Arrays.asList(5,1,3,7,3);
        assertEquals(6, CodeExam.minDiff(intList));

        intList = Arrays.asList(8,5,4,8,4);
        assertEquals(3,CodeExam.maxTickets(intList));

        intList = Arrays.asList(4,13,2,3);
        assertEquals(3,CodeExam.maxTickets(intList));
    }
}
