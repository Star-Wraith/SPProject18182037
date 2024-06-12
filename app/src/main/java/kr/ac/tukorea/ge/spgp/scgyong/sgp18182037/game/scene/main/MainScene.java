package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.objects.Button;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.objects.HorzScrollBackground;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.res.Sound;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.scene.Scene;
import java.util.ArrayList;
import java.util.List;

public class MainScene extends Scene {
    private static final String TAG = MainScene.class.getSimpleName();
    public enum Layer {
        bg, platform, item, player, ui, touch, controller, COUNT
    }

    private final List<BaseCookie> baseCookies = new ArrayList<>();

    public MainScene() {
        initLayers(Layer.COUNT);

        add(Layer.bg, new HorzScrollBackground(R.mipmap.land_1, 0f));

        add(Layer.touch, new Button(R.mipmap.list, 8.f, 7.8f, 7.0f, 1.7f, new Button.Callback() {
            @Override
            public boolean onTouch(Button.Action action, float touchX, float touchY) {
                if (action == Button.Action.pressed) {
                    BaseCookie newCookie = null;
                    if (touchX < 6.0f) {
                        // 1번 소환
                        System.out.println("1번 소환");
                        newCookie = new BraveCookie();
                    } else if (touchX < 7.5f) {
                        // 2번 소환
                        System.out.println("2번 소환");
                        newCookie = new BorderCookie();
                    } else if (touchX < 9.f) {
                        // 3번 소환
                        System.out.println("3번 소환");
                        newCookie = new CheeyCookie();
                    } else if (touchX < 10.5f) {
                        // 4번 소환
                        System.out.println("4번 소환");
                        newCookie = new MuscleCookie();
                    } else if (touchX < 12.f) {
                        // 5번 소환
                        System.out.println("5번 소환");

                        newCookie = new RedCookie();
                    }
                    if (newCookie != null) {
                        add(Layer.player, newCookie);
                        baseCookies.add(newCookie);
                    }
                }
                return false;
            }
        }));

        add(Layer.controller, new MapLoader(this));
        add(Layer.controller, new CollisionChecker(this, baseCookies));
//
//        add(Layer.touch, new Button(R.mipmap.btn_slide_n, 1.5f, 8.0f, 2.0f, 0.75f, new Button.Callback() {
//            @Override
//            public boolean onTouch(Button.Action action, float x, float y) {
//                for (BaseCookie cookie : baseCookies) {
//                    cookie.slide(action == Button.Action.pressed);
//                }
//                return true;
//            }
//        }));
//
//        add(Layer.touch, new Button(R.mipmap.btn_jump_n, 14.5f, 7.7f, 2.0f, 0.75f, new Button.Callback() {
//            @Override
//            public boolean onTouch(Button.Action action, float x, float y) {
//                for (BaseCookie cookie : baseCookies) {
//                    cookie.jump();
//                }
//                return false;
//            }
//        }));
//
//        add(Layer.touch, new Button(R.mipmap.btn_fall_n, 14.5f, 8.5f, 2.0f, 0.75f, new Button.Callback() {
//            @Override
//            public boolean onTouch(Button.Action action, float x, float y) {
//                for (BaseCookie cookie : baseCookies) {
//                    cookie.fall();
//                }
//                return false;
//            }
//        }));
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
