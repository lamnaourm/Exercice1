package com.example.exercice1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String loadJsonFromRaw(int resId) {
        String json = "";
        try {
            InputStream input = getResources().openRawResource(resId);
            int taille = 0;
            taille = input.available();
            byte[] content = new byte[taille];
            input.read(content);
            input.close();
            json = new String(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
}