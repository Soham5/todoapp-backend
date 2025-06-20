package com.sohamsur.todo.service;

import com.sohamsur.todo.models.DailyItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DailyActivityService {

    List<DailyItem> dailyItemList = new ArrayList<DailyItem>();

    /***
     * Add To-Do list
     * @param item
     */
    public List<DailyItem> addToDoList(DailyItem item) {
        dailyItemList.add(item);
        return dailyItemList;
    }


    /***
     * Reset To-do List
     */
    public List<DailyItem> resetToDoList() {
        for(DailyItem item:dailyItemList)
            item.setIsCompleted(false);

        return dailyItemList;
    }

    /***
     * Delete daily task
     * @param index
     * @return
     */
    public List<DailyItem> deleteToDoList(int index) {
        dailyItemList.remove(index);

        return dailyItemList;
    }

    public List<DailyItem> getToDoList() {
        return dailyItemList;
    }
}
