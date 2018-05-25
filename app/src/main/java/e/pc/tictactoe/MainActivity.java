package e.pc.tictactoe;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton imageOne;
    ImageButton imageTwo;
    ImageButton imageThree;
    ImageButton imageFour;
    ImageButton imageFive;
    ImageButton imageSix;
    ImageButton imageSeven;
    ImageButton imageEight;
    ImageButton imageNine;
    TextView youTurn;
    Button clickRes;

    ImageView imagePlayerOne;
    ImageView imagePlayerTwo;

    byte currentPlayer = 1;

    byte howBlock =0;

    byte blockOne =0;
    byte blockTwo =0;
    byte blockThree =0;
    byte blockFour =0;
    byte blockFive =0;
    byte blockSix =0;
    byte blockSeven =0;
    byte blockEight =0;
    byte blockNine =0;

    Drawable backOne;
    Drawable backTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageOne = findViewById(R.id.imageOne);
        imageTwo = findViewById(R.id.imageTwo);
        imageThree = findViewById(R.id.imageThree);
        imageFour = findViewById(R.id.imageFour);
        imageFive = findViewById(R.id.imageFive);
        imageSix = findViewById(R.id.imageSix);
        imageSeven = findViewById(R.id.imageSeven);
        imageEight = findViewById(R.id.imageEight);
        imageNine = findViewById(R.id.imageNine);
        youTurn = findViewById(R.id.youTurn);
        imagePlayerOne = findViewById(R.id.imagePlayerOne);
        imagePlayerTwo = findViewById(R.id.imagePlayerTwo);
        clickRes = findViewById(R.id.clickRes);
        backOne = imagePlayerOne.getBackground();
        backTwo = imagePlayerTwo.getBackground();

        youTurn.setText(String.valueOf("Player 1"));


        imageOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                howBlock=1;
                ruleBlock(howBlock);
            }
        });
        imageTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                howBlock=2;
                ruleBlock(howBlock);
            }
        });imageThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                howBlock=3;
                ruleBlock(howBlock);
            }
        });imageFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                howBlock=4;
                ruleBlock(howBlock);
            }
        });imageFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                howBlock=5;
                ruleBlock(howBlock);
            }
        });imageSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                howBlock=6;
                ruleBlock(howBlock);
            }
        });imageSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                howBlock=7;
                ruleBlock(howBlock);
            }
        });imageEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                howBlock=8;
                ruleBlock(howBlock);
            }
        });imageNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                howBlock=9;
                ruleBlock(howBlock);
            }
        });

        clickRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getReset();
            }
        });

    }

    public void rulePLayer(byte player){
        switch(player)
        {
            case 1:
                currentPlayer=2;
                youTurn.setText(String.valueOf("Player 2"));
                break;
            case 2:
                currentPlayer=1;
                youTurn.setText(String.valueOf("Player 1"));
                break;
        }
    }

    public void ruleBlock(byte howBlock)
    {
        switch(howBlock)
        {
            case 1:
                if(blockOne==0)
                {
                    if(currentPlayer==1)
                    {
                        imageOne.setBackground(backOne);
                        blockOne=1;
                    }
                    else
                    {
                        imageOne.setBackground(backTwo);
                        blockOne=2;
                    }
                    rulePLayer(currentPlayer);
                }
                break;
            case 2:
                if(blockTwo==0)
                {
                    if(currentPlayer==1)
                    {
                        imageTwo.setBackground(backOne);
                        blockTwo=1;
                    }
                    else
                    {
                        imageTwo.setBackground(backTwo);
                        blockTwo=2;
                    }
                    rulePLayer(currentPlayer);
                }
                break;
            case 3:
                if(blockThree==0)
                {
                    if(currentPlayer==1)
                    {
                        imageThree.setBackground(backOne);
                        blockThree=1;
                    }
                    else
                    {
                        imageThree.setBackground(backTwo);
                        blockThree=2;
                    }
                    rulePLayer(currentPlayer);
                }
                break;
            case 4:
                if(blockFour==0)
                {
                    if(currentPlayer==1)
                    {
                        imageFour.setBackground(backOne);
                        blockFour=1;
                    }
                    else
                    {
                        imageFour.setBackground(backTwo);
                        blockFour=2;
                    }
                    rulePLayer(currentPlayer);
                }
                break;
            case 5:
                if(blockFive==0)
                {
                    if(currentPlayer==1)
                    {
                        imageFive.setBackground(backOne);
                        blockFive=1;
                    }
                    else
                    {
                        imageFive.setBackground(backTwo);
                        blockFive=2;
                    }
                    rulePLayer(currentPlayer);
                }
                break;
            case 6:
                if(blockSix==0)
                {
                    if(currentPlayer==1)
                    {
                        imageSix.setBackground(backOne);
                        blockSix=1;
                    }
                    else
                    {
                        imageSix.setBackground(backTwo);
                        blockSix=2;
                    }
                    rulePLayer(currentPlayer);
                }
                break;
            case 7:
                if(blockSeven==0)
                {
                    if(currentPlayer==1)
                    {
                        imageSeven.setBackground(backOne);
                        blockSeven=1;
                    }
                    else
                    {
                        imageSeven.setBackground(backTwo);
                        blockSeven=2;
                    }
                    rulePLayer(currentPlayer);
                }
                break;
            case 8:
                if(blockEight==0)
                {
                    if(currentPlayer==1)
                    {
                        imageEight.setBackground(backOne);
                        blockEight=1;
                    }
                    else
                    {
                        imageEight.setBackground(backTwo);
                        blockEight=2;
                    }
                    rulePLayer(currentPlayer);
                }
                break;
            case 9:
                if(blockNine==0)
                {
                    if(currentPlayer==1)
                    {
                        imageNine.setBackground(backOne);
                        blockNine=1;
                    }
                    else
                    {
                        imageNine.setBackground(backTwo);
                        blockNine=2;
                    }
                    rulePLayer(currentPlayer);
                }
                break;
        }
        checkWin();
    }

    public void checkWin()
    {
        if((blockOne==blockTwo && blockOne==blockThree && blockOne!=0)||(blockOne==blockFour && blockOne==blockSeven && blockOne!=0)||(blockOne==blockFive && blockOne==blockNine && blockOne!=0))
        {
            getWon(blockOne);
        }
        else{
            if((blockThree==blockSix && blockNine==blockThree && blockThree!=0)||(blockThree==blockFive && blockThree==blockSeven && blockThree!=0))
            {
                getWon(blockThree);
            }
            else
            {
                if((blockSeven==blockEight && blockSeven==blockNine && blockSeven!=0))
                {
                    getWon(blockSeven);
                }
                else
                {
                    if((blockTwo==blockFive && blockTwo==blockEight && blockTwo!=0) || (blockFour==blockFive && blockFour==blockSix && blockFour!=0))
                    {
                        getWon(blockFive);
                    }
                    else
                    {
                        if(blockOne!=0 &&
                                blockTwo!=0 &&
                                blockThree!=0 &&
                                blockFour!=0 &&
                                blockFive!=0 &&
                                blockSix!=0 &&
                                blockSeven!=0 &&
                                blockEight!=0 &&
                                blockNine!=0)
                        {
                            getWon(3);
                        }
                    }
                }
            }
        }
    }

    public void getWon(int winning)
    {
        switch (winning)
        {
            case 1:
                youTurn.setText(String.valueOf("Player 1 Won!"));
                imagePlayerOne.setVisibility(View.VISIBLE);
                break;
            case 2:
                youTurn.setText(String.valueOf("Player 2 Won!"));
                imagePlayerTwo.setVisibility(View.VISIBLE);
                break;
            case 3:
                youTurn.setText(String.valueOf("REMIS!"));
                break;
        }
        imageOne.setEnabled(false);
        imageTwo.setEnabled(false);
        imageThree.setEnabled(false);
        imageFour.setEnabled(false);
        imageFive.setEnabled(false);
        imageSix.setEnabled(false);
        imageSeven.setEnabled(false);
        imageEight.setEnabled(false);
        imageNine.setEnabled(false);
        clickRes.setVisibility(View.VISIBLE);
    }

    public void getReset(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
