package uk.co.tommywebdesign.recycleviewexample.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tommy on 16/10/16.
 */

public class AppData {

    private static final String[] titles = {"Chicken","Beef","Pork"};
    private static final int[] icons={android.R.drawable.ic_media_play,android.R.drawable.ic_delete,android.R.drawable.ic_dialog_email};

    public static List<ListItem>getListItem(){
        List<ListItem> data = new ArrayList<>();

        for(int x=0;x<4;x++){
            for(int i=0;i<titles.length&&i<icons.length;i++){
                ListItem item = new ListItem();
                item.setImageResId(icons[i]);
                item.setTitle(titles[i]);
                data.add(item);



            }

        }

            return data;

    }

}
