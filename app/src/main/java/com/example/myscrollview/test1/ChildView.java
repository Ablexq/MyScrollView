package com.example.myscrollview.test1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;


@SuppressLint("AppCompatCustomView")
public class ChildView extends TextView {

    private static final String TAG = ChildView.class.getSimpleName();

    public ChildView(Context context) {
        super(context);
        Log.e(TAG, "ChildView==============构造方法1=========");
    }

    public ChildView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.e(TAG, "ChildView==============构造方法2=========");
    }

    public ChildView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.e(TAG, "ChildView==============构造方法3=========");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e(TAG, "ChildView==============onMeasure=========");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.e(TAG, "ChildView==============onLayout=========");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e(TAG, "ChildView==============onDraw=========");
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Log.e(TAG, "ChildView==============dispatchDraw=========");
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Log.e(TAG, "ChildView==============onSizeChanged=========");
    }
}
