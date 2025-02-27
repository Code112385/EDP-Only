/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UserData {

    private static final int maxUsers = 3;
    private static final ArrayList<User> users = new ArrayList<>();

    public UserData() {
        Users();
    }

    private void Users() {
        //users.add(new User("senju", "senju123"));
    }

    public boolean loginUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Message", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // add new user
    public void addUser(String username, String password) {

        if (users.size() >= maxUsers) {
            JOptionPane.showMessageDialog(null, "User limit reached. Cannot register more users.", "Message", JOptionPane.ERROR_MESSAGE);
        } else {
            users.add(new User(username, password));
            JOptionPane.showMessageDialog(null, "sign-up successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(users.size());
        }
    }

    // Check if user exists
    public boolean isUserExists(String username) {
        return users.stream().anyMatch(user -> user.getUsername().equals(username));
    }
}
