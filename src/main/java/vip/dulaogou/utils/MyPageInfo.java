package vip.dulaogou.utils;

import java.util.List;

public class MyPageInfo {
    private MyPageHelper myPageHelper;
    private int index;
    private List list;
    private int totalPage;
    private int totalRecord;
    private boolean hasNext = true;
    private boolean hasPrevious = true;
    private int nextPage;
    private int previousPage;

    public MyPageInfo(MyPageHelper myPageHelper, int index){
        this.myPageHelper = myPageHelper;
        this.index = index;
        if(index <= 0){
            index = 1;
        }
        if(index > myPageHelper.getTotalPage()){
            index = myPageHelper.getTotalPage();
        }
        this.totalPage = myPageHelper.getTotalPage();
        this.totalRecord = myPageHelper.getTotalRecord();
        this.previousPage = index - 1;
        this.nextPage = index + 1;
        if(index <= 1){
            hasPrevious = false;
            previousPage = 1;
        }
        if(index >= totalPage){
            hasNext = false;
            nextPage = totalPage;
        }
    }

    public List getList(){
        return (List) this.myPageHelper.getDividedList().get(this.index - 1);
    }

    public int getIndex() {
        return index;
    }

    public MyPageHelper getMyPageHelper() {
        return myPageHelper;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public boolean isHasPrevious() {
        return hasPrevious;
    }

    public int getNextPage() {
        return nextPage;
    }

    public int getPreviousPage() {
        return previousPage;
    }
}
