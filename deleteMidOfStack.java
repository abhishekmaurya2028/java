package com.company.arrayRecu;

import java.util.Stack;

public class deleteMidOfStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(5);
        st.push(7);
        st.push(9);
        st.push(56);
        st.push(56);
        int k=st.size();
        int mid=k/2+1;
        delete(st,mid);
        System.out.println(st);
//        System.out.println(st.firstElement());
//        st.pop();
//        System.out.println(st);
    }

    //deleting the mid element of stack
    public static void delete(Stack<Integer> st, int k){

        if(k==1)
        {
            st.pop();
            return;
        }

        int temp=st.peek();
        st.pop();
        delete(st,k-1);
        st.push(temp);
    }
}
