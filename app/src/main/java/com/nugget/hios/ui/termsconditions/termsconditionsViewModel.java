package com.nugget.hios.ui.termsconditions;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class termsconditionsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public termsconditionsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}