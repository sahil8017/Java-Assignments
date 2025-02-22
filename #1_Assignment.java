/*
W.A.P which prints the following information about at least 5 persons:
    NAME MAIL_ID EMPLOYEE_CODE PHONE
    
    Eg. Parul parul@csc p03161 25764728
        Sonia sonia@csc p03160 25764730
    
    Each entry should be on a seperate line.     
*/
class Information{
  String name, mail_id, emp_code, phone;

  public static void main(String[] args){
    Information inf1 = new Information();
    inf1.name = "Sahil Gupta";
    inf1.mail_id = "sahilgupta4oct@gmail.com";
    inf1.emp_code = "p03161";
    inf1.phone = "25764728";
    System.out.println(inf1.name + " " + inf1.mail_id + " " + inf1.emp_code + " " + inf1.phone);
  }
}  
