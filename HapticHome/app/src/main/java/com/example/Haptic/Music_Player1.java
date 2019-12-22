package com.example.Haptic;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class Music_Player1 extends AppCompatActivity {
    boolean isPlayingMusic = false;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music__player1);


    }

    public void YankeeDoodle(View view) {
        if (isPlayingMusic) {
            mediaPlayer.stop();
            isPlayingMusic = false;
        } else {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.yankee_doodle);
            mediaPlayer.start();
            isPlayingMusic = true;
        }
    }

    public void RowBoat(View view) {

        if (isPlayingMusic) {
            mediaPlayer.stop();
            isPlayingMusic = false;
        } else {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.row_boat);
            mediaPlayer.start();
            isPlayingMusic = true;
        }
    }


    public void OdeToJoy(View view) {

        if (isPlayingMusic) {
            mediaPlayer.stop();
            isPlayingMusic = false;
        } else {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ode_to_joy);
            mediaPlayer.start();
            isPlayingMusic = true;
        }
    }

    public void Teapot(View view) {

        if (isPlayingMusic) {
            mediaPlayer.stop();
            isPlayingMusic = false;
        } else {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.teapot);
            mediaPlayer.start();
            isPlayingMusic = true;
        }
    }

    public void HappyBirthday(View view) {

        if (isPlayingMusic) {
            mediaPlayer.stop();
            isPlayingMusic = false;
        } else {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.happy_birthday);
            mediaPlayer.start();
            isPlayingMusic = true;
        }
    }

    public void ItsyBitsy(View view) {

        if (isPlayingMusic) {
            mediaPlayer.stop();
            isPlayingMusic = false;
        } else {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.itsy_bitsy);
            mediaPlayer.start();
            isPlayingMusic = true;
        }
    }

    public void MaryLamb(View view) {

        if (isPlayingMusic) {
            mediaPlayer.stop();
            isPlayingMusic = false;
        } else {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.mary_had_a_little_lamb);
            mediaPlayer.start();
            isPlayingMusic = true;
        }
    }

    public void Twinkle(View view) {

        if (isPlayingMusic) {
            mediaPlayer.stop();
            isPlayingMusic = false;
        } else {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.twinkle_twinkle);
            mediaPlayer.start();
            isPlayingMusic = true;
        }
    }
}
