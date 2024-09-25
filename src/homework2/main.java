package homework2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] array=new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number----> ");
        int userInput= scanner.nextInt();

        try{
            if (userInput<0 || userInput>10) {

                throw new NoFoundNumberException("kiritilgan son 0 dan katta 10 dan kichik bolish kere");
            } System.out.println("Massivdagi son " + array[userInput-1]);
            }catch(NoFoundNumberException e){
                e.printStackTrace();

            }


        }

    }


