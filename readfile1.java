import java.io.*;
import java.util.*;
import java.lang.*;

public class readfile1 {
    public static void main(String args[]) throws FileNotFoundException {

        Scanner scanner = new Scanner(new FileReader("mapping.txt"));
        String line;
	int max=0;
	int max1=0;
	String w="x";
	char x='x';

        while (scanner.hasNext()) {
            line = scanner.nextLine();

            String splitted[] = line.split("\\s+");
	
            if(splitted[0].equals(args[0])){
                System.out.println(line);
	        max = Integer.parseInt(splitted[1]);
		w = splitted[0];
		x = w.charAt(3);
	}
	else if(splitted[0].equals(args[1])){
		 System.out.println(line);
		 max1 = Integer.parseInt(splitted[1]);
		 if(max<max1){
			 w = splitted[0];
			 x = w.charAt(5);
		 }
	}
        }
	System.out.println(x);
    }
}
