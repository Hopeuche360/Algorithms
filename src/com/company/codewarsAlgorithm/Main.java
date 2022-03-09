package com.company.codewarsAlgorithm;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    }

    public static int find(int[] integers){
        ArrayList<Integer> oddArray = new ArrayList<>();
        ArrayList<Integer> evenArray = new ArrayList<>();
        for (int integer : integers) {
            if (integer % 2 == 0) {
                evenArray.add(integer);
            } else oddArray.add(integer);
        }
        for (int even : evenArray) {
            if (evenArray.size() == 1) {
                return even;
            }
        }
        for (int odd : oddArray) {
            if (oddArray.size() == 1) {
                return odd;
            }
        }
        return 0;
    }
}







        //    public static String scale(String strng, int k, int v) {
//        // your code
//        String myString = "";
//        String [] strn = strng.split("\n");
//        for (String word : strn) {
//            String[] str = word.split("");
//            for (int i = 0; i < str.length; i++) {
//                myString += str[i].repeat(k);
//            }
//        }
//        System.out.println(myString);
//    }



    /**
     * to find a prime string
     */

//    public static boolean primeString(String s) {
//        // Implement me! :)
//        int i = s.concat(s).indexOf(s, 1);
//        return i == s.length();
//    }




//    public static int shiftedDiff(String first, String second) {
//        first = first.toLowerCase();
//        second = second.toLowerCase();
//        if (first.length() == second.length()) return -1;
//
//
////        return -1;
//    }

//    public static int shiftedDiff(String first, String second) {
//        int count = 0;
//        if (first.length()!=second.length()) return -1;
//
//
//            for (int i = 0; i < first.length(); i++) {
//                first.replace(first.charAt(0), first.charAt(first.length() - 1));
//                count++;
//                if (first.equals(second)) {
//                    return count;
//                }
//            }
//
//
//        return -1;
//    }




//        System.out.println(abas);
//        abas.add(2, "Is");
//        System.out.println(abas);
//        System.out.println();
//
//        abas.add(0, "I");
//        abas.add(1, "Love");
//        abas.remove("Blessed");
//        abas.remove("Is");
//        System.out.println(abas);
//
//        ListIterator<String> listIterator = abas.listIterator();
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }

//        ArrayList<Character> charList = new ArrayList<>();
//        charList.add('Q');
//        charList.add('E');
//        charList.add('R');
//        charList.add('G');
//        charList.add('P');
//        charList.add('L');
//        charList.add('W');
//        charList.add('B');
//        charList.add('F');
//        charList.add('X');
//
//        ListIterator<Character> ourList = charList.listIterator();
//        while (ourList.hasNext()){
//            System.out.print(ourList.next() + ";");
//        }
//        System.out.println();
//        while (ourList.hasPrevious()){
//            System.out.print(ourList.previous() + ";");
//        }

//        System.out.println();
//        System.out.println();
//        Collections.sort(charList);
//        System.out.println(charList);
//        System.out.println();
//
//        Collections.sort(charList, Collections.reverseOrder());
//        System.out.println(charList);
////        System.out.println();

//        Collections.sort(abas);
//        System.out.println(abas);
//        Collections.sort(abas, Collections.reverseOrder());
//        System.out.println(abas);
//
//        System.out.println();
//
//        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(441L, "Gabby", LocalDate.of(1990, 10, 10)));
//        employees.add(new Employee(4199L, "Prod", LocalDate.of(1989, 11, 26)));
//        employees.add(new Employee(474L, "Password", LocalDate.of(1998, 1, 23)));
//        employees.add(new Employee(493L, "Uche", LocalDate.of(1971, 2, 14)));
//        employees.add(new Employee(3939L, "Ruth", LocalDate.of(1980, 10, 10)));
//        employees.add(new Employee(9299L, "Tender", LocalDate.of(1981, 5, 18)));
//
//        System.out.println(employees);
////        Collections.sort(employees, LocalDate.of());
//        System.out.println();
//        Iterator<Employee> employeeIterator = employees.iterator();
//
//        while (employeeIterator.hasNext()) {
//            System.out.println(employeeIterator.next());
//        }
//        System.out.println();
//
////        Iterator<String> abaIterator = abas.iterator();
////        if (aba.contains("My")) aba.remove();
////        while (abaIterator.hasNext()) {
////            System.out.println(abaIterator.next());
////        }
//
//
//
//    }
//
//    public static class Employee implements Serializable {
//        public Long id;
//        public String name;
//        public LocalDate dob;
//
//        public Employee(Long id, String name, LocalDate dob) {
//            this.id = id;
//            this.name = name;
//            this.dob = dob;
//        }
//
//        public String toString() {
//            return "Employee [id= " + id + ", name= " + name + ", dob= " + dob + "]";
//        }
//
//    }
//
//}

