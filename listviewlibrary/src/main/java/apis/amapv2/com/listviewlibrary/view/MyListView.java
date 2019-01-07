package apis.amapv2.com.listviewlibrary.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.adapter.ItemAdapter;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class MyListView extends ListView {
    private ArrayList<ItemObject> mData = new ArrayList<>();
    private Context mContext;

    public MyListView(Context context) {
        this(context,null);
    }

    public MyListView(Context context, AttributeSet attrs) {
        this(context, attrs,-1);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        mContext = context;

        this.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mContext.startActivity(new Intent(mContext,mData.get(position).getClazz()));
            }
        });
    }

    public void setData(ArrayList<ItemObject> list){
        if (list != null){
            mData.clear();
            mData.addAll(list);
            this.setAdapter(new ItemAdapter(mContext,mData));
        }
    }
}
