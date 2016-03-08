package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by ricardo on 08/03/16.
 */
public class Crime {
    private UUID id;

    public UUID getId() {
        return id;
    }

    private String title;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Crime() {
        id = UUID.randomUUID();
    }

}
