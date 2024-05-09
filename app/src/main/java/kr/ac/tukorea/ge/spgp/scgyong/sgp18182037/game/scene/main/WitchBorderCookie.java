package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class WitchBorderCookie extends EnemyCookie {
    public WitchBorderCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(300.f);
        setAttack(100.f);
        setKilledPrice(100.f);
        setSpeed(10.0f);
        setSplash(false);
    }
}
