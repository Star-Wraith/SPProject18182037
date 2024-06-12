package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.objects.Button;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.objects.HorzScrollBackground;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.res.Sound;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.scene.Scene;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainScene extends Scene {
    private static final String TAG = MainScene.class.getSimpleName();
//    private Timer enemySpawnTimer;
//    private static final int ENEMY_SPAWN_DELAY = 5000;
//    private static final int ENEMY_SPAWN_PERIOD = 5000;

    public enum Layer {
        bg, platform, item, player, enemy, ui, touch, controller, COUNT
    }

    private final List<BaseCookie> baseCookies = new ArrayList<>();

    public MainScene() {
        initLayers(Layer.COUNT);


//        enemySpawnTimer = new Timer();
//        enemySpawnTimer.scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run() {
//                spawnRandomEnemy();
//            }
//        }, ENEMY_SPAWN_DELAY, ENEMY_SPAWN_PERIOD);
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
    }

//    private void spawnRandomEnemy() {
//        EnemyCookie newEnemy = getRandomEnemy();
//        if (newEnemy != null) {
//            add(Layer.enemy, newEnemy);
//        }
//    }
//    private EnemyCookie getRandomEnemy() {
//        Random random = new Random();
//        int randomNumber = random.nextInt(10); // 0부터 9까지의 랜덤한 정수
//
//        switch (randomNumber) {
//            case 0:
//                return new AppleCookie();
//            case 1:
//                return new IceHeroCookie();
//            case 2:
//                return new RoseHeroCookie();
//            case 3:
//                return new HeroCookie();
//            case 4:
//                return new PepperMintCookie();
//            case 5:
//                return new PriateCookie();
//            case 6:
//                return new WitchBorderCookie();
//            case 7:
//                return new WitchCookie();
//            case 8:
//                return new ZombieCookie();
//            case 9:
//                return new SodaCookie();
//            default:
//                return null; // 예외 처리
//        }
//    }

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
