package com.baekdata.fixedscrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class FixedScrollView extends ScrollView {
    private boolean mScrollable = true;

    public FixedScrollView(Context context) {
        super(context);
    }

    public FixedScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FixedScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setScrollingEnabled(boolean enabled) {
        mScrollable = enabled;
    }

    public boolean isScrollable() {
        return mScrollable;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                if (mScrollable) {
                    return super.onTouchEvent(ev);
                }
                return mScrollable;
            default:
                return super.onTouchEvent(ev);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (!mScrollable) return false;
        else return super.onInterceptTouchEvent(ev);
    }
}