package com.example.showmethelistmvvm.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.showmethelistmvvm.model.Person;
import com.example.showmethelistmvvm.repository.Repository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    // Declare Repo
    private Repository repo;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        // Initialize Repo
        repo = Repository.getInstance();
    }

    // Method to getData( List<Person> )
    public List<Person> getData() {
        return repo.getData();
    }
}