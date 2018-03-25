abstract class User{
  String name;
  String emailid;
  String mobileno;
  String gender;
  String billingaddress;
  String shippingaddress;
  private String loginid;
  private String password;
   
  public String getLoginid(){
    return loginid;
  }
  
  public String getPassword(){
    return "Its called 'password' for a reason";
  }
    
  public User(String name,String email,String mobile,String gender,String billingadd,String shippingadd,String loginid, String password){
    this.name=name;
    this.emailid=email;
    this.mobileno=mobile;
    this.gender=gender;
    this.billingaddress=billingadd;
    this.shippingaddress=shippingadd;
    this.loginid=loginid;
    this.password=password;
  }
  
  public void printUserDetails(){
    System.out.println("User Details are as follows:\n Name: " +name+";\n Email: " + emailid+";\n Mobile no: "+mobileno+";\n Gender: "+gender+";\n Billing Address: "+billingaddress+"\n Shipping Address: "+shippingaddress);
  }
}

  public class AmazonUser extends User{ 
    public AmazonUser(String name,String email,String mobile,String gender,String billingadd,String shippingadd,String loginid, String password){
    super(name,email,mobile,gender,billingadd,shippingadd,loginid,password); 
  }
        
  public static void main(String[]args){ 
    AmazonUser user1=new AmazonUser("Madhu","rmadhu.837@gmail.com","8114367666","Female","Odisha","RJY","MadhuR","madhu13"); 
    user1.printUserDetails(); 
    System.out.println(" UserID: "+user1.getLoginid());  
    System.out.println(" Password: "+user1.getPassword());
  }
}


