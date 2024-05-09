package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class HeroCookie extends EnemyCookie {
    public HeroCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(555.f);
        setAttack(125.f);
        setKilledPrice(150.f);
        setSpeed(8.0f);
        setSplash(false);
    }
}
