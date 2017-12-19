package lab.mvc.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class UserFunctions {
	
	public void insertUser(ModelUser user) {
        // 用户注册方法
        UsualFunctions dbcon = new UsualFunctions();
        Connection conn = null;
        Statement sta = null;
        
        try {
            conn = dbcon.initDB();
            sta = conn.createStatement();
    		String sql = ("insert into UserInfo(email,password,firstName,lastName,tel)value('"+user.getEmail()+"','"+user.getPassword()+"','"+user.getFirstName()+"','"+user.getLastName()+"','"+user.getTel()+"')");
    		System.out.println("data inserted");
            

            sta.executeUpdate(sql);
        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            // 执行完关闭数据库
            dbcon.closeDB(sta, conn);
        }
        
        
        
	}
	
	
	public ModelUser judgeUserPassword(String email, String password) {
		UsualFunctions dbcon = new UsualFunctions();
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        ModelUser user = null;
        
        try{
        	
        	conn = dbcon.initDB();
            sta = conn.createStatement();
            System.out.println(email);
            System.out.println(password);
            String sql = "SELECT * FROM UserInfo WHERE email = '"+ email + "' AND password= '" + password + "'";
            rs = sta.executeQuery(sql);
            
            while (rs.next()) {
            	
            	user = new ModelUser();
            	user.setEmail(rs.getString("email"));
            	user.setPassword(rs.getString("password"));
            	System.out.println("user exist");

            }

//            if (rs.next()) {
//            	System.out.println("user exist");
//            	user = new UserInfo();
//            	user.setEmail(rs.getString("email"));
//            	user.setPassword(rs.getString("password"));
//
//            }else{
//            	System.out.println("user don't exist");
//            }
        	
        }catch(SQLException e){
        	e.printStackTrace();
        }finally {
            // 执行完关闭数据库
            dbcon.closeDB(rs,sta, conn);
        }

		return user;
		
	}
	
	
	
	
	


}
