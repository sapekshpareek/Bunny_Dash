package com.example.bunny_dash;

import android. content. Context;
import android. graphics. Bitmap;
import android.graphics.Paint;
import android. graphics. Rect;
import android. view. View;

import java.util.ArrayList;

public class GameView {
    Bitmap background, ground, rabbit;
    Rect rectBackground, rectGround;
    Context context;
    Handler handler;
    final long UPDATE_MILLIS
    Runnable runnable;
    Paint textPaint = new Paint();
    Paint healthPaint = new Paint();
    float TEXT_SIZE = 120;
    int points = 0;
    int life = 3;
    static int dWidth,dHeight;
    Random random;
    float rabbitX, rabbity;
    float oldX;
    float oldRabbitX;
    ArrayList<Spike> spikes;
    ArrayList<Explosion> explosions;

    public GameView(Context context){
        super(context);
    }
}
