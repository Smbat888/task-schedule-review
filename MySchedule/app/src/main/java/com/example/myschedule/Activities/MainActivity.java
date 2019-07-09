package com.example.myschedule.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.myschedule.R;

public class MainActivity extends AppCompatActivity {

    // xi chen private ???

    ImageView imageView;
    Animation top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.top_img);
        top = AnimationUtils.loadAnimation(this, R.anim.style);
        imageView.setAnimation(top);

// eli en thread-i teman!!! handler ogtagorceq, kam executor!!
        // kkardaq dranq, vorna karum UI update ani ira takic, vory che, ev ayln....

        new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }).start();
    }
}
