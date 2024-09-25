package QueueImplemitatsiya.Lesson6Misol2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class User {



        String name;
        String phone;

        public User(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "User{name='" + name + "', phone='" + phone + "'}";
        }
    }

