package com.example.xinweichen.tetris2048;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {
    public Card(Context context) {
        super(context);
        label=new TextView(getContext());
        label.setTextSize(32);

        LayoutParams lp=new LayoutParams(-1,-1);
        addView(label,lp);
        setNum(0);
    }
    private int num;
    public void setNum(int num) {
        this.num = num;
        label.setText(num+"");
    }

    public int getNum() {
        return num;
    }
    private TextView label;


    public boolean equals(Card O) {
        return getNum()==O.getNum();
    }
}