//    public static int stringToNumber(String str) {
//        //TODO: Convert str into a number
//        return Integer.parseInt(str.substring(0, str.length()));
//    }public static int stringToNumber(String str) {
//        //TODO: Convert str into a number
//        return Integer.parseInt(str);
//    }public static int stringToNumber(String str) {// using exception handling
//        //TODO: Convert str into a number
//        try {
//            return Integer.parseInt(str.substring(0, str.length()));
//        } catch (NumberFormatException e) {
//            throw e;
//        }
//    }


//    public static String maskify(String str) { //a method that masks password with hash except the last 4 digits
//        if (str.length()<5) return str;
//        return "#".repeat(str.length()-4) + str.substring(str.length()-4);
//    }


//    public static Integer packArray( List<Integer> arr ) {
//        List<Integer> sumArr = new ArrayList<>();
//        List<Integer> productArr = new ArrayList<>();
//        //First sum them in pairs by incrementing the loop index by 2
//        for(int i=0;i<arr.size();i += 2){
//            if(i==arr.size()-2){
//                sumArr.add(arr.get(i)+arr.get(i+1));
//                break;
//            }else{
//                Integer sum = arr.get(i)+arr.get(i+1);
//                sumArr.add(sum);
//            }
//        }
//        //Secondly multiply them in pairs incrementing them in by 2
//        for(int j=0;j<sumArr.size();j += 2){
//            if(j==arr.size()-2){
//                productArr.add(sumArr.get(j)*sumArr.get(j+1));
//                break;
//            }else{
//                Integer sum = sumArr.get(j)*sumArr.get(j+1);
//                productArr.add(sum);
//            }
//        }
//        Integer ans = 0;
//        if(productArr.size()>1){
//            ans = productArr.get(0)+productArr.get(1);
//        }else{
//            ans = productArr.get(0);
//        }
//        return ans;
//    }

//    public static Integer packArray( List<Integer> arr ) {
//        Integer count = 1;
//        while (count > 0) {
//            List<Integer> myList = new ArrayList<>(arr);
//            arr.clear();
//            for (int i = 0; i < myList.size(); i+=2) {
//                if (count % 2 != 0) {
//                    arr.add(myList.get(i) + myList.get(i+1));
//                } else {
//                    arr.add(myList.get(i) * myList.get(i+1));
//                }
//            }
//            if (arr.size() == 1) {
//                return arr.get(0);
//            }
//            count++;
//        }
//        return arr.get(0);
//    }

//    public static String camelCase(String str) {
//        // your code here
//        String newString = "";
//        String emp = "";
//        String[] words = str.split(" ");
//        for (String element : words) {
//            String[] hopie = element.split("");
//            for (int i = 0; i < hopie.length; i++) {
//               hopie[0] = hopie[0].toUpperCase();
//               emp += hopie[i];
//            }
//        }
//        return emp;
//    }

//    public static String accum(String s) {
//        String str2 = "";
//        String[] str = s.split("");
//        for (int i = 0; i < str.length; i++) {
//            str2 += str[i].toUpperCase() + str[i].repeat(i).toLowerCase();
//            if(i<str.length-1) {
//                str2 += "-";
//            }
//
//        }
//        return str2;
//
//    }


//    public static Map orderWeight(String strng) {
//        // your code
//
//        String[] str = strng.split(" ");
//        Map<String, Integer> storage = new TreeMap<>();
//
//        for (String element : str) {
//            int tempSum = 0;
//            for (int i = 0; i < element.length(); i++) {
//                String[] arr = element.split("");
//                tempSum += Integer.parseInt(arr[i]);
//            }
////            if (storage.containsKey(tempSum)) {
//            storage.put(element, tempSum);
//
////            } else storage.put(tempSum, element);
////        }
//
//        }
//        Map<String, Integer> sortedMapAsc = sortByValue(storage, ASC);
//
//
//        return sortedMapAsc;
//    }
//
//
//    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap, final boolean order)
//    {
//        List<Map.Entry<String, Integer>> list = new LinkedList<>(unsortMap.entrySet());
//
//        // Sorting the list based on values
//        list.sort((o1, o2) -> order ? o1.getValue().compareTo(o2.getValue()) == 0
//                ? o1.getKey().compareTo(o2.getKey())
//                : o1.getValue().compareTo(o2.getValue()) : o2.getValue().compareTo(o1.getValue()) == 0
//                ? o2.getKey().compareTo(o1.getKey())
//                : o2.getValue().compareTo(o1.getValue()));
//        return list.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));
//
//    }
//    public static <E> void printArray(E[] elements) {
//        for (E element : elements) {
//            System.out.println(element);
//        }
//    }


    //Typesafety without generics
