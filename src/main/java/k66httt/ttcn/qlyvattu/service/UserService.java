package k66httt.ttcn.qlyvattu.service;

import k66httt.ttcn.qlyvattu.entity.User;
import k66httt.ttcn.qlyvattu.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
