package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.game.scene.main;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class RoseHeroCookie extends EnemyCookie {
    public RoseHeroCookie() {
        super(R.mipmap.cookie_player_sheet, 8);
        setPosition(2.0f, 3.0f, 3.86f, 3.86f);

        setHP(6250.f);
        setAttack(340.f);
        setKillPrice(5000.f);
        setSpeed(10.0f);
        setSplash(true);
    }
}