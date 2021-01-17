package com.samurai.prochats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class activity_splashscreen extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView persentase;
    private int Value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

//        progressBar = findViewById(R.id.progress);
//        persentase = findViewById(R.id.persentase);
//        progressBar.setProgress(0); //Set Progress Dimulai Dari O

        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(3000); // Durasi splash screen di tampilkan
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(activity_splashscreen.this,StartActivity.class);
                    startActivity(intent);

                    finish();
                }
            }
        };
        thread.start();

        // Handler untuk Updating data pada latar belakang
//        final Handler handler = new Handler(){
//            @Override
//            public void handleMessage(Message msg) {
//                super.handleMessage(msg);
//                // Menampung semua data yang ingin diproses oleh thread
//                persentase.setText(String.valueOf(Value)+"%");
//                if(Value == progressBar.getMax()){
//                    Toast.makeText(getApplicationContext(), "Selamat Datang", Toast.LENGTH_SHORT).show();
//                    startActivity(new Intent(activity_splashscreen.this, MainActivity.class));
//                    finish();
//                }
//                Value++;
//            }
//        };
//
//        // Thread untuk updating progress pada ProgressBar di Latar Belakang
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try{
//                    for(int w=0; w<=progressBar.getMax(); w++){
//                        progressBar.setProgress(w); // Memasukan Value pada ProgressBar
//                        // Mengirim pesan dari handler, untuk diproses didalam thread
//                        handler.sendMessage(handler.obtainMessage());
//                        Thread.sleep(20); // Waktu Pending 100ms/0.1 detik
//                    }
//                }catch(InterruptedException ex){
//                    ex.printStackTrace();
//                }
//            }
//        });
//        thread.start();
    }
}
