package com.example.navdrawerexample.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<String>> mList;

    public GalleryViewModel() {
        mList = new MutableLiveData<>();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aaaaa");
        strings.add("bbbbb");
        strings.add("ccccc");
        strings.add("ddddd");
        strings.add("eeeee");
        mList.setValue(strings);
    }

    public LiveData<ArrayList<String>> getList() {
        return mList;
    }
}