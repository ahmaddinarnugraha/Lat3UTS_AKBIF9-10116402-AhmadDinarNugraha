//* Tanggal Pengerjaan : 02 - Mei - 2019
//* NIM                : 10116402
//* Nama               : Ahmad Dinar Nugraha
//* Kelas              : AKBIF-9

package com.example.lat3uts_akbif9_10116402_ahmaddinarnugraha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this, Main2Activity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}
