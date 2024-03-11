package 6;

import java.util.List;

public interface UserView<T extends User> {
    
    void sendOnConsole(Iterable<T> iterable); 
}