//    List list = new ArrayList();
//        list.add(14);
//        list.add("Forgiven");
//        list.add("blessed");
//        list.add(12);
//        System.out.println(list);
//
//    //        with generics
//    List<Integer> list1 = new ArrayList<>();
//        list1.add(23);
//        list1.add(2);
//        list1.add(3);
//        list1.add(17);
//        System.out.println(list1);
//
//    //        typecasting without generics
//    List list2 = new ArrayList();
//        list2.add("Hope");
//        list2.add(17);
//    String sisi = (String) list2.get(0); // without typecasting, a compile time error will occur
//    int diss = (int) list2.get(1); // without typecasting, a compile time error will occur
//        System.out.println(sisi);
//        System.out.println(diss);
//
//
//    //        Typecasting with generics
//    List<String> list3 = new ArrayList<String>();
//        list3.add("Chijuka");
//        list3.add("Ada");
//    String bam = list3.get(1);
//        System.out.println(bam);
//
////        Examples of generics
//        System.out.println();
//    Iterator<Integer> itr = list1.iterator();
//        while(itr.hasNext()) {
//        System.out.println(itr.next());
//    }
//
//        System.out.println();
//    Map<String, Integer> daz = new HashMap<>();
//        daz.put("Ada", 27);
//        daz.put("Obi", 37);
//        daz.put("Kambili", 18);
//
//    Set<Map.Entry<String, Integer>> set = daz.entrySet();
//        System.out.println(set);
//
//        System.out.println();
//        System.out.println(daz.get("Kambili"));
//        System.out.println(daz.get("Ada"));
//        System.out.println(daz.get("Obi"));
//
//        System.out.println();
//    Iterator<Map.Entry<String, Integer>> itr2 = set.iterator();
//        while(itr2.hasNext()) {
//        System.out.println(itr2.next());
//    }
//
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        Generic methods
//
//    Character[] charArray = {'a', 'b', 'c', 'd'};
//    Integer[] intArray = {1, 2, 3, 4};
//    String[] strArray = {"One", "Two", "Three", "Four"};
//        System.out.println("Printing Character Array");
//    printArray(charArray);
//        System.out.println();
//
//        System.out.println("Printing Character Array");
//    printArray(intArray);
//        System.out.println();
//
//        System.out.println("Printing Character Array");
//    printArray(strArray);


//    public static String [] inArray(String[] array1, String[] array2) {
//        ArrayList<String> list = new ArrayList<>();
//        for (String el : array1) {
//            for (String element : array2) {
//                if (element.contains(el)) {
//                    if (!list.contains(el)) { list.add(el);
//                    }
//                }
//            }
//        }


//        String [] list3 = new String[list.size()];
//
//        for (int i = 0; i < list3.length; i++){
//            list3[i] = list.get(i);
//        }
//
//        System.out.println(Arrays.toString(list3));

//       return list.toArray(new String[0]);
//    }

//    public Integer listTest() {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(13);
//        for (Integer i : list) {
//            System.out.println(1);
//        }
//        list.forEach(x -> System.out.println(x));
//        return Integer;
//    }
//}

//    public static String numberToOrdinal(Integer number) { //my Algorithm solution
//        String s = " ";
//        Integer.toString(number);
//        int lastDigit = number % 10;
//        if (number == 1 || lastDigit == 1){
//            s = number + "st";
//        } else if (number == 2 || lastDigit == 2) {
//            s = number + "nd";
//        } else if (number == 3 || lastDigit == 3) {
//            s = number + "rd";
//        } else if (number == 0) {
//            s = "0";
//        } else {
//            s = number + "th";
//        }
//
//
//        return s;
//    }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int number = sc.nextInt();
//
//        if (number % 2 == 1) {
//            System.out.println("Weird");
//        } else {
//            if (number >=2 && number <= 5) {
//                System.out.println("Not Weird");
//            } else if (number >=6 && number <= 20) {
//                System.out.println("Weird");
//            } else if (number > 20) {
//                System.out.println("Not weird");
//            }
//        }
//    Scanner scanner = new Scanner(System.in);
//    int num = scanner.nextInt();
//    Double num2 = scanner.nextDouble();
//    String words = scanner.nextLine();
//
//        System.out.println("int: " + num);
//        System.out.println("Double: " + num2);
//        System.out.println("String: " + words);




//    public static Integer arrayPacking( List<Integer> integers ) {
//        String s = "";
//        for(int i = 0; i < integers.size(); i++) {
//            String temp = Integer.toString(integers.get(i), 2);
//            while(temp.length() < 8){
//                temp = "0" + temp;
//            }
//            s += temp;
//        }
//
//        return Integer.parseInt(s, 2);
//    }



