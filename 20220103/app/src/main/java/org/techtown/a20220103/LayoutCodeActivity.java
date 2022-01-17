package org.techtown.a20220103;

import android.os.Bundle;

public class LayoutCodeActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
        Button button1  =new Butto(this);
        button1.setText("Button1");
        button1.setLayoutParams(params);
        mainLayout.addView(button1);
        setContentView(R.layout.activity_main);
    }
}

