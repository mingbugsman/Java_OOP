package FriendOOP;

import java.util.ArrayList;

public class MyFriend implements IListFriendManager {
    private final ArrayList<Friend> ListFriend;
    public MyFriend() {
        // initialize empty list array
        this.ListFriend = new ArrayList<>();
    }
    public void AddFriend(Friend newFriend) {
        this.ListFriend.add(newFriend);
    }
    public ArrayList<Friend> getAllFriends() {
        return this.ListFriend;
    }
    public Friend getFriend(int ID) {

        return ListFriend.stream()
                .filter(friend ->
                        friend.getIDFriend() == ID).findFirst().orElse(null);

    }

    public void UpdateFriend(Friend updateFriend,int IdFriend) {
        Friend existingFriend = getFriend(IdFriend);
        if (existingFriend != null) {
            existingFriend.setName(updateFriend.getName());
            existingFriend.setAge(updateFriend.getAge()) ;
            existingFriend.setNickname(updateFriend.getNickname());
        } else {
            System.out.println("khong ton tai nguoi ban co ma ID nay");
        }
    }

    public void RemoveFriend(int ID) {
        Friend existingFriend = getFriend(ID);
        if (existingFriend != null) {
            this.ListFriend.remove(existingFriend);
        } else {
            System.out.println("khong ton tai nguoi ban co ma ID nay");
        }

    }
    public void display() {
        if (ListFriend.isEmpty()) {
            System.out.println("No friends available.");
            return;
        }

        for (Friend friend : ListFriend) {
            System.out.println("ID: " + friend.getIDFriend() +
                    ", Name: " + friend.getName() +
                    ", Age: " + friend.getAge() +
                    ", Nickname: " + friend.getNickname());
        }
    }

}
