package com.algorithmtracker.auth;

import java.io.Serializable;

/**
 * Represents a user in the system.
 * Stores user credentials and profile information.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String username;
    private String password;
    private String email;
    private String fullName;
    
    /**
     * Constructs a new user with the specified credentials.
     * 
     * @param username The username
     * @param password The password
     * @param email The email address
     * @param fullName The full name
     */
    public User(String username, String password, String email, String fullName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.fullName = fullName;
    }
    
    /**
     * Gets the username.
     * 
     * @return The username
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * Gets the password.
     * 
     * @return The password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Gets the email address.
     * 
     * @return The email address
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Gets the full name.
     * 
     * @return The full name
     */
    public String getFullName() {
        return fullName;
    }
    
    /**
     * Sets the password.
     * 
     * @param password The new password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Sets the email address.
     * 
     * @param email The new email address
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Sets the full name.
     * 
     * @param fullName The new full name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    @Override
    public String toString() {
        return "User [username=" + username + ", email=" + email + ", fullName=" + fullName + "]";
    }

    public void setUsername(String username2) {
        throw new UnsupportedOperationException("Unimplemented method 'setUsername'");
    }
}
