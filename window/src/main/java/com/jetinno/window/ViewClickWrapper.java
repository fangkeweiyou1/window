package com.jetinno.window;

import android.view.View;

/**
 * desc   : {@link View.OnClickListener} 包装类
 */
@SuppressWarnings("rawtypes")
final class ViewClickWrapper implements View.OnClickListener {

    private final EasyWindow mEasyWindow;
    private final EasyWindow.OnClickListener mListener;

    ViewClickWrapper(EasyWindow easyWindow, EasyWindow.OnClickListener listener) {
        mEasyWindow = easyWindow;
        mListener = listener;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void onClick(View view) {
        if (mListener == null) {
            return;
        }
        mListener.onClick(mEasyWindow, view);
    }
}