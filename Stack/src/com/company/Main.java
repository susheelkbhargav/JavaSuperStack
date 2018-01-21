package com.company;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] cmds = {"14", "PUSH 4", "POP", "PUSH 3", "PUSH 5", "PUSH 2"
                , "INC 3 1", "POP", "PUSH 1", "INC 2 2", "PUSH 4"
                , "POP", "POP", "PUSH 10", "PUSH 11"};
        String cmd = null;

        int[] stk = new int[100];
        int n = Integer.parseInt( cmds[0] );
        Stack mystack= new Stack(n);
        for( int i=1; i<=n; i++ ) {
            StringTokenizer st = new StringTokenizer( cmds[i], " " );
            cmd = st.nextToken();

            if( "POP".compareTo(cmd) == 0 ) {
              mystack.pop();
                }
             else if( "PUSH".compareTo(cmd) == 0 ) {
                int j = Integer.parseInt(st.nextToken()); // Do PUSH
                mystack.push(j);
            } else if( "INC".compareTo(cmd) == 0 ) {
                int t = Integer.parseInt(st.nextToken());

                int d = Integer.parseInt(st.nextToken());

                        mystack.inc(t,d);

/*            //iterate through each of the e elements  in a loop
              for( int k=0; k<t; k++ ) {
               increment the value by incrementValue
                    stk[k] = stk[k] + d;
                }*/
            }
        }
        System.out.println("-Top---------------------------");
        mystack.showAll();
        System.out.println("-Bottom------------------------");
    }
}



