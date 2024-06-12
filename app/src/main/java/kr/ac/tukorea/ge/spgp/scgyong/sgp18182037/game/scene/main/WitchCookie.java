package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class WitchCookie extends EnemyCookie {
    public WitchCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);

        setHP(99.f);
        setAttack(20.f);
        setKillPrice(10.f);
        setSpeed(5.0f);
        setSplash(false);
    }
}
