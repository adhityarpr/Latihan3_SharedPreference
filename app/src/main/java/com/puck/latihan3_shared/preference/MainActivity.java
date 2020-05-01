package com.puck.latihan3_shared.preference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.puck.latihan3_shared.R;
import com.puck.latihan3_shared.utils.Preferences;

public class MainActivity extends AppCompatActivity {

    /*
   NIM     : 10117134
   Nama    : AdhityaRizqyPratama
   Kelas   : IF4
   Matkul  : Aplikasi Komputasi Bergerak
   Tugas   : AKB-Tugas-3-SharedPreference


    */
//    1 Mei 2020, 20.48 WIB : Tugas Selesai
//    1 Mei 2020, Membuat apk rilis dan mengirim file ke email. Dan upload ke github

    private TextView txtKeluar;
    private TextView txtName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        declareView();
        txtKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Clear Set Preferences
                Preferences.setLogout(getBaseContext());

                //Pindah Halaman ke Login
                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });
    }

    private void declareView() {
        txtKeluar = findViewById(R.id.txt_logout);
        txtName = findViewById(R.id.txtName);

        txtName.setText(Preferences.getRegisteredUser(getBaseContext()));
    }
}