//    public static int[] digitize(long n) {
//        long [] mySolution = Long.toString(n).split("");
//        int [] newArray = new int[mySolution.length];
//        for (int i = mySolution.length-1; i >= 0; i--) {
//            newArray[(mySolution.length-1) - i] = mySolution[i];
//        }
//        return newArray;
//    }


//    int count = 1;
//    char [][] numbers = new char[3][3];
//        for (int i =0; i < numbers.length; i++) {
//        for (int j=0; j<=i; j++) {
//            numbers[i][j] = '*';
//            System.out.print(numbers[i][j] + " ");
//        }
//        System.out.println();
//    }
//    public static int[] digitize(long n) { //to reverse numbers and return an array
//        String str = Long.toString(n); //convert the long value to a string in order to convert the string to an array
//        String[] strArray = str.split(""); //split the string and store result in a string array in order to loop through
//        int[] numbers = new int[strArray.length]; //declare a new int array that has same length as the string array to hold the reversed long value
//        int lastIndex = strArray.length -1; //initialise lastindex to hold the last index of new the new int array
//        for (int i = lastIndex; i >= 0; i--) {
//             numbers[lastIndex-i] = Integer.parseInt(strArray[i])
//        }
//        return numbers;
//    }


//    public static int makeNegative(final int x) {
//        return x > 0 ? -x : x;
//    }

//    public static String makeComplement(String dna) {
//        //Your code
//        String [] dna2 = dna.split("");
//        for (int i =0; i < dna2.length; i++) {
//            if (dna2[i].equalsIgnoreCase("A")) {
//                dna2[i] = "T";
//            } else if (dna2[i].equalsIgnoreCase("T")) {
//                dna2[i] = "A";
//            } else if (dna2[i].equalsIgnoreCase("C")) {
//                dna2[i] = "G";
//            } else if (dna2[i].equalsIgnoreCase("G")) {
//                dna2[i] = "C";
//            }
//        }
//        String joinedString = String.join("", dna2);
//        return joinedString;
//    }


//    int[] numbers = {1,2,3,4,5,4,5,4,6,5};
//    String [] names = {"John", "Johnson", "Johnny"};
//    numbers[2] = '*';
//        for (int i = 0; i < numbers.length; i++) {
//        if (numbers[i] == 5) {
//            numbers[i] = 6;
//        }
//    }
//        System.out.println(Arrays.toString(numbers));
//        for (int i = 0; i < names.length; i++) {
//        System.out.println(names [i]);
//    }

//    public static String mouthSize(String animal) {
//        return animal.equalsIgnoreCase("alligator") ? "small" : "wide";
//    }

//    public static String mouthSize(String animal){
//        // your code here
////        String alligator;
//        if (animal.equalsIgnoreCase("alligator")) {
//            return "small";
//        }
//        return "wide";
//    }
//    public String dnaToRna(String dna){
//        char[] arr = dna.toCharArray();
//        String rna = "";
//        for(int i=0;i<arr.length;i++){
//            if((arr[i])=='T'){
//                arr[i]='U';
//            }
//        }
//        rna = String.valueOf(arr);
//        return rna;
//    }
//    public static String dnaToRna(String dna) {
//        return dna.replace("T", "U"); // one line method to solve the challenge
//        String rna = " "; // the brute force method
//        for (int i = 0; i < dna.length(); i++) {
//            char letter = dna.charAt(i);
//            if (letter != 'T') {
//                rna = rna + letter;
//            } else {
//                rna = rna + 'U';
//            }
//        }
//        return rna;
//    }

//    public static String binaryNum(int size) { // to change an integer value to a sequence of binary numbers
//        StringBuilder sb = new StringBuilder();
//        for (int i=1; i <= size; i++) {
//            if(i%2 == 0) {
//                sb.append(0);
//            } else {
//                sb.append(1);
//            }
//        }
//        return sb.toString();
//    }


//    public static int bamBy(int a, int b) {
////        return a > b ? a-b : b-a; //one line method
//        if (a>b) { //brute force approach
//            return a-b;
//        }
//        return b-a;
//    }


//    public static int averageScore(int javaScore, int english, int database) { // both methods to calculate the average of a student and return the grade.
//        int average = (javaScore + english + database) / 3;
//        return average;
//    }
//
//    public static String studentGrade(int score) { //to do this, call the averageScore method inside the studentGrade method
//        String grade; // like so: System.out.println(studentGrade(averageScore(96, 99, 100)))
//        if (score >= 70) {
//            grade = "Excellent";
//        } else if (score >= 60) {
//            grade = "Good";
//        } else if (score >= 50) {
//            grade = "Intermediate";
//        } else if (score >= 40) {
//            grade = "Pass";
//        } else {
//            grade = "fail";
//        }
//        return grade;
//    }
