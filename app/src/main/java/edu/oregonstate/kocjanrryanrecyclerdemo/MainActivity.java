package edu.oregonstate.kocjanrryanrecyclerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<Item> mItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLayoutManager);

        mItems = new ArrayList<>();
        for(int i=0;i<50;i++){
            Item item = new Item("heading " + i,"description " + i+1);
           // item.setHeader("heading " + i);
           // item.setDescription("description " + i+1);
            mItems.add(item);
        }

        mAdapter = new MyAdapter(mItems, this);
        mRecyclerView.setAdapter(mAdapter);
    }
}
