package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class GumballCookie extends BaseCookie {

    public GumballCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(350.f);
        setAttack(100.f);
        setCoolTime(12.f);
        setPrice(800.f);
        setSpeed(5.0f);
        setSplash(false);
    }


}
