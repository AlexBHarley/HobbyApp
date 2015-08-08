package sot.hobbyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Craig on 8/08/2015.
 */
//linux test 3
public class HobbyActivity extends Activity{
    HobbyClass hobbyName = new HobbyClass();
    List<Object> information = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobby);
        Intent hobby_name = getIntent();
        hobbyName.setName(hobby_name.getStringExtra("hobby_name"));
        HobbyObject PaddleBoard = new HobbyObject();
        HobbyObject Paddle = new HobbyObject();
        HobbyObject Leash = new HobbyObject();

        PaddleBoard.setNameOne("Starboard Atlas Paddle");
        PaddleBoard.setPriceOne("from $899");
        PaddleBoard.setImageOne();
        PaddleBoard.setNameTwo("Skull Paddleboard");
        PaddleBoard.setPriceTwo("from $1299");
        PaddleBoard.setImageTwo();

        Paddle.setNameOne("Bote Axe Paddle");
        Paddle.setPriceOne("from $499");
        Paddle.setImageOne();
        Paddle.setNameTwo("Pacific Paddle");
        Paddle.setPriceTwo("from $299");
        Paddle.setImageTwo();

        Leash.setNameOne("Keeper Combo Kit");
        Leash.setPriceOne("from $29");
        Leash.setImageOne();
        Leash.setNameTwo("SUP Surf Leash");
        Leash.setPriceTwo("from $49");
        Leash.setImageTwo();

        information.add(hobbyName);
        information.add(PaddleBoard);
        information.add(Paddle);
        information.add(Leash);

    }
}
