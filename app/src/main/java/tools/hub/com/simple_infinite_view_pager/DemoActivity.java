package tools.hub.com.simple_infinite_view_pager;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import java.util.ArrayList;

public class DemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        String url1 = "http://d.hiphotos.baidu.com/zhidao/pic/item/0bd162d9f2d3572cc2a9e4a08d13632762d0c307.jpg";
        String url2 = "http://img4.duitang.com/uploads/item/201306/14/20130614172851_WmMCE.thumb.600_0.jpeg";
        String url3 = "http://imgsrc.baidu.com/forum/pic/item/d62a6059252dd42a0d08194d033b5bb5c8eab8d6.jpg";
        String url4 = "http://img4q.duitang.com/uploads/item/201311/09/20131109163244_HUT5C.jpeg";

        ArrayList<String> list = new ArrayList<String>();

        list.add(url1);
        list.add(url2);
        list.add(url3);
        list.add(url4);

        Infinite_View_Pager ivp = (Infinite_View_Pager) findViewById(R.id.simple_infinite_view_pager);

        ivp.set_img_url(list, R.drawable.one);

        ivp.start_auto_play();

    }
}
