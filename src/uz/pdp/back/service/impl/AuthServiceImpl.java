package uz.pdp.back.service.impl;

import homework2.NoFoundNumberException;
import uz.pdp.back.Exeptions.UserNotfoundException;
import uz.pdp.back.model.User;
import uz.pdp.back.payloads.LoginDto;
import uz.pdp.back.payloads.RegisterDto;
import uz.pdp.back.service.AuthService;

public class AuthServiceImpl implements AuthService {
    private AuthServiceImpl() {}
    private static final AuthService instance = new AuthServiceImpl();
    public static AuthService getInstance() {return instance;}

    private static final User[] USERS = new User[50];

    @Override
    public Integer register(RegisterDto dto) {

        if (existsByUsername(dto.username())) {
            System.out.println("User already exists");
            return null;
        }
        // check password

        User user = new User();
        user.setName(dto.name());
        user.setUsername(dto.username());
        user.setPassword(dto.password());

        int index = findEmptyIndex();
        USERS[index] = user;
        return user.getId();
    }

    @Override
    public Integer login(LoginDto dto) {
        User user = findUserByUsername(dto.username());
        try{
            if (user == null) {
                throw new UserNotfoundException("User is  not found");
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("User not found");
            return null;
        }

        if (!user.getPassword().equals(dto.password())) {
            System.out.println("Wrong password");
            return null;
        }
        return user.getId();
    }

    @Override
    public User getUserById(int id) {
        for (User user : USERS) {
            if (user != null && user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    private boolean existsByUsername(String username) {
        return findUserByUsername(username) != null;
    }


    private int getValidElementsCounts() {
        int index = findEmptyIndex();
        return index == -1 ? USERS.length : index;
    }

    private int findEmptyIndex(){
        for (int i = 0; i < USERS.length; i++) {
            if (USERS[i] == null)
                return i;
        }
        return -1;
    }

    private User findUserByUsername(String username) {
        for (User user : USERS) {
            if (user != null && user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
