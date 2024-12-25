package packageLibrary;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends LibraryItem> 
{
    private List<T> items;
    private List<Client>  clients;
    //////////////////////////////
    public Library() 
    {
        this.items = new ArrayList<>();
        this.clients = new ArrayList<>();
    }
    ///////////////////////////////
    public boolean isItemIdUnique(int id) throws CustomException
    {
      for(int i=0;i<items.size();i++)
      {
        if (items.get(i).getId() == id) 
        {
            throw new CustomException("Item with this ID is already exists,please enter another ID");
        }
     }
     return true;
    }
    ///////////////////////////////
    public boolean isClientIdUnique(int id) throws CustomException
    {
      for(int i=0;i<clients.size();i++)
      {
        if (clients.get(i).getId()==id) 
        {
            throw new CustomException("Client with this ID is already exists,please enter another ID");
        }
     }
     return true;
    }
    ///////////////////////////////
    public void addItem(T item)
    {
        try
        {
            if(isItemIdUnique(item.getId()))
            {
                items.add(item);
                System.out.println("Item is added successfully");
            } 
        }   
        catch (CustomException e) 
        {
           System.err.println(e.getMessage());
        }
        
    }
    ///////////////////////////////
    public T getItemById(int id) throws CustomException
    {
        for(int i=0;i<items.size();i++)
        {
            if (items.get(i).getId() == id) 
            {
                  System.out.println(items.get(i).getItemDetails());  
                  return items.get(i);
            }
        }
        throw new CustomException("Item with this ID is not found.");
    }
    /////////////////////////////
    public void displayBooks()
    {
        for(int i=0;i<items.size();i++)
        {
             if (items.get(i) instanceof Book) 
             {
                System.out.println(items.get(i).getItemDetails());
            }
        }
    }
    /////////////////////////////
    public void displayMagazines()
    {
        for(int i=0;i<items.size();i++)
        {
             if (items.get(i) instanceof Magazine ) {
            System.out.println(items.get(i).getItemDetails());
            }

        }
    }
    /////////////////////////////
     public void deleteItem(int id) 
     {
        try
        {
          T item = getItemById(id);
          items.remove(item);
          System.out.println("Item deleted successfully: " + item.getItemDetails());
        } 
        catch (CustomException e) 
        {
           System.err.println(e.getMessage());
        }
       
    }
    ///////////////////////////////
    public void addClient(Client c)
    {
        try
        {
            if(isClientIdUnique(c.getId()))
            {
                clients.add(c);
                System.out.println("Client is added successfully");
            } 
        }   
        catch (CustomException e) 
        {
           System.err.println(e.getMessage());
        }
        
    } 
    /////////////////////////////// 
    public Client getClientById(int id) throws CustomException  
    {
        for(int i=0;i<clients.size();i++){
            if (clients.get(i).getId() == id) 
            {
                  clients.get(i).getClientDetails();  
                  return clients.get(i);
            }
        }
        throw new CustomException("Client with this ID is not found.");
    }
    /////////////////////////////
    public void displayClients()
    {
        for(int i=0;i<clients.size();i++)
        {
            clients.get(i).getClientDetails();
        }
    }
    /////////////////////////////
     public void deleteClient(int id)
     {
        try
        {
          Client client = getClientById(id);
          clients.remove(client);
          System.out.println("client deleted successfully: " );
          client.getClientDetails();
        } 
        catch (CustomException e) 
        {
           System.err.println(e.getMessage());
        }
    }
    
}

