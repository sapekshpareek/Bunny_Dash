package com.example.bunny_dash;

import android.app.Activity;
import android. content. Context;
import android. graphics. Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android. graphics. Rect;
import android.view.Display;
import android. view. View;

import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import javax.net.ssl.SNIHostName;

public class GameView extends View{
    Bitmap background, ground, rabbit;
    Rect rectBackground, rectGround;
    Context context;
    Handler handler;
    final long  UPDATE_MILLIS = 30;
    Runnable runnable;
    Paint textPaint = new Paint();
    Paint healthPaint = new Paint();
    float TEXT_SIZE = 120;
    int points = 0;
    int life = 3;
    static int dWidth,dHeight;
    Random random;
    float rabbitX, rabbitY;
    float oldX;
    float oldRabbitX;
    ArrayList<Spike> spikes;
    ArrayList<Explosion> explosions;

    public GameView(Context context){
        super(context);
        this.context = context;
        background = BitmapFactory.decodeResource(getResources(),R.drawable.background);
        ground = BitmapFactory.decodeResource(getResources(),R.drawable.ground);
        rabbit = BitmapFactory.decodeResource(getResources(),R.drawable.rabbit);
        Display display = ((Activity)getContext()).getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        dWidth = size.x;
        dHeight = size.y;
        rectBackground = new Rect(0,0,dWidth,dHeight);
        rectGround = new Rect(0,dHeight - ground.getHeight(),dWidth,dHeight);
        handler = new Handler() {
            @Override
            public void publish(LogRecord logRecord) {

            }

            @Override
            public void flush() {

            }

            @Override
            public void close() throws SecurityException {

            }
        };
        runnable = new Runnable() {
            @Override
            public void run() {
                invalidate();
            }
        };
        textPaint.setColor(Color.rgb(255,165,0));
        textPaint.setTextSize(TEXT_SIZE);
        textPaint.setTextAlign(Paint.Align.LEFT);
//        textPaint.setTypeface(ResourcesCompat.getFont(context, R.font.kenney_blocks));
        healthPaint.setColor(Color.GREEN);
        random = new Random();
        rabbitX = dWidth / 2 - rabbit.getWidth() / 2;
        rabbitY = dHeight - ground.getHeight() - rabbit.getHeight();
        spikes = new ArrayList<>();
        explosions = new ArrayList<>();
        for(int i=0; i<3; i++){
            Spike spike = new Spike(context);


        }


    }
}
