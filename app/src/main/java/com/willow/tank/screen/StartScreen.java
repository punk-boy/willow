package com.willow.tank.screen;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import com.willow.tank.ResourceManager;

public class StartScreen extends View {

    private Paint paint = new Paint();

    public StartScreen(Context context){
        super(context);
        setVisibility(INVISIBLE);//------------------------------------------------------------------------
        setFocusable(true);
    }

    @Override
    protected void onDraw(Canvas canvas){
        paint.setColor(0x333333);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0,0,getWidth(),getHeight(),paint);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        Log.i("@StageScreen", "onKeyDown"+keyCode);
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
                ResourceManager.setCurrentScreen(ResourceManager.gameScene);
                break;
        }
        return true;
    }


    public void show(boolean gameOver){
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh){
        super.onSizeChanged(w, h, oldw, oldh);
    }

}
