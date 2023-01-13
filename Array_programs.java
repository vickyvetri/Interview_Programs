package Programs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_programs obj = new Array_programs();
//		obj.Array_Declaration();
//		obj.Printing_Array();
//		obj.Printing_in_reverse_order();
//		obj.Linear_Search(11);
//		obj.Finding_index_of_given_number(16);
//		obj.Removing_given_number_from_an_array(4);
//		obj.Placing_given_number_in_last_index_of_given_array(12);
//		obj.Placing_given_number_in_last_index_of_Another_array(13);
//		obj.how_many_times_a_given_element_is_present('h');
//		obj.Finding_biggest_no_in_given_array();
//		obj.Finding_smallest_no_in_given_array();
//		obj.Finding_first_two_biggest_numbers_in_a_given_array();
//		obj.Finding_first_two_smallest_numbers_in_a_given_array();
//		obj.Finding_addition_of_odd_index_numbers_in_a_given_array();
//		int Ar[] = {12,11,9,8,7,4};
//		obj.Moving_all_elements_towards_left_in_a_given_array(Ar);
//		obj.Moving_all_elements_towards_left_twice_in_a_given_array(Ar);
//		obj.Moving_all_elements_towards_right_in_a_given_array(Ar);
//		obj.Moving_all_elements_towards_right_twice_in_a_given_array(Ar);
//		obj.Copying_the_given_array_to_another_array_in_reverse_order(Ar);
//		obj.Addition_of_two_integer_arrays();
//		obj.Addition_of_two_integer_arrays2();
//		obj.Finding_only_negative_numbers_in_given_array();
//		obj.Finding_only_negative_numbers_in_given_array_to_store_another_array();
//		obj.Finding_only_odd_index_numbers_in_given_array_to_store_another_array();
//		obj.Printing_values_between_adjacent_two_elements_in_a_given_array();
//		obj.Sum_values_between_adjacent_two_elements_in_a_given_array();
//		obj.Concatination_of_two_integer_arrays_Store_in_Another_Arrray();
//		obj.find_first_repeated_element_in_an_array();
//		obj.find_first_non_repeated_element_in_an_array();
//		obj.Sum_of_2_elements_in_a_single_array_corresponding_to_10();
//		obj.Divide_all_elements_an_array_3_and_store_in_same_array(); 
//		obj.Multiply_any_two_elements_an_array_and_check_corresponds_20();
//		obj.Split_an_array_one_to_store_only_odd_numbers();
//		obj.Split_an_array_one_to_store_only_even_numbers();
//		System.out.println(obj.Prime_Number(5));
//		obj.Check_if_any_elements_in_an_array_are_prime_numbers();
//		System.out.println(obj.Perfect_Number(6));
//		obj.Check_if_any_elements_in_an_array_are_perfect_numbers();
//		obj.Print_odd_elements_present_in_even_index_of_an_array();
//		obj.Print_even_elements_present_in_odd_index_of_an_array();
//		obj.Frequency_of_each_Element_in_Array();
//		obj.Finding_count_of_duplicate_elements_in_a_given_array();
//		obj.Bubble_Sorting();
//		obj.Binary_Search();
	}

	private void Binary_Search() {
		// TODO Auto-generated method stub
		int a[] = {3,7,11,12,18,21,28,32,37,45,49};
		int key = 45;
		int s=0, e=a.length-1; 
		while(s<=e) {  
			int mid = (s+e)/2;  
			if(a[mid]==key) { 
				System.out.println("Got in Position at: "+mid);
				break;
			}
			else if(key<a[mid]) {  
				e = mid-1;      
				}
			else {
				s = mid+1;
			}
		if(s>e) {
			System.out.println("Given Key is Not Present");
		}	
		}
	}

	private void Bubble_Sorting() {
		// TODO Auto-generated method stub
		 int a[] = {21,43,13,87,65,10,15};
		 for(int j=1;j<a.length;j++) {
		 for(int i=0;i<a.length-j;i++) {
			 if(a[i]>a[i+1]) {
				 int temp = a[i];
				 a[i] = a[i+1];
				 a[i+1] = temp;
			 }
		 }
	}
		 System.out.println(Arrays.toString(a));
	}


	private void Finding_count_of_duplicate_elements_in_a_given_array() {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50,10,20,30,40,50,10,20,30,80};
		int freq[] = new int[a.length];
		for(int i=0;i<a.length;i++) {
			int no = a[i];
			int count = 1;
			for(int j=i+1;j<a.length;j++) {
				if(no==a[j]) {
					count++;
					freq[j] = -1;
				}
			}
			if(freq[i]!=-1) {
				freq[i] = count;
				}
		}
		int count=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]<0) {
			 count++;
		}
			}
		System.out.println("Duplicates present in "+count+" times");
	}


	private void Frequency_of_each_Element_in_Array() {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50,10,20,30,40,50,10,20,30,80};
		int freq[] = new int[a.length];
		for(int i=0;i<a.length;i++) {
			int no = a[i];
			int count = 1;
			for(int j=i+1;j<a.length;j++) {
				if(no==a[j]) {
					count++;
					freq[j] = -1;
				}
			}
			if(freq[i]!=-1) {
				freq[i] = count;
				}
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
			System.out.println(a[i]+" at "+freq[i]+" times");
		}
			}
	}


	private void Print_even_elements_present_in_odd_index_of_an_array() {
		// TODO Auto-generated method stub
		int ar[] = {23,6,67,56,28,97,49,12};
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0 && i%2==1) {
				System.out.print(ar[i]+" ");
			}
		}

	}


	private void Print_odd_elements_present_in_even_index_of_an_array() {
		// TODO Auto-generated method stub
		int ar[] = {23,6,67,56,28,97,49,12};
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==1 && i%2==0) {
				System.out.print(ar[i]+" ");
			}
		}
	}


	private void Check_if_any_elements_in_an_array_are_perfect_numbers() {
		// TODO Auto-generated method stub
		int ar[] = {23,6,66,56,28,97,496,12};
		for(int i=0;i<ar.length;i++) {
			int ch = Perfect_Number(ar[i]);
			if(ch>0) {
				System.out.println("Perfect number in Array = "+ar[i]);
			}
		}
	}


	private int Perfect_Number(int div) {
		// TODO Auto-generated method stub
		int i = 1;
		int total = 0;
		while(i<=div/2) {
			if(div%i==0)
				total = total+i;
			i+=1;
		}
		if(total==div) {
			return total;
		}
		else {
		return 0;
		}
	}


	private void Check_if_any_elements_in_an_array_are_prime_numbers() {
		// TODO Auto-generated method stub
		int ar[] = {23,34,66,56,43,97,76,12};
		for(int i=0;i<ar.length;i++) {
			int ch = Prime_Number(ar[i]);
			if(ch>0) {
				System.out.println("Prime number in Array = "+ar[i]);
			}
		}
	}


	private int Prime_Number(int num) {
		// TODO Auto-generated method stub
		int i = 2;
		boolean Check = false;
		while(i<=num/2){
			if(num%i==0) {
				Check = true;
				break;
			}
			i++;
		}
		if(Check==false) {
			return num;
		}
		return 0;
	}



	private void Split_an_array_one_to_store_only_even_numbers() {
		// TODO Auto-generated method stub
		int ar[] = {23,34,66,56,43,97,76,12};
		int len = 0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0){   
				len++;
			}
		}
		int ar2[] = new int[len];
		for(int i=0,j=0;i<ar.length;i++) {
			if(ar[i]%2==0){   
				ar2[j] = ar[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(ar2));
	}


	private void Split_an_array_one_to_store_only_odd_numbers() {
		// TODO Auto-generated method stub
		int ar[] = {23,34,66,56,43,97,76,12};
		int len = 0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==1){   
				len++;
			}
		}
		int ar2[] = new int[len];
		for(int i=0,j=0;i<ar.length;i++) {
			if(ar[i]%2==1){   
				ar2[j] = ar[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(ar2));
	}


	private void Multiply_any_two_elements_an_array_and_check_corresponds_20() {
		// TODO Auto-generated method stub
		int ar[] = {5,4,5,10,2,10,3,10};
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]*ar[i+1]==20) {
				System.out.println(ar[i]+"*"+ar[i+1]+" = 20");
			}
		}
	}


	private void Divide_all_elements_an_array_3_and_store_in_same_array() {
		// TODO Auto-generated method stub
		int ar[] = {3,6,9,12,15,18};
		 for(int i=0;i<ar.length;i++) {
			 ar[i] = ar[i]/3;
			 System.out.print(ar[i]+" ");
		 }
	}


	private void Sum_of_2_elements_in_a_single_array_corresponding_to_10() {
		// TODO Auto-generated method stub
		int ar[] = {10,0,2,8,3,6,4,7,8,2,0};
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]+ar[i+1]==10) {
				System.out.println(ar[i]+"+"+ar[i+1]+" = 10");
			}
		}
	}


	private void find_first_non_repeated_element_in_an_array() {
		// TODO Auto-generated method stub
		char ar[] = {'a','b','c','d','a'};
		for(int j=0;j<ar.length-1;j++) {
		boolean check = false;
		char ch = ar[j];
		for(int i=j+1;i<ar.length;i++) {
			if(ar[i]==ch) {
				 check = true;
				 break;
			}
		}
		if(check==false) {
			System.out.println(ch);
			break;
		}
	}
	}


	private void find_first_repeated_element_in_an_array() {
		// TODO Auto-generated method stub
		char ar[] = {'d','e','e','p','t','h','i'};
		for(int j=0;j<ar.length-1;j++) {
		char ch = ar[j];
		for(int i=j+1;i<ar.length;i++) {
			if(ar[i]==ch) {
				System.out.println("first repeated element in an array is "+ar[i]);
				break;
			}
		}
		}
	}


	private void Concatination_of_two_integer_arrays_Store_in_Another_Arrray() {
		// TODO Auto-generated method stub
		int ar1[] = {1,2,3,4,5};
		int ar2[] = {6,7,8,9,10};
		int ar3[] = new int[ar1.length+ar2.length];
		for(int i=0;i<ar1.length;i++) {
			ar3[i] = ar1[i];
		}
		for(int i=ar1.length,j=0;i<ar3.length;i++,j++) {
			ar3[i] = ar2[j];
		}
		System.out.println(Arrays.toString(ar3));
	}


	private void Sum_values_between_adjacent_two_elements_in_a_given_array() {
		// TODO Auto-generated method stub
		int ar[] = {1,2,3,3,4,5,6,6};
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]==ar[i+1]){
		        System.out.print(ar[i]+ar[i+1]+"\n");
		        }
		}
	}


	private void Printing_values_between_adjacent_two_elements_in_a_given_array() {
		// TODO Auto-generated method stub
		int ar[] = {1,2,3,3,4,5,6,6};
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]==ar[i+1]){
		        System.out.print(ar[i]+" ");
		        System.out.print(ar[i+1]+" ");
		        }
		}
	}


	private void Finding_only_odd_index_numbers_in_given_array_to_store_another_array() {
		// TODO Auto-generated method stub
		int ar[] = {-23,34,-66,56,-43,-97,76,12};
		int len = 0;
		for(int i=0;i<ar.length;i++) {
			if(i%2==1){   
				len++;
			}
		}
		int ar2[] = new int[len];
		for(int i=0,j=0;i<ar.length;i++) {
			if(i%2==1){   
				ar2[j] = ar[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(ar2));
	}


	private void Finding_only_negative_numbers_in_given_array_to_store_another_array() {
		// TODO Auto-generated method stub
		int ar[] = {-23,34,-66,56,-43,-97,76,12};
		int len = 0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<0){   
				len++;
			}
		}
		int ar2[] = new int[len];
		for(int i=0,j=0;i<ar.length;i++) {
			if(ar[i]<0){   
				ar2[j] = ar[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(ar2));
	}


	private void Finding_only_negative_numbers_in_given_array() {
		// TODO Auto-generated method stub
		int ar[] = {23,34,-66,56,43,-97};
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<0){   
				System.out.println(ar[i]+" ");
			}
		}
	}


	private void Addition_of_two_integer_arrays2() {
		// TODO Auto-generated method stub
		int ar1[] = {1,2,3,4,5};
		int ar2[] = {6,7,8};
		int small = ar1.length<ar2.length? ar1.length:ar2.length;
		int big = ar1.length>ar2.length? ar1.length:ar2.length;
		int ar3[] = new int[big];
		for(int i=0;i<small;i++) {
			ar3[i] = ar1[i] + ar2[i];
		}
		for(int j=small;j<big;j++) {
			ar3[j] = ar1[j];
		}
		System.out.println(Arrays.toString(ar3));
	}


	private void Addition_of_two_integer_arrays() {
		// TODO Auto-generated method stub
		int ar1[] = {1,2,3,4,5};
		int ar2[] = {6,7,8,9,10};
		int ar3[] = new int[ar1.length];
		for(int i=0;i<ar3.length;i++) {
			ar3[i] = ar1[i] + ar2[i];
		}
		System.out.println(Arrays.toString(ar3));
	}


	private void Copying_the_given_array_to_another_array_in_reverse_order(int[] ar) {
		// TODO Auto-generated method stub
		int len = ar.length;
		int ar2[] = new int[len];
		for(int i=len-1,j=0;i>=0;i--) {
			ar2[j] = ar[i];
			j++;
		}
		System.out.println(Arrays.toString(ar2));
	}


	private void Moving_all_elements_towards_right_twice_in_a_given_array(int[] ar) {
		// TODO Auto-generated method stub
		int ar2[] = Moving_all_elements_towards_right_in_a_given_array(ar);
		int len = ar2.length; 
		int temp = ar2[len-1]; 	 			
		for(int i=len-1;i>0;i--) {
			ar2[i] = ar2[i-1]; 
		}
		ar2[0] = temp; 
		System.out.println(Arrays.toString(ar2));
	}


	private int[] Moving_all_elements_towards_right_in_a_given_array(int[] ar) {
		// TODO Auto-generated method stub
		int len = ar.length; 
		int temp = ar[len-1]; 	 			
		for(int i=len-1;i>0;i--) {
			ar[i] = ar[i-1]; 
		}
		ar[0] = temp; 
		return ar; 
	}


	private void Moving_all_elements_towards_left_twice_in_a_given_array(int[] ar) {
		// TODO Auto-generated method stub
		int[] Ar2 = Moving_all_elements_towards_left_in_a_given_array(ar);
		int temp = Ar2[0]; 
		int len = Ar2.length;				
		for(int i=0;i<Ar2.length-1;i++) {
			Ar2[i] = Ar2[i+1];
		}
		Ar2[len-1] = temp;
		System.out.println(Arrays.toString(Ar2));
	}


	private int[] Moving_all_elements_towards_left_in_a_given_array(int[] Array) {
		// TODO Auto-generated method stub
		int temp = Array[0]; 
		int len = Array.length;				
		for(int i=0;i<Array.length-1;i++) {
			Array[i] = Array[i+1];
		}
		Array[len-1] = temp;
		return Array;
	}
		 


	private void Finding_addition_of_odd_index_numbers_in_a_given_array() {
		// TODO Auto-generated method stub
		int Array[] = {12,11,123,9,1,21,982,5};
		int total = 0;
		for(int i=0;i<Array.length;i++) {
			if(i%2==1) {
				total = Array[i] + total;
			}
		}
		System.out.println("Addition of odd index numbers in a given array is "+total);
	}



	private void Finding_first_two_smallest_numbers_in_a_given_array() {
		// TODO Auto-generated method stub
		int Array[] = {12,11,123,9,1,21,982,5};
		int small = Integer.MAX_VALUE;
		int Ssmall = Integer.MAX_VALUE;
		for(int i=0;i<Array.length;i++) {
			if(Array[i]<small) {
				Ssmall = small;
				small = Array[i];
			}
			else if(Array[i]>small) {
				Ssmall = Array[i];
			}
		}
		System.out.println("The Smallest No in Given Array "+small);
		System.out.println("The Second Smallest No in Given Array "+Ssmall);
	}



	private void Finding_first_two_biggest_numbers_in_a_given_array() {
		// TODO Auto-generated method stub
		int Array[] = {12,11,123,9,656,21,982,5};
		int big = Integer.MIN_VALUE;
		int sbig = Integer.MIN_VALUE;
		for(int i=0;i<Array.length;i++){
			if(Array[i]>big){   
				sbig = big;
				big = Array[i];
				}
			else if(Array[i]>sbig){
			    sbig = Array[i];
		}
	}
		System.out.println("The Biggest No in Given Array "+big);
		System.out.println("The Second Biggest No in Given Array "+sbig);
	}



	private void Finding_smallest_no_in_given_array() {
		// TODO Auto-generated method stub
		int Array[] = {12,11,123,9,656,21,982,5};
		int small = Integer.MAX_VALUE;
		for(int i=0;i<Array.length;i++){
		if(Array[i]<small){   
		     small = Array[i];  
		    }
		}
		System.out.println("The Smallest No in Given Array is "+small);
		
	}



	private void Finding_biggest_no_in_given_array() {
		// TODO Auto-generated method stub
		int Array[] = {12,11,123,9,656,21,982,5};
		int big = Integer.MIN_VALUE;
		for(int i=0;i<Array.length;i++){
		if(Array[i]>big){   
		     big = Array[i];  
		    }
		}
		System.out.println("The Biggest No in Given Array "+big);
		
	}



	private void how_many_times_a_given_element_is_present(char c) {
		// TODO Auto-generated method stub
		char Array[] = {'v','i','g','n','e','s','h','w','a','r','a','n'};
		int count = 0;
		for(int i=0;i<Array.length;i++) {
			if(Array[i]==c) {
				count++;
			}
		}
		System.out.println("Presented in "+count+" times");
	}



	private void Placing_given_number_in_last_index_of_Another_array(int num) {
		// TODO Auto-generated method stub
		int Array[] = {5,6,7,8,9,10,11,12};
		int len1 = Array.length;
		int Array2[] = new int[len1+1];
		Array2[len1] = num;
		for(int i=0;i<Array.length;i++) {
			Array2[i] = Array[i];
		}
		System.out.println(Arrays.toString(Array));
		System.out.println(Arrays.toString(Array2));
	}



	private void Placing_given_number_in_last_index_of_given_array1(int num) {
		// TODO Auto-generated method stub
		int Array[] = {5,6,7,8,9,10,11,13};
		int len = Array.length;
		Array[len-1] = num;
		System.out.println(Arrays.toString(Array));
	}



	private void Removing_given_number_from_an_array(int num) {
		// TODO Auto-generated method stub
		int Array[] = {5,6,7,8,9,10,11,12};
		int[] Array2 = new int[Array.length-1];
		for(int i=0,j=0;i<Array.length;i++) {
			if(i!=num) {
				Array2[j] = Array[i];
				j++;
			}
		}
		System.out.print(Arrays.toString(Array2));
		 
	}

	private void Finding_index_of_given_number(int num) {
		// TODO Auto-generated method stub
		int Array[] = {5,6,7,8,9,10,11,12};
		boolean check = false;
		for(int i=0;i<Array.length;i++) {
			if(Array[i]==num) {
				check = true;
				System.out.print("This Number is "+i+"th Index\n");
			}
		}
		if(check==false) {
			System.out.println("This Number is Not in this Array");
		}
		
	}

	private void Linear_Search(int num) {
		// TODO Auto-generated method stub
		int Array[] = {5,6,7,8,9,10,11,12};
		boolean check = false;
		for(int i=0;i<Array.length;i++) {
			if(Array[i]==num) {
				check = true;
				System.out.println("Num is there = "+Array[i]);
				break;
			}
		}
		if(check==false) {
			System.out.println("Num is N't there = "+num);
		}
	}

	private void Printing_in_reverse_order() {
		// TODO Auto-generated method stub
		int Array[] = {1,2,3,4,5};
		for(int i=Array.length-1;i>=0;i--) {
			System.out.print(Array[i]+" ");
		}
	}

	private void Printing_Array() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total No of Subjects:");
		int len  = sc.nextInt();
		int Array[] = new int[len];
		int total = 0;
		for(int i=0;i<Array.length;i++) {
			System.out.println("Enter Sub"+(i+1)+" Mark:");
			Array[i] = sc.nextInt();
			total = Array[i]+total;
		}
		 System.out.println("Total of Marks: "+total);
	}

	private void Array_Declaration() {
		// TODO Auto-generated method stub
		int Array[] = new int[5];
		int Ar[] = {1,2,3,4,5};
		System.out.println(Ar[1]);
	}


}
