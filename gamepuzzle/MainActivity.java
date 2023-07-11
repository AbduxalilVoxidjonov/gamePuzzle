package com.example.gamepuzzle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity{
    private ImageView imageView1,imageView2,imageView3,imageView7;
    private ImageView imageView4,imageView5,imageView6,imageView8;
    private ImageView imageView9,imageView10,imageView11,imageView12;
    private Integer[] cardsArray={1,2,3,4,5,6,11,12,13,14,15,16};
    int image1,image2,image3,image4,image5,image6,image7,image8,image9,image10,
            image11,image12;
    private int[] res = {R.drawable.image1, R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,
            R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.image10,R.drawable.image11,R.drawable.image12};
    int firstCard, secondCard;
    int clickedFirst,clickedSecond;
    int cardNumber=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findui();

        setTags();

        setImages();

        Collections.shuffle(Arrays.asList(cardsArray));

        imageView1.setOnClickListener(view -> {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuf(imageView1,theCard);
        });
        imageView2.setOnClickListener(view -> {
               int theCard=Integer.parseInt((String) view.getTag());
               doStuf(imageView2,theCard);
        });
        imageView3.setOnClickListener(view -> {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuf(imageView3,theCard);
        });
        imageView4.setOnClickListener(view -> {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuf(imageView4,theCard);
        });
        imageView5.setOnClickListener(view -> {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuf(imageView5,theCard);
        });
        imageView6.setOnClickListener(view -> {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuf(imageView6,theCard);
        });
        imageView7.setOnClickListener(view -> {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuf(imageView7,theCard);

        });
        imageView8.setOnClickListener(view -> {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuf(imageView8,theCard);
        });
        imageView9.setOnClickListener(view -> {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuf(imageView9,theCard);

        });
        imageView10.setOnClickListener(view -> {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuf(imageView10,theCard);
        });
        imageView11.setOnClickListener(view -> {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuf(imageView11,theCard);
        });
        imageView12.setOnClickListener(view -> {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuf(imageView12,theCard);
        });
    }

    private  void doStuf(ImageView img,int card){
        if (cardsArray[card]==1){
            img.setImageResource(image1);
        }else if(cardsArray[card]==2){
            img.setImageResource(image2);
        }else if(cardsArray[card]==3){
            img.setImageResource(image3);
        }else if(cardsArray[card]==4){
            img.setImageResource(image4);
        }else if(cardsArray[card]==5){
            img.setImageResource(image5);
        }else if(cardsArray[card]==6){
            img.setImageResource(image6);
        }else if(cardsArray[card]==11){
            img.setImageResource(image7);
        }else if(cardsArray[card]==12){
            img.setImageResource(image8);
        }else if(cardsArray[card]==13){
            img.setImageResource(image9);
        }else if(cardsArray[card]==14){
            img.setImageResource(image10);
        }else if(cardsArray[card]==15){
            img.setImageResource(image11);
        }else if(cardsArray[card]==16){
            img.setImageResource(image12);
        }

        if(cardNumber==1){
            firstCard=cardsArray[card];
            if (firstCard>10){
                 firstCard=firstCard-10;
            }
            cardNumber=2;
            clickedFirst=card;
            img.setEnabled(false);
        }else if (cardNumber==2){
            secondCard=cardsArray[card];
            if (secondCard>10){
                secondCard=secondCard-10;
            }
            cardNumber=1;
            clickedSecond=card;

            imageView1.setEnabled(false);
            imageView2.setEnabled(false);
            imageView3.setEnabled(false);
            imageView4.setEnabled(false);
            imageView5.setEnabled(false);
            imageView6.setEnabled(false);
            imageView7.setEnabled(false);
            imageView8.setEnabled(false);
            imageView9.setEnabled(false);
            imageView10.setEnabled(false);
            imageView11.setEnabled(false);
            imageView12.setEnabled(false);

            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            },1000);
        }
    }

    private void calculate() {
        if (firstCard == secondCard) {
            if (clickedFirst == 0) {
                imageView1.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                imageView2.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                imageView3.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                imageView4.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                imageView5.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                imageView6.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 6) {
                imageView7.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 7) {
                imageView8.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 8) {
                imageView9.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 9) {
                imageView10.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 10) {
                imageView11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 11) {
                imageView12.setVisibility(View.INVISIBLE);
            }


            if (clickedSecond == 0) {
                imageView1.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 1) {
                imageView2.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 2) {
                imageView3.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 3) {
                imageView4.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 4) {
                imageView5.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 5) {
                imageView6.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 6) {
                imageView7.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 7) {
                imageView8.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 8) {
                imageView9.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 9) {
                imageView10.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 10) {
                imageView11.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 11) {
                imageView12.setVisibility(View.INVISIBLE);
            }



        } else {
            imageView1.setImageResource(R.drawable.imgback);
            imageView2.setImageResource(R.drawable.imgback);
            imageView3.setImageResource(R.drawable.imgback);
            imageView4.setImageResource(R.drawable.imgback);
            imageView5.setImageResource(R.drawable.imgback);
            imageView6.setImageResource(R.drawable.imgback);
            imageView7.setImageResource(R.drawable.imgback);
            imageView8.setImageResource(R.drawable.imgback);
            imageView9.setImageResource(R.drawable.imgback);
            imageView10.setImageResource(R.drawable.imgback);
            imageView11.setImageResource(R.drawable.imgback);
            imageView12.setImageResource(R.drawable.imgback);
        }

        imageView1.setEnabled(true);
        imageView2.setEnabled(true);
        imageView3.setEnabled(true);
        imageView4.setEnabled(true);
        imageView5.setEnabled(true);
        imageView6.setEnabled(true);
        imageView7.setEnabled(true);
        imageView8.setEnabled(true);
        imageView9.setEnabled(true);
        imageView10.setEnabled(true);
        imageView11.setEnabled(true);
        imageView12.setEnabled(true);


        checkEnd();
    }

    private void checkEnd() {
        if (imageView1.getVisibility()==View.INVISIBLE &&
                imageView2.getVisibility()==View.INVISIBLE &&
                imageView3.getVisibility()==View.INVISIBLE &&
                imageView4.getVisibility()==View.INVISIBLE &&
                imageView5.getVisibility()==View.INVISIBLE &&
                imageView6.getVisibility()==View.INVISIBLE &&
                imageView7.getVisibility()==View.INVISIBLE &&
                imageView8.getVisibility()==View.INVISIBLE &&
                imageView9.getVisibility()==View.INVISIBLE &&
                imageView10.getVisibility()==View.INVISIBLE &&
                imageView11.getVisibility()==View.INVISIBLE &&
                imageView12.getVisibility()==View.INVISIBLE){
            AlertDialog.Builder alertDialog= new AlertDialog.Builder(MainActivity.this);
            alertDialog.setCancelable(false)
                    .setPositiveButton("New", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Exit",new DialogInterface.OnClickListener(){

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog1=alertDialog.create();
            alertDialog1.show();
        }
    }

    private void setImages() {
       image1=R.drawable.image1;
       image2=R.drawable.image2;
       image3=R.drawable.image3;
       image4=R.drawable.image4;
       image5=R.drawable.image5;
       image6=R.drawable.image6;
       image7=R.drawable.image7;
       image8=R.drawable.image8;
       image9=R.drawable.image9;
       image10=R.drawable.image10;
       image11=R.drawable.image11;
       image12=R.drawable.image12;
    }

    private void setTags() {
        imageView1.setTag("0");
        imageView2.setTag("1");
        imageView3.setTag("2");
        imageView4.setTag("3");
        imageView5.setTag("4");
        imageView6.setTag("5");
        imageView7.setTag("6");
        imageView8.setTag("7");
        imageView9.setTag("8");
        imageView10.setTag("9");
        imageView11.setTag("10");
        imageView12.setTag("11");
    }

    private void findui() {
        imageView1=findViewById(R.id.img1);
        imageView2=findViewById(R.id.img2);
        imageView3=findViewById(R.id.img3);
        imageView4=findViewById(R.id.img4);
        imageView5=findViewById(R.id.img5);
        imageView6=findViewById(R.id.img6);
        imageView7=findViewById(R.id.img7);
        imageView8=findViewById(R.id.img8);
        imageView9=findViewById(R.id.img9);
        imageView10=findViewById(R.id.img10);
        imageView11=findViewById(R.id.img11);
        imageView12=findViewById(R.id.img12);
    }

}