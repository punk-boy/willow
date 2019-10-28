package com.willow.tank;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.willow.tank.screen.StartScreen;

public class MainActivity extends AppCompatActivity {

    private FrameLayout mainWindow;
    private static StartScreen start = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainWindow = (FrameLayout)findViewById(R.id.mainwindow);

        start = new StartScreen(this);
        mainWindow.addView(start);
        start.setVisibility(View.VISIBLE);
        mainWindow.bringChildToFront(start);

    }
}
