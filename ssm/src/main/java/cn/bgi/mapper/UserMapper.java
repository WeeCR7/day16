package cn.bgi.mapper;

import java.util.List;

import cn.bgi.pojo.User;
import cn.bgi.pojo.UserInfo;

public interface UserMapper {
	public User findUser(String username,String password);
	//public UserInfo findUserInfoByName(String name);
	public List<Object>findUserInfo(String name);
	public int deleteUser(Integer id);
	public int insertUser(User user);
	public List<Object>findUserInfoByPage(Integer page,Integer rows);
	public int findAllUserInfo();
	public int insertUserInfo(UserInfo userInfo);
	public UserInfo findPersonInfoById(Integer u_id);
	public int updatePersonInfo(UserInfo userInfo);
	public int updatePWD(User user);
	public User findUserByUserName(String username);
	public int countUserIdByName(String username);
}
