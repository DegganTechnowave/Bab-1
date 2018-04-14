import java.io.*;

public class Bab1{
    
    //Variabel Global
    public  static String id;
    
    public static void main(String[] args){
        
        //BufferedReader
        BufferedReader brid = new BufferedReader(new InputStreamReader(System.in));
        
        BufferedReader brpw = new BufferedReader(new InputStreamReader(System.in));
        
       //try and Cacth
       try{
        
        System.out.print("Masukkan ID anda : "); 
        id = brid.readLine();
        
        System.out.print("Masukkan Password anda : "); 
        String pass = brid.readLine();
           
        if (id.isEmpty()||pass.isEmpty()){
            System.out.println("Harap isi field yang kosong");
        } else if(id.equals("admin")&&pass.equals("123")){
            method();
        }
        else{
          System.out.println("ID atau Password salah");
        }
           
       }catch(IOException e){
          System.out.println("Error "+e);
       }
        
        

    }
    
    public static void method(){
        System.out.println("Selamat datang "+id);
    }
    
}