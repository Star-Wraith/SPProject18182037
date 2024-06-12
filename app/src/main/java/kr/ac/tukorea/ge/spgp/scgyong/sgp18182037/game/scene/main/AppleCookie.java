package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class AppleCookie extends EnemyCookie {
    public AppleCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        setHP(1500.f);
        setAttack(250.f);
        setKillPrice(1000.f);
        setSpeed(12.0f);
        setSplash(false);
    }
}
