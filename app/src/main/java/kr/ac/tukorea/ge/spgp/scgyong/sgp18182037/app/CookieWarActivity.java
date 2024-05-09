package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.app;

import android.os.Bundle;

import android.os.Bundle;

//import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.BuildConfig;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main.MainScene;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.activity.GameActivity;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.scene.Scene;
import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.framework.view.Metrics;

public class CookieWarActivity extends GameActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        Scene.drawsDebugInfo = BuildConfig.DEBUG;
        Metrics.setGameSize(16, 9);
        super.onCreate(savedInstanceState);
        // Scene.drawsDebugInfo 변경 시점에 주의한다.
        // new GameView() 가 호출되는 super.onCreate() 보다 이전에 해야 한다.
        new MainScene().push();
    }
}