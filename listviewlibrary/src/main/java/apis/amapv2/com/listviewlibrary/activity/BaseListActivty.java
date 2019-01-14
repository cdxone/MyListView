package apis.amapv2.com.listviewlibrary.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import apis.amapv2.com.listviewlibrary.R;
import apis.amapv2.com.listviewlibrary.view.MyListView;

public class BaseListActivty extends AppCompatActivity {

    protected Context mContext;
    protected MyListView mMyListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_list_activty);

        initParamsAndValues();

        initView();
    }

    private void initParamsAndValues() {
        mContext = this;
    }

    private void initView() {
        mMyListView = findViewById(R.id.mylistview);
    }
}
