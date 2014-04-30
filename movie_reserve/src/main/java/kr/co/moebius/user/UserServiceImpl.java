package kr.co.moebius.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public void registUser(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub
		userMapper.registUser(userVO);
	}
}
