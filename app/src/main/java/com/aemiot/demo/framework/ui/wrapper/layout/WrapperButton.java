package com.aemiot.demo.framework.ui.wrapper.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;
import android.widget.FrameLayout;

public class WrapperButton extends Button {

    int layoutCount = 0;
    int measureCount = 0;
    int drawCount = 0;

    public WrapperButton(Context context) {
        super(context);
    }

    public WrapperButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WrapperButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        ++layoutCount;
        Log.d((String)getTag(), "layout count: " + layoutCount);
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ++measureCount;
        Log.d((String)getTag(), "measure count: " + measureCount);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        ++drawCount;
        Log.d((String)getTag(), "draw count: " + drawCount);
        super.onDraw(canvas);
    }
}
