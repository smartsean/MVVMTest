package com.sean.mvvmtest.recycler_view;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sean
 */
public class RecyclerViewModel {
    public List<String> getList(int count) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add("第  " + i + "  个");
        }
        return list;

    }
}
