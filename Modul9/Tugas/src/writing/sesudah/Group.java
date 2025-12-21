package writing.sesudah;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {
    public List getUsersSortedByMostRecentlyRegistered() {
        List users = new ArrayList();
        if (!userDirectoryExists()) return users;
        addFoundUsersTo(users);
        sortByMostRecentlyRegistered(users);
        return users;
    }

    private void sortByMostRecentlyRegistered(List users) {
    }

    private void addFoundUsersTo(List users) {
    }

    private boolean userDirectoryExists() {
        return false;
    }
}