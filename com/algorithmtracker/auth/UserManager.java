package com.algorithmtracker.auth;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Manages user authentication, registration, and session management.
 */
public class UserManager {
    private Map<String, User> users;
    private User currentUser;
    private final String USER_DATA_FILE = "users.dat";
    
    /**
     * Constructs a new UserManager and loads existing user data.
     */
    public UserManager() {
        users = new HashMap<>();
        loadUsers();
    }
    
    /**
     * Registers a new user.
     * 
     * @param username The username
     * @param password The password
     * @param email The email address
     * @param fullName The full name
     * @return true if registration is successful, false otherwise
     */
    public boolean registerUser(String username, String password, String email, String fullName) {
        // Check if username already exists
        if (users.containsKey(username)) {
            return false;
        }
        
        // Create new user
        User newUser = new User(username, password, email, fullName);
        users.put(username, newUser);
        
        // Save users to file
        saveUsers();
        
        return true;
    }
    
    /**
     * Authenticates a user.
     * 
     * @param username The username
     * @param password The password
     * @return true if authentication is successful, false otherwise
     */
    public boolean login(String username, String password) {
        User user = users.get(username);
        
        if (user != null && user.getPassword().equals(password)) {
            currentUser = user;
            return true;
        }
        
        return false;
    }
    
    /**
     * Logs out the current user.
     */
    public void logout() {
        currentUser = null;
    }
    
    /**
     * Gets the current logged-in user.
     * 
     * @return The current user, or null if no user is logged in
     */
    public User getCurrentUser() {
        return currentUser;
    }
    
    /**
     * Checks if a user is currently logged in.
     * 
     * @return true if a user is logged in, false otherwise
     */
    public boolean isLoggedIn() {
        return currentUser != null;
    }
    
    /**
     * Loads user data from file.
     */
    @SuppressWarnings("unchecked")
    private void loadUsers() {
        try {
            if (Files.exists(Paths.get(USER_DATA_FILE))) {
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(USER_DATA_FILE))) {
                    users = (Map<String, User>) ois.readObject();
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading user data: " + e.getMessage());
            users = new HashMap<>();
        }
    }
    
    /**
     * Saves user data to file.
     */
    private void saveUsers() {
        try {
            // Create directory if it doesn't exist
            File directory = new File(USER_DATA_FILE).getParentFile();
            if (directory != null && !directory.exists()) {
                directory.mkdirs();
            }
            
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(USER_DATA_FILE))) {
                oos.writeObject(users);
            }
        } catch (IOException e) {
            System.err.println("Error saving user data: " + e.getMessage());
        }
    }
    
    /**
     * Gets the number of registered users.
     * 
     * @return The number of users
     */
    public int getUserCount() {
        return users.size();
    }
}
