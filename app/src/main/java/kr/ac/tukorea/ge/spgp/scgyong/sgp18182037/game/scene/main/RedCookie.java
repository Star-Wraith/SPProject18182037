package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class RedCookie extends BaseCookie {

    public RedCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(1000.f);
        setAttack(350.f);
        setCoolTime(60.f);
        setPrice(1200.f);
        setSpeed(7.0f);
        setSplash(false);
    }
}
