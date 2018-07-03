
package com.example.hp.review;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        LinearLayout gallery = (LinearLayout)findViewById(R.id.gallery);

        LayoutInflater inf = LayoutInflater.from(this);

        for (int i = 0; i < 50; i++) {
            View v = inf.inflate(R.layout.item, gallery, false);
            ImageView actor = v.findViewById(R.id.actor);
            actor.setImageResource(R.mipmap.ic_launcher_round);
            TextView actname = v.findViewById(R.id.actname);
            actname.setText("name" + i);

            gallery.addView(v);

        }
    }
}
