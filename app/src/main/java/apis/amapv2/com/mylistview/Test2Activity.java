package apis.amapv2.com.mylistview;

import android.view.View;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class Test2Activity extends BaseListActivty {

    @Override
    protected void initData() {
        mTvTitle.setText("标题");
        mTvTitle.setVisibility(View.VISIBLE);

        ArrayList<ItemObject> data = new ArrayList<>();
        data.add(new ItemObject("测试",Test1Activity.class));
        mMyListView.setData(data);
    }
}
