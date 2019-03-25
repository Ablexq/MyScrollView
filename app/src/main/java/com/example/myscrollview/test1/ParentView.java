package com.example.myscrollview.test1;


import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;

public class ParentView extends LinearLayout {

    private static final String TAG = "ParentView";

    public ParentView(Context context) {
        super(context);
        Log.e(TAG, "ParentView==============构造方法1=========");
    }

    public ParentView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.e(TAG, "ParentView==============构造方法2=========");
    }

    public ParentView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.e(TAG, "ParentView==============构造方法3=========");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e(TAG, "ParentView==============onMeasure=========");
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        Log.e(TAG, "ParentView==============onLayout=========");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e(TAG, "ParentView==============onDraw=========");
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Log.e(TAG, "ParentView==============onSizeChanged=========");
    }


    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Log.e(TAG, "ParentView==============dispatchDraw=========");
    }
}
