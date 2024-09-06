package com.nugget.hios.ui.ordering;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class orderingViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public orderingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Never Gonna Give You Up");
    }

    public LiveData<String> getText() {
        return mText;
    }
}