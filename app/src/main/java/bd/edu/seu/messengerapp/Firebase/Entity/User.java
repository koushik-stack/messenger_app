package bd.edu.seu.messengerapp.Firebase.Entity;

public class User {
    String userName, password, userId, email, profilePic, lastMessage,token;
    String about = "";

    public User() {
    }

    public User(String userName, String password, String userId, String email, String profilePic, String lastMessage) {
        this.userName = userName;
        this.password = password;
        this.userId = userId;
        this.email = email;
        this.profilePic = profilePic;
        this.lastMessage = lastMessage;
    }

    public User(String userName, String email, String password) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public User(String userName, String password, String userId, String email, String profilePic, String lastMessage, String about) {
        this.userName = userName;
        this.password = password;
        this.userId = userId;
        this.email = email;
        this.profilePic = profilePic;
        this.lastMessage = lastMessage;
        this.about = about;
    }

    public User(String userName, String password, String userId, String email, String profilePic, String lastMessage, String token, String about) {
        this.userName = userName;
        this.password = password;
        this.userId = userId;
        this.email = email;
        this.profilePic = profilePic;
        this.lastMessage = lastMessage;
        this.token = token;
        this.about = about;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
