# MyPageHelper
A page divider which can help developers divide arraylist


---
package org.example;
import org.junit.Test;
import vip.dulaogou.utils.MyPageHelper;
import vip.dulaogou.utils.MyPageInfo;
import java.util.ArrayList;
import java.util.List;
public class MyTest {
    @Test
    public void test01(){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 17; i++){
            list.add(i);
        }

        MyPageHelper myPageHelper = new MyPageHelper(list, 3);
        System.out.println("originalList = " + myPageHelper.getOriginalList());
        System.out.println("totalRecord = " + myPageHelper.getTotalRecord());
        System.out.println("totalPage = " + myPageHelper.getTotalPage());
        System.out.println("recordPerPage = " + myPageHelper.getRecordPerPage());
        System.out.println("devidedList = " + myPageHelper.getDividedList());
        System.out.println("========================================");

        MyPageInfo myPageInfo = new MyPageInfo(myPageHelper, 6);
        System.out.println("list = " + myPageInfo.getList());
        System.out.println("index = " + myPageInfo.getIndex());
        System.out.println("myPageHelper = " + myPageInfo.getMyPageHelper());
        System.out.println("totalPage = " + myPageInfo.getTotalPage());
        System.out.println("totalRecord = " + myPageInfo.getTotalRecord());
        System.out.println("isHasNext = " + myPageInfo.isHasNext());
        System.out.println("nextPage = " + myPageInfo.getNextPage());
        System.out.println("isHasPrevious = " + myPageInfo.isHasPrevious());
        System.out.println("previousPage = " + myPageInfo.getPreviousPage());
    }
}
