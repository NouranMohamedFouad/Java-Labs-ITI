package packageLibrary;

public class Client
{
        private int id;
        private String name;
        private String email;
  
        public Client(int id,String name,String email)
        {
            this.id=id;
            this.name=name;
            this.email=email;
        }
        public int getId()
        {
            return id;
        }

        public void getClientDetails()
        {
            System.out.println("Id: "+id);
            System.out.println("Name:  "+name);
            System.out.println("Email: "+email);
        }

}
