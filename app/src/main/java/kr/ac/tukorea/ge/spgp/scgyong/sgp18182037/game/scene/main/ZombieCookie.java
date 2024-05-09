package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class ZombieCookie extends EnemyCookie {
    public ZombieCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(6666.f);
        setAttack(250.f);
        setKilledPrice(2500.f);
        setSpeed(3.0f);
        setSplash(false);
    }
}
