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
}