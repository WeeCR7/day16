package cn.bgi.test;

import java.sql.SQLException;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;

public class StudentDao {
	public static void main(String[] args) {

		try {
			// 增
			Db.use().insert(Entity.create("t_student").set("name", "unitTestUser").set("age", 66));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
