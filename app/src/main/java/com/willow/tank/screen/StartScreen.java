package com.willow.tank.screen;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.View;

public final class StartScreen extends View {
    private Paint paint = new Paint();

    public StartScreen(Context context){
        super(context);
        setVisibility(VISIBLE);
        setFocusable(true);
    }

    @Override
    protected void onDraw(Canvas canvas){
        paint.setColor(0xff0000ff);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0, 0,getWidth(),getHeight(), paint);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh){
        super.onSizeChanged(w, h, oldw, oldh);
    }

}
