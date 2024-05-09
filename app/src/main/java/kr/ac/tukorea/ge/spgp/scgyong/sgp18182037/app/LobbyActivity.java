package kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import kr.ac.tukorea.ge.spgp.scgyong.sgp18182037.R;

public class LobbyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);
        //if (BuildConfig.DEBUG) {
//        startActivity(new Intent(this, CookieWarActivity.class));
        //}
    }

    public void onBtnStartGame(View view) {
        startActivity(new Intent(this, CookieWarActivity.class));
    }
}