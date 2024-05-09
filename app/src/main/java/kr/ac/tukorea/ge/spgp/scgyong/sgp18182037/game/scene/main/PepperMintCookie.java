package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class PepperMintCookie extends EnemyCookie {
    public PepperMintCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);
        srcRects = srcRectsArray[state.ordinal()];

        setHP(2500.f);
        setAttack(333.f);
        setKilledPrice(1500.f);
        setSpeed(8.0f);
        setSplash(false);
    }
}
