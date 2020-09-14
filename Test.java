import java.sql.*;

public class Test {
    public static void main(String[] args){
         String url="jdbc:postgresql://127.0.0.1:5432/postgres";
         String user="postgres";
         String pass="23012002vkvk";
         Connection connection=null;

         Group group=new Group();

        try {
            Class.forName("org.postgresql.Driver");
             connection= DriverManager.getConnection(url,user,pass);

            Statement statement=connection.createStatement();
            ResultSet   result=statement.executeQuery("SELECT  groups.id,students.name FROM groups INNER JOIN students ON groups.id = students.group_id\n ");
            int i=0;
            while (result.next()){
               group.id=result.getInt("id");
               group.name=result.getString("name");
              System.out.println(group.toString());

            }
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
