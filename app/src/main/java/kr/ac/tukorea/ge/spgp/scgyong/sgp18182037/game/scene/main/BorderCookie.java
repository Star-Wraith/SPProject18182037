package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class BorderCookie extends BaseCookie {

    public BorderCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(350.f);
        setAttack(100.f);
        setCoolTime(10.f);
        setPrice(500.f);
        setSpeed(10.0f);
        setSplash(false);
    }

}