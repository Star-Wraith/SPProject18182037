package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.objects;

import android.util.Log;
import android.view.MotionEvent;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.interfaces.ITouchable;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.view.Metrics;

public class Button extends Sprite implements ITouchable {
    public enum Action {
        pressed, released,
    }
    public interface Callback {
        default boolean onTouch(Action action) {
            return onTouch(action, 0.f, 0.f);
        }

        boolean onTouch(Action action, float x, float y);
    }
    private static final String TAG = Button.class.getSimpleName();

    private final Callback callback;
    private boolean processedDown;
    public Button(int bitmapResId, float cx, float cy, float width, float height, Callback callback) {
        super(bitmapResId, cx, cy, width, height);
        this.callback = callback;
    }
    @Override
    public boolean onTouchEvent(MotionEvent e) {
        float[] pts = Metrics.fromScreen(e.getX(), e.getY());
        if (!dstRect.contains(pts[0], pts[1])) {
            return false;
        }
        Log.d(TAG, "Button.onTouch(" + System.identityHashCode(this) + ", " + e.getAction() + ", " + pts[0] + ", " + pts[1]);
        int action = e.getAction();
        if (action == MotionEvent.ACTION_DOWN) {
            processedDown = callback.onTouch(Action.pressed, pts[0], pts[1]);
        } else if (action == MotionEvent.ACTION_UP && processedDown) {
            callback.onTouch(Action.released, pts[0], pts[1]);
        }
        return true;
    }
}