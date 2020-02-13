package apis.amapv2.com.mylistview;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class Test2Activity extends BaseListActivty {

    @Override
    protected void addData(ArrayList<ItemObject> data) {
        data.add(new ItemObject("测试",Test1Activity.class));
    }
}
