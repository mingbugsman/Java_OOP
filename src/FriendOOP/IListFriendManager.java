package FriendOOP;

import java.util.ArrayList;

public interface IListFriendManager {
    public ArrayList<Friend> getAllFriends();
    public Friend getFriend(int ID);
    public void UpdateFriend(Friend updateFriend, int IdFriend);
    public void RemoveFriend(int ID);
    public void AddFriend(Friend newFriend);
}
