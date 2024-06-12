package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.objects.Button;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.objects.HorzScrollBackground;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.res.Sound;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.scene.Scene;

public class MainScene extends Scene {
    private static final String TAG = MainScene.class.getSimpleName();
    public enum Layer {
        bg, platform, item, player, ui, touch, controller, COUNT
    }
    private final BaseCookie baseCookie;
    public MainScene() {
        initLayers(Layer.COUNT);

        add(Layer.bg, new HorzScrollBackground(R.mipmap.land_1, 0f));



        add(Layer.touch, new Button(R.mipmap.list, 8.f, 7.8f, 7.0f, 1.7f, new Button.Callback() {
            @Override
            public boolean onTouch(Button.Action action) {

                

                return false;
            }
        }));


        baseCookie = new BaseCookie();
        add(Layer.player, baseCookie);

        add(Layer.controller, new MapLoader(this));
        add(Layer.controller, new CollisionChecker(this, baseCookie));

        add(Layer.touch, new Button(R.mipmap.btn_slide_n, 1.5f, 8.0f, 2.0f, 0.75f, new Button.Callback() {
            @Override
            public boolean onTouch(Button.Action action) {
                baseCookie.slide(action == Button.Action.pressed);
                return true;
            }
        }));
        add(Layer.touch, new Button(R.mipmap.btn_jump_n, 14.5f, 7.7f, 2.0f, 0.75f, new Button.Callback() {
            @Override
            public boolean onTouch(Button.Action action) {
                baseCookie.jump();
                return false;
            }
        }));
        add(Layer.touch, new Button(R.mipmap.btn_fall_n, 14.5f, 8.5f, 2.0f, 0.75f, new Button.Callback() {
            @Override
            public boolean onTouch(Button.Action action) {
                baseCookie.fall();
                return false;
            }
        }));
    }

    @Override
    protected void onStart() {
        Sound.playMusic(R.raw.main);
    }

    @Override
    protected void onPause() {
        Sound.pauseMusic();
    }

    @Override
    protected void onResume() {
        Sound.resumeMusic();
    }

    @Override
    protected void onEnd() {
        Sound.stopMusic();
    }

    @Override
    protected int getTouchLayerIndex() {
        return Layer.touch.ordinal();
    }
}