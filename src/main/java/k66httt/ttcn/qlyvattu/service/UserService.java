package k66httt.ttcn.qlyvattu.service;

import k66httt.ttcn.qlyvattu.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
