package Programs;

import java.io.PrintStream;
import java.util.Arrays;

public class String_programs {
	int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_programs obj = new String_programs();
//		obj.String_class_important_methods();
//		obj.count_of_one_characte_in_given_String();
//		obj.Count_of_vowels_in_a_given_String();
//		obj.Printing_only_numbers_present_in_String();
//		obj.Count_of_each_character_in_a_given_String();
//		obj.Count_of_word_in_a_given_String2();
//		obj.Finding_duplicate_characters_in_given_String();
//		obj.number_of_occurrences_given_string(0);
//		System.out.println("count of total number of occurrences of a given char. in a string "+obj.count);
//		obj.Reversing_a_given_String();
//		obj.Palindrome();
//		obj.Convert_String_to_charArray();
//		obj.Convert_String_to_integer();
//		obj.Convert_char_array_to_string();
//		obj.String_in_immutable(); 
//		obj.String_comparison();
//		obj.Count_of_word_in_a_given_String();
//		obj.Change_the_first_letter_given_String_to_uppercase();
//		obj.Change_uppercase_to_Lowercase_in_given_String();
//		obj.Two_Strings_are_anagram_or_not();
//		obj.Find_first_non_repeated_character_of_given_String();
		obj.Find_last_non_repeated_character_of_given_String();
		
	}

	private void Find_last_non_repeated_character_of_given_String() {
		// TODO Auto-generated method stub
		String name = "Privitatation";
		char ar[] = name.toCharArray();
		for(int j=ar.length-1;j>0;j--) {
			boolean check = false;
			char ch = ar[j];
			for(int i=j-1;i>0;i--) {
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

	private void Find_first_non_repeated_character_of_given_String() {
		// TODO Auto-generated method stub
		String name = "Privitatation";
		char ar[] = name.toCharArray();
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

	private void Two_Strings_are_anagram_or_not() {
		// TODO Auto-generated method stub
		String str1 = "listen";
		String str2 = "silent";
		char ar1[] = str1.toCharArray();
		char ar2[] = str2.toCharArray();
		Arrays.sort(ar1);Arrays.sort(ar2);
		if(Arrays.equals(ar1, ar2)) {
			System.out.println("Both Are Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
	}

	private void Change_uppercase_to_Lowercase_in_given_String() {
		// TODO Auto-generated method stub
		String name = "VICKY";
		for(int i=0;i<name.length();i++) {
			 
			System.out.print((char)(name.charAt(i)+32)); 
		}
	}

	private void Change_the_first_letter_given_String_to_uppercase() {
		// TODO Auto-generated method stub
		String name = "vicky";
		for(int i=0;i<name.length();i++) {
			if(i==0){
				 System.out.print((char)(name.charAt(i)-32)); 
			}
			else {
			System.out.print(name.charAt(i));
			}
		}
	}

	private void Count_of_word_in_a_given_String() {
		// TODO Auto-generated method stub
		String txt = "vicky is very smart boy";
		int count = 1;
		for(int i=0;i<txt.length();i++) {
			 if(txt.charAt(i)==' ') {
				 count++;
			 }
		}
		System.out.println("Count of word in a given String "+count);
		
	}

	private void String_comparison() {
		// TODO Auto-generated method stub
		String name = "vicky";
		String name1 = new String("vicky");
		System.out.println(name.compareTo(name1));
	}

	private void String_in_immutable() {
		// TODO Auto-generated method stub
		String name = "vicky";
		String name1 = new String("vicky");
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
	}

	private void Convert_char_array_to_string() {
		// TODO Auto-generated method stub
		char[] ar = {'v','i','c','k','y'};
		String txt = new String(ar);
		System.out.println(txt);
	}

	private void Convert_String_to_integer() {
		// TODO Auto-generated method stub
		String txt = "01234";
		int n = Integer.parseInt(txt);
		System.out.println(n);
	}

	private void Convert_String_to_charArray() {
		// TODO Auto-generated method stub
		String txt = "vicky";
		char ar[] = txt.toCharArray();
		System.out.println(Arrays.toString(ar));
	}

	private void Palindrome() {
		// TODO Auto-generated method stub
		String txt = "malayalam";
		String pali = "";
		for(int i=txt.length()-1;i>=0;i--) {
			pali = pali + txt.charAt(i);
		}
		if(pali.equals(txt)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

	private void Reversing_a_given_String() {
		// TODO Auto-generated method stub
		String txt = "vigneshwaran";
		for(int i=txt.length()-1;i>=0;i--) {
			System.out.print(txt.charAt(i));
		}
	}

	private void number_of_occurrences_given_string(int i) {
		// TODO Auto-generated method stub
		String name = "invitation";
		if(name.charAt(i)=='i') 
		{	
			System.out.print(name.charAt(i)+" ");
			count++;
		}
		i++;
		if(i<name.length()-1){
			number_of_occurrences_given_string(i);
		}
	}

	private void Finding_duplicate_characters_in_given_String() {
		// TODO Auto-generated method stub
		String txt = "vickyvk";
		for(int j=0;j<txt.length()-1;j++) {
		char ch = txt.charAt(j); 
		for(int i=j+1;i<txt.length();i++) {
			if(ch==txt.charAt(i)) {
				System.out.println(txt.charAt(i));
			}
		}
	}
	}

	private void Count_of_word_in_a_given_String2() {
		// TODO Auto-generated method stub
		String txt = "Vicky is very smart boy";
		String ar[] = txt.split(" ");
		System.out.println("Count of words in a given String "+ar.length);
	}

	private void Count_of_each_character_in_a_given_String() {
		// TODO Auto-generated method stub
		String txt = "vicky";
		int count = 0;
		for(int i=0;i<txt.length();i++) {
			 if(txt.charAt(i)>='a' || txt.charAt(i)>='z') {
				 count++;
			 }
		}
		System.out.println("Count of each character in a given String "+count);
	}

	private void Printing_only_numbers_present_in_String() {
		// TODO Auto-generated method stub
		String txt = "vigneshwaran@123gmail.com";
		for(int i=0;i<txt.length();i++) {
			 if(txt.charAt(i)>'0' && txt.charAt(i)<'9') {
				 System.out.println(txt.charAt(i));
			 }
		}
	}

	private void Count_of_vowels_in_a_given_String() {
		// TODO Auto-generated method stub
		String txt = "vigneshwaran";
		int count = 0;
		for(int i=0;i<txt.length();i++) {
			if(txt.charAt(i)=='a' || txt.charAt(i)=='e'
					|| txt.charAt(i)=='i' || txt.charAt(i)=='o'
					|| txt.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("count of one character in given String "+count);
	}

	private void count_of_one_characte_in_given_String() {
		// TODO Auto-generated method stub
		String txt = "invitation";
		int count = 0;
		for(int i=0;i<txt.length();i++) {
			if(txt.charAt(i)=='i') {
				count++;
			}
		}
		System.out.println("count of one character in given String "+count);
	}

	private void String_class_important_methods() {
		// TODO Auto-generated method stub
		String name = "Vicky is very smart boy";
		String name2 = new String("Vicky");
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.hashCode());
		char[] ar = name.toCharArray();
		System.out.println(Arrays.toString(ar));
		System.out.println(name.equals(name2));
		System.out.println(name.endsWith("y"));
		System.out.println(name2.toString());
		String ar1[] = name.split(" ");
		System.out.println(Arrays.toString(ar1));
		System.out.println(name2.substring(2));
		
	}

}
