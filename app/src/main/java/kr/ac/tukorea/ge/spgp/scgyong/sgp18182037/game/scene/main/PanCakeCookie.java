package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class PanCakeCookie extends BaseCookie {

    public PanCakeCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(250.f);
        setAttack(50.f);
        setCoolTime(5f);
        setPrice(200.f);
        setSpeed(7.f);
    }
}
