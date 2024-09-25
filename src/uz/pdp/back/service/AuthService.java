package uz.pdp.back.service;

import uz.pdp.back.model.User;
import uz.pdp.back.payloads.LoginDto;
import uz.pdp.back.payloads.RegisterDto;

public interface AuthService {

    Integer register(RegisterDto dto);

    Integer login(LoginDto dto);

    User getUserById(int id);

}
