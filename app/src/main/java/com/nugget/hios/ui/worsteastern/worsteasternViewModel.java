package com.nugget.hios.ui.worsteastern;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class worsteasternViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public worsteasternViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}