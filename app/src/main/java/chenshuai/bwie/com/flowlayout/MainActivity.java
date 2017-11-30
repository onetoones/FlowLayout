package chenshuai.bwie.com.flowlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String[] mVals = new String[]{"adqw", "23213", "21 ", "qwrewdsad",
            "sadasdasd", "12321", "法大大哇大大", "额为若若翁","adqw", "23213", "21 ", "qwrewdsad",
            "sadasdasd", "12321", "法大大哇大大", "额为若若翁","123432`4","12","adqw", "23213", "21 ", "qwrewdsad",
            "sadasdasd", "12321", "法大大哇大大", "额为若若翁"};
    private LayoutInflater mInflater;
    private FlowLayout mFlowLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInflater = LayoutInflater.from(this);
        mFlowLayout = (FlowLayout) findViewById(R.id.id_flowlayout);
        initData();
    }

    public void initData() {
        /**
         * 找到搜索标签的控件
         */
        for (int i = 0; i < mVals.length; i++) {
            TextView tv = (TextView) mInflater.inflate(
                    R.layout.search_label_tv, mFlowLayout, false);
            tv.setText(mVals[i]);
            final String str = tv.getText().toString();
            //点击事件
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            mFlowLayout.addView(tv);//添加到父View
        }
    }

}

