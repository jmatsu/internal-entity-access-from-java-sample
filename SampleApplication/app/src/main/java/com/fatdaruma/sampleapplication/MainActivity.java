package com.fatdaruma.sampleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InternalSample sample = new InternalSample();

        sample.publicMethod();
        sample.protectedMethod();
        sample.internalMethod$production_sources_for_module_app();
    }
}
