package test;

import leetcode.DeleteColumnsToMakeSorted;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeleteColumnsToMakeSortedTest {
    DeleteColumnsToMakeSorted test = new DeleteColumnsToMakeSorted();

    @Test
    public void itShouldDeleteColumn3(){
        String[] strs = {"zyx","wvu","tsr"};
        assertEquals(3, test.minDeletionSize(strs));
    }

    @Test
    public void itShouldDeleteColumn1(){
        String[] strs = {"cba","daf","ghi"};
        assertEquals(1, test.minDeletionSize(strs));
    }

    @Test
    public void itShouldNotDeleteColumn(){
        String[] strs = {"a","b"};
        assertEquals(0, test.minDeletionSize(strs));
    }
}
