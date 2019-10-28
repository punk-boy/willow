package com.willow.tank.screen;

import java.io.IOException;
import java.util.Random;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.willow.tank.ResourceManager;


public final class GameScene extends SurfaceView implements Runnable,SurfaceHolder.Callback{


    public GameScene(Context context) {
        super(context);
        setVisibility(INVISIBLE);//------------------------------------------------------------------------
        setFocusable(true);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    @Override
    public void run() {

    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        Log.i("@GameoverScreen", "onKeyDown"+keyCode);

        int gameAction = 0;

        switch (keyCode){
            case KeyEvent.KEYCODE_5:
            case KeyEvent.KEYCODE_DPAD_CENTER:
                gameAction = KeyEvent.KEYCODE_DPAD_CENTER;
                break;
            default:
                break;
        }

        switch(gameAction){
            case KeyEvent.KEYCODE_DPAD_CENTER:
            default:
                // ResourceManager.splashScreen.show();
                ResourceManager.setCurrentScreen(ResourceManager.startScreen);
                break;
        }
        return true;
    }


    public void show(boolean gameOver){
    }
}
