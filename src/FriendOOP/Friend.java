package FriendOOP;

public class Friend {
    private int IDFriend;
    static public int numberIncre = 0;
    private String Name;
    private int age;
    private String nickname;
    public Friend(String name, int age) {
        this.IDFriend = numberIncre++;
        this.Name  = name;
        this.age = age;
        Setnickname(name);

    }
    private void Setnickname(String name) {
        String[] list = name.split(" ");
        String ans = "";
        for (String s : list) {
            ans+=(s.charAt(0));
        }
        this.nickname = ans;
    }
    // Getter và setter cho các thuộc tính
    public int getIDFriend() {
        return IDFriend;
    }

    public void setIDFriend(int IDFriend) {
        this.IDFriend = IDFriend;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
