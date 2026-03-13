package org.example;

import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solution {

        static class Myqueue{
            Stack<Integer> stackNewest  = new Stack<>();
            Stack<Integer> stackOldest = new Stack<>();
                public void enqueue(int value) {
                    System.out.println(" here value is "+ value);
                    stackNewest.push(value);
                }

        public void dequeue(){
            shiftStacks();
            while(!stackOldest.isEmpty()){
//                stackOldest.pop();
                System.out.println(" here pop value is "+ stackOldest.pop());
            }
        }
        private void shiftStacks(){

            if(stackOldest.isEmpty()){
                while(!stackNewest.isEmpty()){
                    stackOldest.push(stackNewest.pop());
                }
            }

        }

        public void printElement(){
            shiftStacks();
            if (!stackOldest.isEmpty()) {
                System.out.println(stackOldest.peek());
            }
        }


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner sc = new Scanner(System.in);
            int query = sc.nextInt();
            Myqueue myqueue = new Myqueue();

            for(int i = 0; i< query; i++){

                int type = sc.nextInt();

                switch(type){

                    case 1: int  value = sc.nextInt();
                        System.out.println(" here value is "+ value);
                        myqueue.enqueue(value);
                        break;

                    case 2 : myqueue.dequeue();
                        break;
                    case 3 : myqueue.printElement();


                }


            }
            sc.close();



        }
    }
}