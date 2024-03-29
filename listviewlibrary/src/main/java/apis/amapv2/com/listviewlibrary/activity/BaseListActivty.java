package apis.amapv2.com.listviewlibrary.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Comparator;

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

    protected void initData() {
        ArrayList<ItemObject> data = new ArrayList<>();
        addData(data);
        if (isCompare()){
            data.sort(new Com());
        }
        mMyListView.setData(data);
    }

    class Com implements Comparator<ItemObject> {
        @Override
        public int compare(ItemObject o1, ItemObject o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }


    protected abstract void addData(ArrayList<ItemObject> data);

    /**
     * 增加注释
     * @return
     */
    protected boolean isCompare(){
        return true;
    }
}
