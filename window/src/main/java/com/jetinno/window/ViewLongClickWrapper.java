package com.jetinno.window;

import android.view.View;

/**
 * desc   : {@link View.OnLongClickListener} 包装类
 */
@SuppressWarnings("rawtypes")
final class ViewLongClickWrapper implements View.OnLongClickListener {

    private final EasyWindow mEasyWindow;
    private final EasyWindow.OnLongClickListener mListener;

    ViewLongClickWrapper(EasyWindow easyWindow, EasyWindow.OnLongClickListener listener) {
        mEasyWindow = easyWindow;
        mListener = listener;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean onLongClick(View view) {
        if (mListener == null) {
            return false;
        }
        return mListener.onLongClick(mEasyWindow, view);
    }
}