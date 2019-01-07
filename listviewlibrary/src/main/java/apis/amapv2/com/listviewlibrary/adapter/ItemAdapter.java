package apis.amapv2.com.listviewlibrary.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class ItemAdapter extends BaseAdapter {


    private final Context mContext;
    private final List<ItemObject> mData;

    public ItemAdapter(Context context, List<ItemObject> data) {
        mContext = context;
        mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = (TextView) LayoutInflater.from(mContext).inflate(android.R.layout.simple_list_item_1,null,false);
        textView.setText(position + "、" + mData.get(position).getTitle());
        return textView;
    }
}