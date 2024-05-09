package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class DarkChocoCookie extends BaseCookie {
    public DarkChocoCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(1100.f);
        setAttack(100.f);
        setCoolTime(80.f);
        setPrice(2200.f);
        setSpeed(8.f);
        setSplash(true);
    }
}
