package com.jetinno.window;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;

/**
 * desc   : {@link View.OnTouchListener} 包装类
 */
@SuppressWarnings("rawtypes")
final class ViewTouchWrapper implements View.OnTouchListener {

    private final EasyWindow mEasyWindow;
    private final EasyWindow.OnTouchListener mListener;

    ViewTouchWrapper(EasyWindow easyWindow, EasyWindow.OnTouchListener listener) {
        mEasyWindow = easyWindow;
        mListener = listener;
    }

    @SuppressLint("ClickableViewAccessibility")
    @SuppressWarnings("unchecked")
    @Override
    public boolean onTouch(View view, MotionEvent event) {
        if (mListener == null) {
            return false;
        }
        return mListener.onTouch(mEasyWindow, view, event);
    }
}