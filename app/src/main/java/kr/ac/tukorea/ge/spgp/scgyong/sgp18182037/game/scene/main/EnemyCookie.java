package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;

import java.util.ArrayList;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.interfaces.IBoxCollidable;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.interfaces.IGameObject;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.objects.SheetSprite;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.scene.Scene;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.view.Metrics;

public class EnemyCookie extends SheetSprite implements IBoxCollidable {
    private float SPEED = 5.0f;
    private final RectF collisionRect = new RectF();
    private float HP = 99.0f;
    private float ATTACK = 20.f;
    private float KILL_PRICE = 10.f;
    private boolean SPLASH = false;
    private boolean isRunning = false;

    public EnemyCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        setSpeed(SPEED);
        setHP(HP);
        setAttack(ATTACK);
        setKillPrice(KILL_PRICE);
        setSplash(SPLASH);

        fixCollisionRect();
    }

    // 복사 생성자
    public EnemyCookie(int mipmapResId, float fps) {
        super(mipmapResId, fps);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        fixCollisionRect();
    }


    public void setSpeed(float speed) {
        SPEED = speed;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void update(float elapsedSeconds) {
        float dx = 0.f;
        if (isRunning) {
            dx = SPEED * elapsedSeconds;
        }
        dstRect.offset(-dx, 0);
        collisionRect.offset(-dx, 0);
    }

    private void fixCollisionRect() {
        collisionRect.set(
                dstRect.left,
                dstRect.top,
                dstRect.right,
                dstRect.bottom);
    }

    @Override
    public RectF getCollisionRect() {
        return collisionRect;
    }

    public float getHP() {
        return HP;
    }

    public void setHP(float hp) {
        HP = hp;
    }

    public float getAttack() {
        return ATTACK;
    }

    public void setAttack(float attack) {
        ATTACK = attack;
    }

    public float getKillPrice() {
        return KILL_PRICE;
    }

    public void setKillPrice(float killPrice) {
        KILL_PRICE = killPrice;
    }

    public boolean getSplash() {
        return SPLASH;
    }

    public void setSplash(boolean splash) {
        SPLASH = splash;
    }
}