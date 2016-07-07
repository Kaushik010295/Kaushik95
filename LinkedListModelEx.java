package com.niit.ShoppingCart;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListModelEx {
	public static void main(String[] args){
		LinkedList<Emp1> list = new LinkedList<Emp1>();
		list.add(new Emp1("Tim",3000));
		list.add(new Emp1("Rim",4000));
		list.add(new Emp1("Jim",8000));
		list.add(new Emp1("Sim",6000));
		
		Collections.sort(list, new MySalaryComp());
		System.out.println("Sorted List");
		for(Emp1 e: list)
		{
			System.out.println(e);
		}
		
	}

}
class MySalaryComp implements Comparator<Emp1>
{
	public int compare(Emp1 e1, Emp1 e2)
	{
		if(e1.getSalary()<e2.getSalary())
		{
			return 1;
		}
		return -1;
	}
}
class Emp1
{
	private String name;
	private int salary;
	public Emp1(String n,int s)
	{
		this.name=n;
		this.salary=s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString()
	{
		return "Name:" + this.name + "--Salary: " + this.salary;
	}
}