package vip.dulaogou.utils;

import java.util.ArrayList;
import java.util.List;

public class MyPageHelper {
    private List originalList;
    private int totalPage;
    private int totalRecord;
    private int recordPerPage;
    private List dividedList;

    public List getOriginalList() {
        return originalList;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public int getRecordPerPage() {
        return recordPerPage;
    }

    public MyPageHelper(List originalList, int recordPerPage){
        this.originalList = originalList;
        this.recordPerPage = recordPerPage;
        if(recordPerPage <= 0){
            recordPerPage = 1;
        }
        if(recordPerPage > originalList.size()){
            recordPerPage = originalList.size();
        }
        this.totalRecord = originalList.size();
        this.totalPage = totalRecord / recordPerPage +
                (totalRecord % recordPerPage == 0 ? 0 : 1);
    }

    public List getDividedList(){
        dividedList = new ArrayList();
        for(int i = 0; i < totalPage; i++){
            List temp = new ArrayList();
            int start = i * recordPerPage;
            int end = 0;
            if(i != totalPage - 1){
                end = start + recordPerPage;
            }else{
                end = originalList.size();
            }
            for(int j = start; j < end; j++){
                temp.add(originalList.get(j));
            }
            dividedList.add(temp);
        }

        return dividedList;
    }

}
