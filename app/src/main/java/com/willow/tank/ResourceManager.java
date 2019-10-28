package com.willow.tank;


import android.view.View;
import android.widget.FrameLayout;

import com.willow.tank.screen.GameScene;
import com.willow.tank.screen.GameoverScreen;
import com.willow.tank.screen.ScoreScreen;
import com.willow.tank.screen.SplashScreen;
import com.willow.tank.screen.StageScreen;
import com.willow.tank.screen.StartScreen;

public class ResourceManager {

    public static View currentScreen = null;
    public static FrameLayout thisDisplay = null;

    public static StartScreen startScreen = null;
    public static SplashScreen splashScreen = null;
    public static GameScene gameScene = null;
    public static ScoreScreen scoreScreen = null;
    public static GameoverScreen gameoverScreen = null;
    public static StageScreen stageScreen = null;


    private static ResourceManager instance = new ResourceManager();

    public static ResourceManager getInstance(){
        return instance;
    }

    private ResourceManager(){
        //null
    }



    public static void setCurrentScreen(View newScreen){
        currentScreen.setVisibility(View.INVISIBLE);
        currentScreen = newScreen;
        currentScreen.setVisibility(View.VISIBLE);
        thisDisplay.bringChildToFront(currentScreen);
    }
}
