package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class CheeyCookie extends BaseCookie {
    public CheeyCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(300.f);
        setAttack(150.f);
        setCoolTime(20.f);
        setPrice(2000.f);
        setSpeed(7.0f);
        setSplash(true);
    }
}
