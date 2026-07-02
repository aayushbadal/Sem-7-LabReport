// Lab-5 : Database Connectivity
//1. Write a Java Console program to perform CRUD operation on database [Database: Company Table: Employee(EID, Name, Address, And Salary)]
package Lab5;
import java.sql.*;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) throws Exception{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Company", "root", "");
       Scanner sc = new Scanner(System.in);
       int choice;
       do{
           System.out.println("------CRUD Operations------------");
           System.out.println("1. Insert");
           System.out.println("2. Display");
           System.out.println("3. Update");
           System.out.println("4. Delete");
           System.out.println("5. Exit");
           System.out.println("Enter Your Choice");
           choice = sc.nextInt();
           
           switch(choice){
               case 1:
                   System.out.println("\n Choice is Insert\n-----------------");
                   System.out.println("Enter Employee ID:");
                   int id = sc.nextInt();
                   
                   System.out.println("Enter Employee Name:");
                   String name = sc.next();
                   
                   System.out.println("Enter Employee Address:");
                   String addr = sc.next();
                   
                   System.out.println("Enter Employee Salary:");
                   double sal = sc.nextDouble();
                   
                   String isql = "insert into Employee values(?, ?, ?, ?)";
                   PreparedStatement ps = con.prepareStatement(isql);
                   ps.setInt(1, id);
                   ps.setString(2,name);
                   ps.setString(3, addr);
                   ps.setDouble(4, sal);
                   
                   int row = ps.executeUpdate();
                    if(row>0)
                        System.out.println("Data Inserted Successfully.");
                    else
                        System.out.println("Error in Insertion.");
                    break;
                    
                    
               case 2:
                   System.out.println("\nChoice is Display\n---------------");
                    String sql = "select * from Employee";

                    PreparedStatement ps1 = con.prepareStatement(sql);
                    ResultSet rs = ps1.executeQuery();
                    System.out.println("EID\t\tName\t\tAddress\t\tSalary");
                    while (rs.next())
                        System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) +"\t\t"+ rs.getDouble(4));

                    break;
                    
               case 3:
                   System.out.println("\n Choice is Update\n-----------------");
                   System.out.println("Enter Employee ID that you want to update:");
                   int uid = sc.nextInt();
                   
                   System.out.println("Enter Employee New Name:");
                   String uname = sc.next();
                   
                   System.out.println("Enter Employee New Address:");
                   String uaddr = sc.next();
                   
                   System.out.println("Enter Employee New Salary:");
                   double usal = sc.nextDouble();
                   
                   String usql = "update Employee set Name = ?, Address = ?, Salary = ? where ID = ?";
                   PreparedStatement ps2 = con.prepareStatement(usql);
                   ps2.setString(1, uname);
                   ps2.setString(2, uaddr);
                   ps2.setDouble(3, usal);
                   ps2.setInt(4, uid);
                   int urow = ps2.executeUpdate();
                    if (urow > 0)
                        System.out.println(urow + " row Updated.");
                    else
                        System.out.println("Error in update.");
                    break;
                    
               case 4:
                   System.out.println("\n Choice is Delete\n-----------------");
                   System.out.println("Enter Employee ID that you want to delete:");
                   int did = sc.nextInt();
                   
                   String dsql ="delete from Employee where ID = ?";
                    PreparedStatement ps3 = con.prepareStatement(dsql);
                    ps3.setInt(1,did);
                    int drow = ps3.executeUpdate();
                    if (drow > 0)
                        System.out.println(drow + " row deleted.");
                    else
                        System.out.println("Error in delete.");
                    break;
                    
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");


                   
           }
       }while(choice != 5);
        con.close();
        
    }
    
}