package apis.amapv2.com.listviewlibrary.bean;

/**
 * 每一个条目对应的点击事件
 */
public class ItemObject {

    private String mTitle;//对应的标题
    private Class mClazz;//标题对应的字节码文件

    public ItemObject(String title, Class aClass) {
        mTitle = title;
        mClazz = aClass;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Class getClazz() {
        return mClazz;
    }

    public void setClass(Class aClass) {
        mClazz = aClass;
    }
}

