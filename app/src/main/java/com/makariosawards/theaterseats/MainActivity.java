package com.makariosawards.theaterseats;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Row A seats
    Button a1, a2, a3 ,a4, a5, a6;
    boolean a1Clicked = false, a2Clicked = false, a3Clicked = false, a4Clicked = false, a5Clicked = false, a6Clicked = false;

    // Row C seats
    Button c8, c9, c11, c12;
    boolean c8Clicked = false, c9Clicked = false, c11Clicked = false, c12Clicked = false;

    // Row E seats
    Button e8, e9, e10, e11, e12, e13;
    boolean e8Clicked = false, e9Clicked = false, e10Clicked = false, e11Clicked = false, e12Clicked = false, e13Clicked = false;
    // Row F seats
    Button f8, f9, f10, f11,  f12, f13;
    boolean f8Clicked = false, f9Clicked = false, f10Clicked = false, f11Clicked = false, f12Clicked = false, f13Clicked = false;

    // Row H seats
    Button h2, h3, h4, h5;
    boolean h2Clicked = false, h3Clicked = false, h4Clicked = false, h5Clicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);
        a5 = findViewById(R.id.a5);
        a6 = findViewById(R.id.a6);

        a1.setBackgroundColor(Color.GREEN);
        a2.setBackgroundColor(Color.GREEN);
        a3.setBackgroundColor(Color.GREEN);
        a4.setBackgroundColor(Color.GREEN);
        a5.setBackgroundColor(Color.GREEN);
        a6.setBackgroundColor(Color.GREEN);


        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a1Clicked == false) {
                    a1.setBackgroundColor(Color.RED);
                    a1Clicked = true;
                } else {
                    a1.setBackgroundColor(Color.GREEN);
                    a1Clicked = false;
                }
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a2Clicked == false) {
                    a2.setBackgroundColor(Color.RED);
                    a2Clicked = true;
                } else {
                    a2.setBackgroundColor(Color.GREEN);
                    a2Clicked = false;
                }
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a3Clicked == false) {
                    a3.setBackgroundColor(Color.RED);
                    a3Clicked = true;
                } else {
                    a3.setBackgroundColor(Color.GREEN);
                    a3Clicked = false;
                }
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a4Clicked == false) {
                    a4.setBackgroundColor(Color.RED);
                    a4Clicked = true;
                } else {
                    a4.setBackgroundColor(Color.GREEN);
                    a4Clicked = false;
                }
            }
        });

        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a5Clicked == false) {
                    a5.setBackgroundColor(Color.RED);
                    a5Clicked = true;
                } else {
                    a5.setBackgroundColor(Color.GREEN);
                    a5Clicked = false;
                }
            }
        });

        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a6Clicked == false) {
                    a6.setBackgroundColor(Color.RED);
                    a6Clicked = true;
                } else {
                    a6.setBackgroundColor(Color.GREEN);
                    a6Clicked = false;
                }
            }
        });

        c8 = findViewById(R.id.c8);
        c9 = findViewById(R.id.c9);
        c11 = findViewById(R.id.c11);
        c12 = findViewById(R.id.c12);

        c8.setBackgroundColor(Color.GREEN);
        c9.setBackgroundColor(Color.GREEN);
        c11.setBackgroundColor(Color.GREEN);
        c12.setBackgroundColor(Color.GREEN);

        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a5Clicked == false) {
                    c8.setBackgroundColor(Color.RED);
                    c8Clicked = true;
                } else {
                    c8.setBackgroundColor(Color.GREEN);
                    c8Clicked = false;
                }
            }
        });

        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c9Clicked == false) {
                    c9.setBackgroundColor(Color.RED);
                    c9Clicked = true;
                } else {
                    c9.setBackgroundColor(Color.GREEN);
                    c9Clicked = false;
                }

            }
        });

        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c11Clicked == false) {
                    c11.setBackgroundColor(Color.RED);
                    c11Clicked = true;
                } else {
                    c11.setBackgroundColor(Color.GREEN);
                    c11Clicked = false;
                }
            }
        });

        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c12Clicked == false) {
                    c12.setBackgroundColor(Color.RED);
                    c12Clicked = true;
                } else {
                    c12.setBackgroundColor(Color.GREEN);
                    c12Clicked = false;
                }
            }
        });

        e8 = findViewById(R.id.e8);
        e9 = findViewById(R.id.e9);
        e10 = findViewById(R.id.e10);
        e11 = findViewById(R.id.e11);
        e12 = findViewById(R.id.e12);
        e13 = findViewById(R.id.e13);

        e8.setBackgroundColor(Color.GREEN);
        e9.setBackgroundColor(Color.GREEN);
        e10.setBackgroundColor(Color.GREEN);
        e11.setBackgroundColor(Color.GREEN);
        e12.setBackgroundColor(Color.GREEN);
        e13.setBackgroundColor(Color.GREEN);

        e8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e8Clicked == false) {
                    e8.setBackgroundColor(Color.RED);
                    e8Clicked = true;
                } else {
                    e8.setBackgroundColor(Color.GREEN);
                    e8Clicked = false;
                }
            }
        });

        e9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e9Clicked == false) {
                    e9.setBackgroundColor(Color.RED);
                    e9Clicked = true;
                } else {
                    e9.setBackgroundColor(Color.GREEN);
                    e9Clicked = false;
                }
            }
        });

        e10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e10Clicked == false) {
                    e10.setBackgroundColor(Color.RED);
                    e10Clicked = true;
                } else {
                    e10.setBackgroundColor(Color.GREEN);
                    e10Clicked = false;
                }
            }
        });

        e11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e11Clicked == false) {
                    e11.setBackgroundColor(Color.RED);
                    e11Clicked = true;
                } else {
                    e11.setBackgroundColor(Color.GREEN);
                    e11Clicked = false;
                }
            }
        });

        e12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e12Clicked == false) {
                    e12.setBackgroundColor(Color.RED);
                    e12Clicked = true;
                } else {
                    e12.setBackgroundColor(Color.GREEN);
                    e12Clicked = false;
                }
            }
        });

        e13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e13Clicked == false) {
                    e13.setBackgroundColor(Color.RED);
                    e13Clicked = true;
                } else {
                    e13.setBackgroundColor(Color.GREEN);
                    e13Clicked = false;
                }
            }
        });

        f8 = findViewById(R.id.f8);
        f9 = findViewById(R.id.f9);
        f10 = findViewById(R.id.f10);
        f11 = findViewById(R.id.f11);
        f12 = findViewById(R.id.f12);
        f13 = findViewById(R.id.f13);

        f8.setBackgroundColor(Color.GREEN);
        f9.setBackgroundColor(Color.GREEN);
        f10.setBackgroundColor(Color.GREEN);
        f11.setBackgroundColor(Color.GREEN);
        f12.setBackgroundColor(Color.GREEN);
        f13.setBackgroundColor(Color.GREEN);

        f8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f8Clicked == false) {
                    f8.setBackgroundColor(Color.RED);
                    f8Clicked = true;
                } else {
                    f8.setBackgroundColor(Color.GREEN);
                    f8Clicked = false;
                }
            }
        });

        f9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f9Clicked == false) {
                    f9.setBackgroundColor(Color.RED);
                    f9Clicked = true;
                } else {
                    f9.setBackgroundColor(Color.GREEN);
                    f9Clicked = false;
                }
            }
        });

        f10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f10Clicked == false) {
                    f10.setBackgroundColor(Color.RED);
                    f10Clicked = true;
                } else {
                    f10.setBackgroundColor(Color.GREEN);
                    f10Clicked = false;
                }
            }
        });

        f11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f11Clicked == false) {
                    f11.setBackgroundColor(Color.RED);
                    f11Clicked = true;
                } else {
                    f11.setBackgroundColor(Color.GREEN);
                    f11Clicked = false;
                }
            }
        });

        f12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f12Clicked == false) {
                    f12.setBackgroundColor(Color.RED);
                    f12Clicked = true;
                } else {
                    f12.setBackgroundColor(Color.GREEN);
                    f12Clicked = false;
                }
            }
        });

        f13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f13Clicked == false) {
                    f13.setBackgroundColor(Color.RED);
                    f13Clicked = true;
                } else {
                    f13.setBackgroundColor(Color.GREEN);
                    f13Clicked = false;
                }
            }
        });

        h2 = findViewById(R.id.h2);
        h3 = findViewById(R.id.h3);
        h4 = findViewById(R.id.h4);
        h5 = findViewById(R.id.h5);

        h2.setBackgroundColor(Color.GREEN);
        h3.setBackgroundColor(Color.GREEN);
        h4.setBackgroundColor(Color.GREEN);
        h5.setBackgroundColor(Color.GREEN);

        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (h2Clicked == false) {
                    h2.setBackgroundColor(Color.RED);
                    h2Clicked = true;
                } else {
                    h2.setBackgroundColor(Color.GREEN);
                    h2Clicked = false;
                }
            }
        });

        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (h3Clicked == false) {
                    h3.setBackgroundColor(Color.RED);
                    h3Clicked = true;
                } else {
                    h3.setBackgroundColor(Color.GREEN);
                    h3Clicked = false;
                }
            }
        });

        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (h4Clicked == false) {
                    h4.setBackgroundColor(Color.RED);
                    h4Clicked = true;
                } else {
                    h4.setBackgroundColor(Color.GREEN);
                    h4Clicked = false;
                }
            }
        });

        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (h5Clicked == false) {
                    h5.setBackgroundColor(Color.RED);
                    h5Clicked = true;
                } else {
                    h5.setBackgroundColor(Color.GREEN);
                    h5Clicked = false;
                }
            }
        });


















    }
}
