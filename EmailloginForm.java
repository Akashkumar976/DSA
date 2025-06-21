public class EmailloginForm {
    public static void main(String[] args) {
        Account ac=new Account();
        ac.setPassword("Akash");
        String pass=ac.getPassword();
        System.out.println(pass);
    }
    
    
}
class Account{
        protected String pass;
        protected void setPassword(String p)
        {
            this.pass=p;
        }
        public String getPassword(){
            return this.pass;
        }
    }
