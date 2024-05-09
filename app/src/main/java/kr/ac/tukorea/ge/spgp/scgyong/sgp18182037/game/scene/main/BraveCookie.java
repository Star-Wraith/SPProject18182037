package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class BraveCookie extends BaseCookie {

    public BraveCookie() {
       super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(100.f);
        setAttack(25.f);
        setCoolTime(2.5f);
        setPrice(50.f);
        setSpeed(5.0f);
        setSplash(false);
    }




}