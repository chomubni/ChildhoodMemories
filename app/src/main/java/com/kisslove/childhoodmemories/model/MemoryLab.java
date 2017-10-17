package com.kisslove.childhoodmemories.model;

import com.kisslove.childhoodmemories.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ivan on 17.10.17.
 */

public class MemoryLab {
    public List<Memory> getMemoryList() {
        return memoryList;
    }

    List<Memory> memoryList;

    public MemoryLab(){
        memoryList = new ArrayList<>();
        for(int i=0;i<50;i++){
            memoryList.add(new Memory("First", R.drawable.child, new Date()));
        }
    }
}
