package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class SodaCookie extends EnemyCookie {
    public SodaCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(1200.f);
        setAttack(250.f);
        setKilledPrice(500.f);
        setSpeed(10.0f);
        setSplash(false);
    }
}
