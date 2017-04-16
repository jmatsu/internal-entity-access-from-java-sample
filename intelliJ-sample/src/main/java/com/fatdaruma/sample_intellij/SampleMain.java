package com.fatdaruma.sample_intellij;

public class SampleMain {
    public static void main(String[] args) {
        InternalSample sample = new InternalSample();

        // Java can access
        sample.publicMethod();

        // Java can access
        sample.protectedMethod();

        // Java can see a method below from IntelliJ, but it causes an compile error due to missing method
        sample.internalMethod$production_sources_for_module_intelliJ_sample_main();

        // Java cannot see a method below from both of IntelliJ and javac
        sample.internalMethod();
    }
}

