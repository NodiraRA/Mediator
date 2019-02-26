/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author nodira
 */
public class SimpleChatRunner {

    
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        
        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");
        
        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user1);
        
        user1.sendMessage("Hello, I am User 1 !!!");
        admin.sendMessage("Roger that, I am admin!");
        
    }
    
}
