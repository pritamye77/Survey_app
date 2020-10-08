package com.example.surveyapp.application;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class QuestionnaireApp extends Application
{
    private static QuestionnaireApp sInstance;

    public static synchronized QuestionnaireApp getInstance()
    {
        return sInstance;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();

        sInstance = this;

        Stetho.initializeWithDefaults(this);
    }
}
