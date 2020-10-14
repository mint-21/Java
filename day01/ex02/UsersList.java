package ex02;

public interface UsersList {
    public void UserAdd(User name);
    public User userRetID(Integer id) throws UserNotFoundException;
    public User userRetIndex(Integer index);
    public Integer numUsersRet();
}
