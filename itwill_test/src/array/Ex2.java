package array;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {

		int [] arr = {10,20,30};
		
		int [] arr2 = new int[arr.length +1];
		for(int i=0; i<arr.length; i++)
		{
			arr2[i]=arr[i];
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		ArrayList list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println("리스트 요소 : " + list.get(i));
		}
		list.add(1, 40);
		for(int i=0;i<list.size();i++)
		{
			System.out.println("추가 리스트 요소 : " + list.get(i));
		}
		
		int [] aArr = {10,20};
		int [] bArr = {30,40};
		
		aArr = bArr;
		
		for(int i=0; i<aArr.length; i++)
		{
			
			System.out.println(aArr[i]);
		}
		
		System.out.println(aArr);
		System.out.println(bArr);
		
		
	}

}
