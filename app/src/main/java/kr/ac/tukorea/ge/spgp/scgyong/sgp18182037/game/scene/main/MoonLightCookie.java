package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class MoonLightCookie extends BaseCookie {
    public MoonLightCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(1500.f);
        setAttack(222.f);
        setCoolTime(120.f);
        setPrice(4200.f);
        setSpeed(10.0f);
    }
}
