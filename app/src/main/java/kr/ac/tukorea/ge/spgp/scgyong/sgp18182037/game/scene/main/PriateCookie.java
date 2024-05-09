package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class PriateCookie extends EnemyCookie {
    public PriateCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(9999.f);
        setAttack(999.f);
        setKilledPrice(9999.f);
        setSpeed(8.0f);
        setSplash(false);
    }
}
