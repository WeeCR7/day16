package cn.bgi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bgi.mapper.UserMapper;
import cn.bgi.pojo.User;
import cn.bgi.pojo.UserInfo;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public User findUser(String username, String password) {
		return userMapper.findUser(username, password);
	}
	public int insertUser(User user) {
		return userMapper.insertUser(user);
	}

	public List<Object> findUserInfo(String name) {
		return userMapper.findUserInfo(name);
	}
	public int deleteUser(Integer id) {
		return userMapper.deleteUser(id);
	}
	public List<Object>findUserInfoByPage(Integer page,Integer rows){
		return userMapper.findUserInfoByPage(page, rows);
	}
	public int findAllUserInfo(){
		return userMapper.findAllUserInfo();
	}
	public int insertUserInfo(UserInfo userInfo) {
		return userMapper.insertUserInfo(userInfo);
	}
	public UserInfo findPersonInfoById(Integer u_id) {
		return userMapper.findPersonInfoById(u_id);
	}
	public int updateUserInfo(UserInfo userInfo) {
		return userMapper.updatePersonInfo(userInfo);
	}
	public int updatePWD(User user) {
		return userMapper.updatePWD(user);
	}
	public User findUserByUserName(String username) {
		return userMapper.findUserByUserName(username);
	}
	public int countUserIdByName(String username) {
		return userMapper.countUserIdByName(username);
	}
}
