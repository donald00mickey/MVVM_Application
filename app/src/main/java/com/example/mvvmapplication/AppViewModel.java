package com.example.mvvmapplication;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AppViewModel extends ViewModel {

    MutableLiveData<String> mutableLiveData = new MutableLiveData<> ();

    public MyModel getMeName(){
        return new MyModel ( "Hii Piyush Here" );
    }

    public void getMeNewName(){
        String name = getMeName ().getName ();
        mutableLiveData.setValue ( name );
    }
}
