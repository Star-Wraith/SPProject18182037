package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class MuscleCookie extends BaseCookie {

    public MuscleCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(1000.f);
        setAttack(25.f);
        setCoolTime(5.f);
        setPrice(150.f);
        setSpeed(5.0f);
        setSplash(true);
    }

}
