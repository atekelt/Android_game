package com.example.falcon.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MultiPlayer extends AppCompatActivity {
    public String cover = "X";
    public int valueX1[][] = {{0,0,0},{0,0,0},{0,0,0}}, valueO1[][] = {{0,0,0},{0,0,0},{0,0,0}};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_player);
    }

    public void checkX()
    {
        if(valueX1[0][0] == 1 && valueX1[0][1] == 1 && valueX1[0][2] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : X");
            end();
        }
        else if(valueX1[0][2] == 1 && valueX1[1][2] == 1 && valueX1[2][2] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : X");
            end();
        }
        else if(valueX1[1][0] == 1 && valueX1[1][1] == 1 && valueX1[1][2] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : X");
            end();
        }
        else if(valueX1[2][0] == 1 && valueX1[2][1] == 1 && valueX1[2][2] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : X");
            end();

        }
        else if(valueX1[0][0] == 1 && valueX1[1][0] == 1 && valueX1[2][0] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : X");
            end();

        }
        else if(valueX1[0][1] == 1 && valueX1[1][1] == 1 && valueX1[2][1] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : X");
            end();

        }
        else if(valueX1[0][0] == 1 && valueX1[1][1] == 1 && valueX1[2][2] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : X");
            end();

        }
        else if(valueX1[0][2] == 1 && valueX1[1][1] == 1 && valueX1[2][0] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : X");
            end();

        }
    }

    public void checkO()
    {
        if(valueO1[0][0] == 1 && valueO1[0][1] == 1 && valueO1[0][2] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : O");
            end();
        }
        else if(valueO1[0][2] == 1 && valueO1[1][2] == 1 && valueO1[2][2] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : O");
            end();
        }
        else if(valueO1[1][0] == 1 && valueO1[1][1] == 1 && valueO1[1][2] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : O");
            end();
        }
        else if(valueO1[2][0] == 1 && valueO1[2][1] == 1 && valueO1[2][2] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : O");
            end();

        }
        else if(valueO1[0][0] == 1 && valueO1[1][0] == 1 && valueO1[2][0] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : O");
            end();

        }
        else if(valueO1[0][1] == 1 && valueO1[1][1] == 1 && valueO1[2][1] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : O");
            end();

        }
        else if(valueO1[0][0] == 1 && valueO1[1][1] == 1 && valueO1[2][2] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : O");
            end();

        }
        else if(valueO1[0][2] == 1 && valueO1[1][1] == 1 && valueO1[2][0] == 1)
        {
            TextView tv = findViewById(R.id.win);
            tv.append("Winner : O");
            end();

        }
    }

    public void changeprime(Button button, int x, int y)
    {
        if(cover == "X")
        {
            button.setText(cover);
            button.setClickable(false);
            valueX1[x][y] = 1;
            checkX();
            cover = "O";
        }
        else if(cover == "O")
        {
            button.setText(cover);
            button.setClickable(false);
            valueO1[x][y] = 1;
            checkO();
            cover = "X";
        }
        TextView turn_text = findViewById(R.id.turn);
        turn_text.setText(cover);
    }
    public void change0(View view)
    {
        int zero0 = 0, zero1 = 0;
        Button but0 = findViewById(R.id.zero);
        changeprime(but0,zero0,zero1);
    }
    public void change1(View view)
    {
        int zero2 = 0, zero3 = 1;
        Button but1 = findViewById(R.id.one);
        changeprime(but1,zero2,zero3);;
    }
    public void change2(View view)
    {
        int zero4 =0, zero5 =2;
        Button but2 = findViewById(R.id.two);
        changeprime(but2,zero4,zero5);
    }
    public void change3(View view)
    {
        int zero6 =1, zero7 =0;
        Button but3 = findViewById(R.id.three);
        changeprime(but3,zero6,zero7);
    }
    public void change4(View view)
    {
        int zero8 =1, zero9 =1;
        Button but4 = findViewById(R.id.four);
        changeprime(but4,zero8,zero9);
    }
    public void change5(View view)
    {
        int zero10 =1,zero11 =2;
        Button but5 = findViewById(R.id.five);
        changeprime(but5,zero10,zero11);
    }
    public void change6(View view)
    {
        int zero12 =2,zero13 =0;
        Button but6 = findViewById(R.id.six);
        changeprime(but6,zero12,zero13);
    }
    public void change7(View view)
    {
        int zero14 =2, zero15 =1;
        Button but7 = findViewById(R.id.seven);
        changeprime(but7,zero14,zero15);
    }
    public void change8(View view)
    {
        int zero16 =2, zero17 =2;
        Button but8 = findViewById(R.id.eight);
        changeprime(but8,zero16,zero17);
    }

    public void reset(View view)
    {
        TextView tv1 = findViewById(R.id.win);
        Button but3 = findViewById(R.id.zero);
        Button but2 = findViewById(R.id.one);
        Button but1 = findViewById(R.id.two);
        Button but0 = findViewById(R.id.three);
        Button but4 = findViewById(R.id.four);
        Button but5 = findViewById(R.id.five);
        Button but6 = findViewById(R.id.six);
        Button but7 = findViewById(R.id.seven);
        Button but8 = findViewById(R.id.eight);

        tv1.setText(null);
        but0.setText(null);
        but1.setText(null);
        but2.setText(null);
        but3.setText(null);
        but4.setText(null);
        but5.setText(null);
        but6.setText(null);
        but7.setText(null);
        but8.setText(null);
        but0.setClickable(true);
        but1.setClickable(true);
        but2.setClickable(true);
        but3.setClickable(true);
        but4.setClickable(true);
        but5.setClickable(true);
        but6.setClickable(true);
        but7.setClickable(true);
        but8.setClickable(true);

        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<=2; j++)
            {
                valueO1[i][j] = 0;
                valueX1[i][j] = 0;
            }
        }
    }

    public void end()
    {
        Button but3 = findViewById(R.id.zero);
        Button but2 = findViewById(R.id.one);
        Button but1 = findViewById(R.id.two);
        Button but0 = findViewById(R.id.three);
        Button but4 = findViewById(R.id.four);
        Button but5 = findViewById(R.id.five);
        Button but6 = findViewById(R.id.six);
        Button but7 = findViewById(R.id.seven);
        Button but8 = findViewById(R.id.eight);

        but0.setClickable(false);
        but1.setClickable(false);
        but2.setClickable(false);
        but3.setClickable(false);
        but4.setClickable(false);
        but5.setClickable(false);
        but6.setClickable(false);
        but7.setClickable(false);
        but8.setClickable(false);
        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<=2; j++)
            {
                valueO1[i][j] = 0;
                valueX1[i][j] = 0;
            }
        }
    }

}
