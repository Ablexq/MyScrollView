package com.example.myscrollview.test4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class OuterScrollView extends ScrollView {
    public OuterScrollView(Context context) {
        super(context);
    }

    public OuterScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OuterScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;//关键点
    }
}
