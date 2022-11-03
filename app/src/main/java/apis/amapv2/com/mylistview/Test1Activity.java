package apis.amapv2.com.mylistview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class Test1Activity extends BaseListActivty {

    @Override
    protected void addData(ArrayList<ItemObject> data) {
        data.add(new ItemObject("a", Test1Activity.class));
        data.add(new ItemObject("c", Test1Activity.class));
        data.add(new ItemObject("b", Test1Activity.class));
    }

    @Override
    protected boolean isCompare() {
        return false;
    }
}
