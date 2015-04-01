/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.project.assignment;

public class ListHouse implements Listable 
{
    private int lotNumber;
    private String firstName;
    private String lastName;
    private Double price;
    private int squareFeet;
    private int  bedRooms;
    
    //Initial variables with defalut contuctor
    public ListHouse()
    {
     this.lotNumber = 0;
     this.firstName = "";
     this.lastName = "";
     this.price = 0.00;
     this.squareFeet = 0;
     this.bedRooms = 0;
    }
    
    //Initial variables with  parameterized constructor
     public ListHouse(int lotNumber,String firstName,String lastName,Double price,int squareFeet,int  bedRooms)
    {
     this.lotNumber = lotNumber;
     this.firstName = firstName;
     this.lastName = lastName;
     this.price = price;
     this.squareFeet = squareFeet;
     this.bedRooms = bedRooms;
    }
     
     //Declare Set Methods
     public void setlotNumber(int lotNumber){this.lotNumber = lotNumber;}
     public void setfirstName(String firstName){this.firstName = firstName;}
     public void setlastName(String lastName){this.lastName = lastName;}
     public void setPrice(Double price){this.price = price;}
     public void setsquareFeet(int squareFeet){this.squareFeet = squareFeet;}
     public void setbedRooms(int bedRooms){this.bedRooms = bedRooms;}
     
     //Declare Get Methods
     public int getlotNumber(){return this.lotNumber; }
     public String getfirstName(){return this.firstName;}
     public String getlastName(){return this.lastName;}
     public Double getPrice(){return this.price;}
     public int getsquareFeet(){return this.squareFeet;}
     public int getbedRooms(){return this.bedRooms;}

     //Get new instance from ListHouse
    @Override
    public Listable copy() {
        return new ListHouse(this.lotNumber, this.firstName,this.lastName, this.price, this.squareFeet, this.bedRooms);
    }

    
    @Override
    public int compareTo(Listable listable) {
       return (this.lotNumber - ((ListHouse)listable).lotNumber);
    }
     
     
}