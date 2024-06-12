package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import android.graphics.Canvas;

import java.util.ArrayList;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.interfaces.IGameObject;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.res.Sound;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.util.CollisionHelper;

public class CollisionChecker implements IGameObject {
    private final MainScene scene;
    private final BaseCookie baseCookie;

    public CollisionChecker(MainScene scene, BaseCookie baseCookie) {
        this.scene = scene;
        this.baseCookie = baseCookie;
    }

    @Override
    public void update(float elapsedSeconds) {
        ArrayList<IGameObject> items = scene.objectsAt(MainScene.Layer.item);
        for (int i = items.size() - 1; i >= 0; i--) {
            IGameObject gobj = items.get(i);
            if (!(gobj instanceof Tower)) {
                continue;
            }
            Tower item = (Tower) gobj;
            if (CollisionHelper.collides(baseCookie, item)) {
                scene.remove(MainScene.Layer.item, gobj);
                Sound.playEffect(item.getSoundResId());
            }
        }
    }

    @Override
    public void draw(Canvas canvas) {

    }
}