package com.example.xinweichen.tetris2048;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;

public class GameView extends GridLayout {


    public GameView(Context context) {
        super(context);
        initGameView();
    }

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initGameView();
    }

    public GameView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initGameView();
    }

    public GameView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initGameView();
    }


   private void initGameView(){
        setOnTouchListener(new OnTouchListener() {
            private float startX,startY,offsetX,offsetY;
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                switch(motionEvent.getAction()){

                    case MotionEvent.ACTION_DOWN:

                        startX=motionEvent.getX();
                        startY=motionEvent.getY();
                        break;

                    case
                        MotionEvent.ACTION_UP:

                        performClick();

                        offsetX=motionEvent.getX()-startX;
                        offsetY=motionEvent.getY()-startY;
                        if (Math.abs(offsetX)>Math.abs(offsetY)) {
                            if (offsetX<-3) {
                                swipeLeft();

                                System.out.println("left");
                            }else if (offsetX>3) {
                               swipeRight();
                                System.out.println("right");
                            }
                        }else{
                            if (offsetY<-3) {
                                swipeUp();
                                System.out.println("up");
                            }else if (offsetY>3) {
                                swipeDown();
                                System.out.println("down");
                            }
                        }

                        break;
                }
                return true;
            }
        });

   }

    private void swipeLeft(){

   }
    private void swipeRight(){

    }
    private void swipeUp(){

    }
    private void swipeDown(){

    }

}
