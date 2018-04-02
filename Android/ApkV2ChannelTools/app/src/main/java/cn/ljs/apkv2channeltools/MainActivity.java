package cn.ljs.apkv2channeltools;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import cn.ljs.apkv2channeltools.utils.APKUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AppCompatTextView textView = new AppCompatTextView(this);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);

        setContentView(textView, params);
        try {
            textView.setText(String.format("APP Channel : %s", APKUtils.getApkV2ChannelInfo(this)));
        } catch (APKUtils.ChannelNotFoundException e) {
            Toast.makeText(this, "APP Channel Not Found", Toast.LENGTH_LONG).show();
        }
    }
}
