package ex02;

public class UsersArrayList implements UsersList {
    private User[] array = new User[10];
    private static Integer i = 0;

    public UsersArrayList () {

    }

    public User[] SizeArray (User[] array) {
        User[] arrayNew = new User[array.length * 2];
        Integer j = 0;

        while (array.length != 0 & j < array.length) {
            arrayNew[j] = array[j];
            j++;
        }
        return (arrayNew);
    }

    @Override
    public void UserAdd(User name) {
        Integer flag = 0;
        if (i >= array.length)
            array = SizeArray(array);
        while (i < array.length & flag == 0) {
            array[i] = name;
            flag = 1;
            i++;
        }
    }

    public User userRetID (Integer id) throws UserNotFoundException {
        for (Integer j = 0; j < array.length; j++) {
            if (array[j].getIdentifier() == id)
                return (array[j]);
        }
        throw new UserNotFoundException();
    }


    public User userRetIndex (Integer index) {
        for (Integer j = 0; j < array.length - 1; j++) {
            if (array[j] == array[index])
                return (array[j]);
        }
        return null;
    }

    public Integer numUsersRet () {
        Integer count = 0;
        for (Integer i = 0; i < array.length - 1; i++)
            if (array[i] != array[i + 1]) count++;
        return (count);
    }
}
