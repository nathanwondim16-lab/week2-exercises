package com.pluralsight;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Exercises
{
    static void main() throws InterruptedException
    {
        // uncomment each exercise as you complete it

        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
        exercise11();
        exercise12();
        exercise13();
        exercise14();
        exercise15();


    }

    // ******************
    // Reading loop logic
    // ******************

    static void exercise1()
    {
        System.out.println();
        System.out.println("1) What does this loop do?");
        // in under 20 words describe the purpose of this loop (in your own words)
        System.out.println("This loop prints the numbers 1 - 10. Each number is separated by a space");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(i + 1);
            System.out.print(" ");
        }
        System.out.println();

    }

    static void exercise2()
    {
        System.out.println();
        System.out.println("2) This loop does not print the number 10, how can you fix it?");

        System.out.println("Changed the condition in the loop to check if i is <= to 10");

        // fix the problem
        for (int i = 1; i <= 10; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    static void exercise3()
    {
        System.out.println();
        System.out.println("3) What does this loop do?");
        // in under 20 words describe the purpose of this loop (in your own words)
        System.out.println("This loop prints the numbers 1 - 10 in descending order. Each number is separated by a space");

        for (int i = 10; i > 0; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    static void exercise4()
    {
        System.out.println();
        System.out.println("4) What does this loop do?");
        // in under 20 words describe the purpose of this loop (in your own words)
        System.out.println("This loop prints all even numbers from 0 - 20. Each number is separated by a space.");

        for (int i = 0; i <= 20; i+= 2)
        {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    static void exercise5()
    {
        System.out.println();
        System.out.println("5) What does this loop do?");
        // in under 20 words describe the purpose of this loop (in your own words)
        System.out.println("This loop only prints numbers divisible by 2. Each number is separated by a space.");

        for (int i = 0; i <= 20; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    static void exercise6()
    {
        System.out.println();
        System.out.println("6) What does this loop do?");
        // in under 20 words describe the purpose of this loop (in your own words)
        System.out.println("Loop will break after printing the first odd number from the numbers array.");

        int[] numbers = {2, 4, 24, 13, 28, 4, 21 };

        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] % 2 == 1) // revised the condition to check the elements in the numbers array
            {
                System.out.println(numbers[i]);
                break;
            }
        }

    }

    static void exercise7()
    {
        System.out.println();
        System.out.println("7) What does this loop do?");
        // in under 20 words describe the purpose of this loop (in your own words)
        System.out.println("Loop will only print odd numbers from the numbers array.");

        int[] numbers = {2, 4, 24, 13, 28, 4, 21 };

        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] % 2 == 0) // // revised the condition to check the elements in the numbers array
            {
                continue;
            }
            System.out.println(numbers[i]);
        }

    }

    // ******************
    // Writing loop logic
    // ******************

    static void exercise8() throws InterruptedException
    {
        System.out.println();
        System.out.println("8) This is an infinite loop, how can you fix it?");

        System.out.println("the userInput variable isn't being updated in the while loop.");

        Scanner userInput = new Scanner(System.in);
        String goAgain = "y";

        // fix the problem
        while (goAgain.equalsIgnoreCase("y"))
        {
            Thread.sleep(500);
            System.out.println("I'm still working");
            System.out.print("Enter no once you've finished the job: ");
            goAgain = userInput.nextLine();
        }

    }


    static void exercise9()
    {
        System.out.println();
        System.out.println("9) Write a loop that prints all numbers form 1 to 50");

        // write your loop here
        for(int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }


    static void exercise10()
    {
        System.out.println();
        System.out.println("10) Write a loop that prints all EVEN numbers form 1 to 50");

        // write your loop here
        for(int i = 0; i <= 50; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    static void exercise11()
    {
        System.out.println();
        System.out.println("11) Write a loop that prints all numbers form 1 to 50 that are multiples of 5");
        System.out.println("   for example 5, 10, 15 ...");

        // write your loop here
        for(int i = 5; i<= 50; i+=5) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    static void exercise12()
    {
        System.out.println();
        System.out.println("12) Write a loop that searches for the number that the user input. Display whether or not the number was found in the array.");

        int[] numbers = {
                523, 87, 914, 302, 741, 65, 198, 876, 412, 999,
                134, 567, 289, 710, 455, 23, 808, 376, 690, 512,
                940, 61, 777, 284, 659, 118, 903, 447, 732, 256,
                81, 995, 368, 542, 219, 684, 130, 860, 471, 39,
                775, 608, 294, 921, 156, 703, 488, 267, 845, 320
        };

        Scanner userInput = new Scanner(System.in);
        int searchValue;
        boolean wasFound = false;

        System.out.print("Enter a number between 1 and 1000: ");
        searchValue = Integer.parseInt(userInput.nextLine());

        // write your loop here
        Arrays.sort(numbers);
        wasFound = Arrays.binarySearch(numbers, searchValue) >= 0; // Searches for the number


        // output
        String message = wasFound
                ? " was found"
                : " was not found";

        System.out.println(searchValue + message);

    }


    static void exercise13()
    {
        System.out.println();
        System.out.println("13) Write a loop that counts how many even numbers there are in the array. Display the count of even numbers");

        int[] numbers = {
                523, 87, 914, 302, 741, 65, 198, 876, 412, 999,
                134, 567, 289, 710, 455, 23, 808, 376, 690, 512,
                940, 61, 777, 284, 659, 118, 903, 447, 732, 256,
                81, 995, 368, 542, 219, 684, 130, 860, 471, 39,
                775, 608, 294, 921, 156, 703, 488, 267, 845, 320
        };


        // write your logic here
        int countEvens = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                countEvens++;
            }
        }
        System.out.println("There are " + countEvens + " even numbers in the numbers array");

    }


    static void exercise14()
    {
        System.out.println();
        System.out.println("14) Print all numbers in this array (in order from highest to lowest)");

        // HINT: sort the array using the Arrays class' Arrays.sort() method
        //       then print the array elements in reverse order

        int[] numbers = {
                142, 789, 305, 912, 67,
                458, 230, 999, 376, 821,
                54, 690, 273, 845, 118,
                962, 401, 736, 589, 214
        };


        // write your logic here
        Arrays.sort(numbers);
        for(int i = numbers.length - 1; i > 0; i--) {
            System.out.print(numbers[i]);
        }


    }



    static void exercise15() throws InterruptedException
    {
        System.out.println();
        System.out.println("15) Write a loop that prompts the user to make a choice");
        System.out.println("    Print the option that the user selected.");
        System.out.println("    Keep looping until the user chooses to exit.");

        Scanner userInput = new Scanner(System.in);
        int selectedOption;

        // start loop here
        do {
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println("   1) Search for a metal by name");
            System.out.println("   2) Search for metal by melt temperature");
            System.out.println("   3) Print all metals");
            System.out.println("   4) Exit");
            System.out.print("Enter your selection: ");
            selectedOption = Integer.parseInt(userInput.nextLine());
            System.out.println("You selected option " + selectedOption);
            System.out.println();


            // Metal list generated with assistance from ChatGPT (OpenAI)
            String[] metals = {
                // Alkali metals
                "Lithium", "Sodium", "Potassium", "Rubidium", "Cesium", "Francium",

                        // Alkaline earth metals
                        "Beryllium", "Magnesium", "Calcium", "Strontium", "Barium", "Radium",

                        // Transition metals
                        "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese", "Iron",
                        "Cobalt", "Nickel", "Copper", "Zinc",
                        "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium", "Ruthenium",
                        "Rhodium", "Palladium", "Silver", "Cadmium",
                        "Hafnium", "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium",
                        "Platinum", "Gold", "Mercury",

                        // Post-transition metals
                        "Aluminum", "Gallium", "Indium", "Tin", "Thallium", "Lead", "Bismuth", "Polonium",

                        // Lanthanides
                        "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium",
                        "Samarium", "Europium", "Gadolinium", "Terbium", "Dysprosium",
                        "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium",

                        // Actinides
                        "Actinium", "Thorium", "Protactinium", "Uranium", "Neptunium", "Plutonium",
                        "Americium", "Curium", "Berkelium", "Californium", "Einsteinium",
                        "Fermium", "Mendelevium", "Nobelium", "Lawrencium"
            };

            switch(selectedOption)
            {
                case 1:
                    System.out.println("Search 🔍 for metal by name");
                    break;
                case 2:
                    System.out.println("Search for metal by melt temperature 🌡️");
                    break;
                case 3:
                    for(int i = 0; i < 100; i++) {
                        System.out.print("\rPrinting all metals..." + i + "%");
                        Thread.sleep(50);
                    }
                    System.out.println("\rMetals: " + Arrays.toString(metals));
                    break;
                case 4:
                    System.out.println("Goodbye! 👋🏾");
                    break;
                default:
                    System.out.println("You didn't select a valid option");
                    break;
            }
        } while(selectedOption != 4);

        // end loop here

    }
}

