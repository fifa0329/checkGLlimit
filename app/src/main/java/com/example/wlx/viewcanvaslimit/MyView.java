package com.example.wlx.viewcanvaslimit;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by wlx on 16/10/12.
 * Email:lingxiang.wang@alibaba-inc.com
 */

public class MyView extends TextView {


    public MyView(Context context) {
        super(context);
        init();
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setLayerType(LAYER_TYPE_HARDWARE, null);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("wlx", "height=" + canvas.getMaximumBitmapHeight() + "\n" + "width=" + canvas.getMaximumBitmapWidth());
    }
}
