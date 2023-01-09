package leetcode;

/*
    You are given an array of n strings strs, all of the same length.

    The strings can be arranged such that there is one on each line, making a grid.
    For example, strs = ["abc", "bce", "cae"] can be arranged as:
    abc
    bce
    cae

    You want to delete the columns that are not sorted lexicographically.
    In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted
    while column 1 ('b', 'c', 'a') is not, so you would delete column 1.

    Return the number of columns that you will delete.

    Example 1.

    Input: strs = ["cba","daf","ghi"]
    Output: 1
    Explanation: The grid looks as follows:
        cba
        daf
        ghi
    Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.
*/

public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int columnsDeleted = 0;
        final int ARRAY_LENGTH = strs.length;
        final int STR_LENGTH = strs[0].length();

        for(int i = 0; i < STR_LENGTH; i++){
            if(!isSorted(strs, i, ARRAY_LENGTH)){
                columnsDeleted++;
            }
        }
        return columnsDeleted;
    }

    public boolean isSorted(String[] strs, int column, int length){
        for(int i = 1; i < length; i++ ){
            if(strs[i].charAt(column) < strs[i-1].charAt(column)) {
                return false;
            }
        }
        return true;
    }
}
