package com.orion.emotionrecognition.classifiers.behaviors;

public interface ClassifyBehavior {
    float[][] classify(float[] input);
}
