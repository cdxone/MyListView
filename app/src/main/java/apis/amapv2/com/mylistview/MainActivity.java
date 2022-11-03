package apis.amapv2.com.mylistview;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.bean.ItemObject;
import apis.amapv2.com.listviewlibrary.view.MyListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListView lv = findViewById(R.id.mylistview);

        ArrayList<ItemObject> data = new ArrayList<>();
        data.add(new ItemObject("测试",Test1Activity.class));

        lv.setData(data);
    }
}
