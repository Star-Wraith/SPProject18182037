package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import android.graphics.Canvas;

import java.util.ArrayList;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.interfaces.IGameObject;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.res.Sound;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.util.CollisionHelper;
import java.util.ArrayList;
import java.util.List;

public class CollisionChecker implements IGameObject {
    private final MainScene scene;
    private final List<BaseCookie> baseCookies;

    public CollisionChecker(MainScene scene, List<BaseCookie> baseCookies) {
        this.scene = scene;
        this.baseCookies = baseCookies;
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
            for (BaseCookie baseCookie : baseCookies) {
                if (CollisionHelper.collides(baseCookie, item)) {
                    scene.remove(MainScene.Layer.item, gobj);
                    Sound.playEffect(item.getSoundResId());
                    break;
                }
            }
        }
    }

    @Override
    public void draw(Canvas canvas) {

    }
}