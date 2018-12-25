package com.gzeinnumer.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ExpandableListView) findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader,listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("M");
        listDataHeader.add("Fadli");
        listDataHeader.add("Zein");
        listDataHeader.add("GZeinNumer");

        List<String> m = new ArrayList<>();
        m.add("Muhammad");

        List<String> fadli = new ArrayList<>();
        fadli.add("Anugrah");

        List<String> zein = new ArrayList<>();
        zein.add("Dari");
        zein.add("Keluarga");
        zein.add("Zein");

        List<String> gzeinnumer = new ArrayList<>();
        gzeinnumer.add("GZeinNumer");
        gzeinnumer.add("GZN17");
        gzeinnumer.add("Karfilah Aini");


        listHash.put(listDataHeader.get(0),m);
        listHash.put(listDataHeader.get(1),fadli);
        listHash.put(listDataHeader.get(2),zein);
        listHash.put(listDataHeader.get(3),gzeinnumer);



    }
}
