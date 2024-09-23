package layer_wise_architecture_JDBC_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import layer_wise_architecture_JDBC_bean.StudentBean;

public class StudentDAO {
	                       //  1  srinithya 92  A
	public int addStudent(StudentBean studentBean)
	{
		Connection con = null;
		  PreparedStatement pstmt = null;
		try
	  	{
		  con=StudentDB.getConnection();  		 		  
		  String ins_str ="insert into Student values(?,?,?,?)";
		  pstmt = con.prepareStatement(ins_str);
		  pstmt.setInt(1,studentBean.getStudentID());
		  pstmt.setString(2,studentBean.getStudentName());
		  pstmt.setFloat(3,studentBean.getMarks());
		  pstmt.setString(4,studentBean.getGrade());
		  int updateCount = pstmt.executeUpdate();
		  con.close();
		  return updateCount;
	  	}
	  catch(Exception ex)
	  {
		  System.out.println(ex.toString());
		  return 0;
	  }  
  }
  
}