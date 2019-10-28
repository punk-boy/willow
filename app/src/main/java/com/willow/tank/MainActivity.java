package com.willow.tank;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.willow.tank.screen.GameScene;
import com.willow.tank.screen.GameoverScreen;
import com.willow.tank.screen.ScoreScreen;
import com.willow.tank.screen.SplashScreen;
import com.willow.tank.screen.StageScreen;
import com.willow.tank.screen.StartScreen;

public class MainActivity extends AppCompatActivity {

    private FrameLayout mainWindow;
    private static StartScreen start = null;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ResourceManager.startScreen = new StartScreen(this);
        ResourceManager.splashScreen = new SplashScreen(this);
        ResourceManager.stageScreen = new StageScreen(this);
        ResourceManager.gameScene = new GameScene(this);
        ResourceManager.gameoverScreen = new GameoverScreen(this);
        ResourceManager.scoreScreen = new ScoreScreen(this);

        setContentView(R.layout.activity_main);
        mainWindow = (FrameLayout)findViewById(R.id.mainwindow);
        ResourceManager.thisDisplay = mainWindow;//------------------------------------------------------

        mainWindow.addView(ResourceManager.startScreen);
        mainWindow.addView(ResourceManager.splashScreen);
        mainWindow.addView(ResourceManager.stageScreen);
        mainWindow.addView(ResourceManager.gameScene);
        mainWindow.addView(ResourceManager.scoreScreen);
        mainWindow.addView(ResourceManager.gameoverScreen);



        if(ResourceManager.currentScreen == null)
            ResourceManager.currentScreen = ResourceManager.stageScreen;
        ResourceManager.setCurrentScreen(ResourceManager.currentScreen);

//        start.setVisibility(View.VISIBLE);
//        mainWindow.bringChildToFront(start);
    }
}
