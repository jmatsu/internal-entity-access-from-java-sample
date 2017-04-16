package com.fatdaruma.sampleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InternalSample sample = new InternalSample();

        // Java can access
        sample.publicMethod();

        // Java can access
        sample.protectedMethod();

        // Java can see a method below from AndroidStudio, but it causes an compile error due to missing method
        sample.internalMethod$production_sources_for_module_app();

        // Java cannot see a method below from both of AndroidStudio and javac
        sample.internalMethod();
    }
}
