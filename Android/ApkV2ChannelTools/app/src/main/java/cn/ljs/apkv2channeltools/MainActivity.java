package cn.ljs.apkv2channeltools;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.nio.charset.Charset;

import cn.ljs.apkv2channeltools.utils.APKUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout = new FrameLayout(this);
        setContentView(frameLayout, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        AppCompatTextView textView = new AppCompatTextView(this);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);

        frameLayout.addView(textView, params);
        try {
            textView.setText(String.format("APP Signature Info: %s", new String(APKUtils.getApkV2SignatureInfo(this), Charset.forName("utf-8"))));
        } catch (Exception e) {
            textView.setText("get signature info error");
        }

        AppCompatTextView extraTv = new AppCompatTextView(this);
        params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.BOTTOM | Gravity.CENTER;
        extraTv.setTextColor(Color.BLACK);
        extraTv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        frameLayout.addView(extraTv, params);

        try {
            extraTv.setText(String.format("APP Extra Info : %s", new String(APKUtils.getApkExtraInfo(
                    this, "channel"), Charset.forName("utf-8"))));
        } catch (APKUtils.ApkExtraInfoNotFoundException e) {
            extraTv.setText("APP Extra Info not found");
        }
    }

}
