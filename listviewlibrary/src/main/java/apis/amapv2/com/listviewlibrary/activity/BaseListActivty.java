package apis.amapv2.com.listviewlibrary.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.R;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;
import apis.amapv2.com.listviewlibrary.view.MyListView;

public abstract class BaseListActivty extends AppCompatActivity {

    protected Context mContext;//上下文
    protected TextView mTvTitle;//头部TextView:用于显示标题
    protected MyListView mMyListView;//列表VIew

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_list_activty);

        initParamsAndValues();

        initView();

        initData();

    }

    private void initParamsAndValues() {
        mContext = this;
    }

    private void initView() {
        mTvTitle = findViewById(R.id.tv_title);
        mMyListView = findViewById(R.id.mylistview);
    }

    protected void initData(){
        ArrayList<ItemObject> data = new ArrayList<>();
        addData(data);
        mMyListView.setData(data);
    }

    protected abstract void addData(ArrayList<ItemObject> data);

}
