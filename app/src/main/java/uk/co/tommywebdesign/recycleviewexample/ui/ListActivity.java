package uk.co.tommywebdesign.recycleviewexample.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

import uk.co.tommywebdesign.recycleviewexample.R;
import uk.co.tommywebdesign.recycleviewexample.adapter.AppAdapter;
import uk.co.tommywebdesign.recycleviewexample.model.AppData;
import uk.co.tommywebdesign.recycleviewexample.model.ListItem;

public class ListActivity extends AppCompatActivity implements AppAdapter.ItemClickCallback {

    private RecyclerView cycleView;
    private AppAdapter adapter;
    private ArrayList listData;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listData = (ArrayList)AppData.getListItem();



        cycleView =(RecyclerView)findViewById(R.id.app_recycle_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
       // linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //linearLayoutManager.canScrollVertically();
        cycleView.setLayoutManager( linearLayoutManager);
        adapter = new AppAdapter(listData,this);
        cycleView.setAdapter(adapter);
        adapter.setItemClickCallback(this);


    }

    @Override
    public void onItemClick(int p) {

        ListItem item = (ListItem)listData.get(p);
        Toast.makeText(getApplicationContext(),item.getTitle().toString(),Toast.LENGTH_SHORT).show();


    }
}
