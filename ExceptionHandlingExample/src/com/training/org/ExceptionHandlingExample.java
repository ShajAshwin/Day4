package com.training.org;


public class ExceptionHandlingExample {
    public static void main(String[] args) {

        try{
            String str=null;
            System.out.println(str.length());
            int a[]={1,2,3,4,5};
            for(int i=0;i<=a.length;i++){
                System.out.println(a[i]);
            }
        }
        catch(Exception e){ //generic exeption
            System.out.println("Error : " +e);
        }

//        try{
//            try{
//                try{
//                    int arr[]={10,20,30,40,50};
//                    System.out.println(arr[10]);
//                }
//                catch (ArithmeticException e){
//                    System.out.println(e);
//                }
//            }
//            catch (ArithmeticException e){
//                System.out.println(e);
//            }
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }


//        try{
//            int arr[]=new int[5];
//            arr[5]=30/0;
//        }
//        catch (ArithmeticException e){
//            System.out.println("Exception 1");
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception 2");
//        }
//        catch (Exception e){
//            System.out.println("Exception 3");
//        }



//        try {
//           System.out.println(10/0);
//        int arr[] = {1, 2, 3, 4, 5};
//        for (int i = 0; i <= arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        }
//        catch (Exception e){
//            System.out.println("ERROR:- "+e);
//        }

        //  System.out.println(10/0);
        //System.out.println("Ending block");
    }
}

