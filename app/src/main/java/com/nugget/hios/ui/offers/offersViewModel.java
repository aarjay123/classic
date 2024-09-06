package com.nugget.hios.ui.offers;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class offersViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public offersViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Never Gonna Give You Up");
    }

    public LiveData<String> getText() {
        return mText;
    }
}