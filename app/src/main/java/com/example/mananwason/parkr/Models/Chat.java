package com.example.mananwason.parkr.Models;

/**
 * Created by mananwason on 7/25/17.
 */

public class Chat {
    private String mName;
    private String mMessage;
    private String mUid;

    public Chat() {
        // Needed for Firebase
    }

    public Chat(String name, String uid, String message) {
        mName = name;
        mMessage = message;
        mUid = uid;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public String getUid() {
        return mUid;
    }

    public void setUid(String uid) {
        mUid = uid;
    }
}