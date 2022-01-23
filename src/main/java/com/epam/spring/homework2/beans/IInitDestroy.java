package com.epam.spring.homework2.beans;

public interface IInitDestroy {
     public default void modifyInitMethod(){
         System.out.println(this.getClass().getSimpleName()+" -> modifyInitMethod");
     };
   public default void modifyDestroyMethod(){
       System.out.println(this.getClass().getSimpleName()+" -> modifyDestroyMethod");
   };
}
