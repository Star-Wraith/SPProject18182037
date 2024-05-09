package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class HonggildongCookie extends BaseCookie {

    public HonggildongCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(3000.f);
        setAttack(350.f);
        setCoolTime(120.f);
        setPrice(3000.f);
        setSpeed(10.0f);
        setSplash(false);
    }

}
