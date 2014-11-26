package message;

import java.io.Serializable;

/**
 * This class can be used as serializable object between the client and the
 * server in chat program.
 * 
 * @author Ohjelmistokehitys
 * @version 0.0.1
 */
public class ChatMessage implements Serializable {
    
    private String userName;
    private String chatMessage;
    private String messageColor;
    private int fontSize;
    private boolean isPrivate;
    private String privateName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        // lisää esim poikkeuksen palautus, jos yrittää tyhjää nimeä
        this.userName = userName;
    }

    public String getChatMessage() {
        return chatMessage;
    }

    public void setChatMessage(String chatMessage) {
        this.chatMessage = chatMessage;
    }

    public String getMessageColor() {
        return messageColor;
    }

    public void setMessageColor(String messageColor) {
        this.messageColor = messageColor;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public boolean isIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }
    
    
}
