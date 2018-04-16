package com.example.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.alipay.sdk.app.EnvUtils;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EnvUtils.setEnv(EnvUtils.EnvEnum.SANDBOX);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
