package com.example.project.Interfaces;

import java.util.ArrayList;

public interface IProfileToMain {
    void connectToSpotifyButtonClicked();
    ArrayList<String> getTopTenSongs();
    void logoutButtonClicked();
    void profileAvatarClicked();
    void editProfileButtonClicked();
}
