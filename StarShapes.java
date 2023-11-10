
public class StarShapes {
    
    public static void main(String[] args){


        // -- Calling all of the methods -- 
        

        RightHalfPyramid();

        LeftHalfPyramid();

        FullPyramid();

        InvertedRightHalfPyramid();

        InvertedLeftHalfPyramid();
        
        InvertedFullPyramid();

        RhombusPattern(); 

        DiamondPattern();

        HourGlassPattern();

        HollowSquarePattern();

        HollowFullPyramid();

        HollowInvertedFullPyramid();

        HollowDiamondPyramid();

        HollowHourGlassPattern();

        FloidsTriangle();

        PascalsTriangle();
    }
    

    public static void RightHalfPyramid(){  

        // counter
        int x = 1;

        // for nesteed loop that increments for each line
        for(int i = 0; i<5; i++){
            
            // incrementation
            for(int a = 0; a < x; a++){
                System.out.print('*');
            }
            x += 1;
            System.out.println("");
        }

        // adding a line so it is spaced out for next shape
        System.out.println(" ");
    }

    public static void LeftHalfPyramid(){


        // counters
        int y = 4;
        int x = 1;

        // nested for loop for incrementation and decrementation for spaces and astrix's
        for(int i = 0; i<5; i++){

            //spaces
            for(int a = 0; a < y; a++){
                
                System.out.print(' ');
            }
            
            //astrix
            for(int a = 0; a < x; a++){
                
                System.out.print('*');
            }

            //Logic
            x += 1;
            y = y - 1;

            //Next row
            System.out.println("");
        }

        // spacing for next shape
        System.out.println(" ");

    }

    public static void FullPyramid(){

        // spaces
        int spaces = 4;
        // space + astrix
        int spaceAstrix = 0;
        
        // nested for loop outer for loop for amount of rows
         for(int i = 0; i<5; i++){

            // spaces
            for(int a = 0; a<spaces; a++){

                System.out.print(" ");

            }

            // nested for loops does not reach this astrix
            System.out.print("*");

            // space + astrix
            for(int b = 0; b<spaceAstrix; b++){

                System.out.print(" *");

            }
            
            // logic
            spaces -= 1;
            spaceAstrix += 1;

            // next row in shape
            System.out.println("");

        }
        
        // spacing for next pattern
        System.out.println("");
        
    }

    public static void InvertedRightHalfPyramid(){

        // Spaces
        int x = 5;

        // nested for loops (outer runs for amount of rows - inner runs for amount of astrix's)
        for(int i = 0; i<5; i++){
            
            for(int a = 0; a < x; a++){
                System.out.print('*');
            }

            //Logic
            x -= 1;

            // moving to next row
            System.out.println("");
        }

        // spacing for next pattern
        System.out.println(" ");

    }

    public static void InvertedLeftHalfPyramid(){

        // spaces
        int y = 0;
        // astrixs
        int x = 5;

        // nested for loop 
        for(int i = 0; i<5; i++){

            for(int a = 0; a < y; a++){
                
                System.out.print(' ');
            }
            
            for(int a = 0; a < x; a++){
                
                System.out.print('*');
            }

            // logic
            x -= 1;
            y = y + 1;

            // used to create next row
            System.out.println("");
        }


        // spacing for next object
        System.out.println(" ");
    }

    public static void InvertedFullPyramid(){

        // spaces
        int spaces = 0;
        // spaces + astrix
        int spaceAstrix = 4;
        
        // nested for loop
         for(int i = 0; i<5; i++){

            for(int a = 0; a<spaces; a++){

                System.out.print(" ");

            }

            System.out.print("*");

            for(int b = 0; b<spaceAstrix; b++){

                System.out.print(" *");

            }
            
            // logic
            spaces += 1;
            spaceAstrix -= 1;

            System.out.println("");

        }
        
        // spacing for next obj
        System.out.println("");

    }

    public static void RhombusPattern(){

        //spaces
        int y = 1;
        //astrix
        int x = 4;


        // nested for loop
        for(int i = 0; i<5; i++){

            for(int a = 0; a < y; a++){
                
                System.out.print(' ');
            }
            
            for(int a = 0; a < x; a++){
                
                System.out.print('*');
            }
           
            //logic
            y = y + 1;
            System.out.println("");
        }

        // spacing for next obj
        System.out.println(" ");


    }

    public static void DiamondPattern(){

        //spaces
        int spaces = 3;
        // space + astrix
        int spaceAstrix = 0;

        //Incrementing Section
        for(int i = 0; i<4; i++){

            for(int a = 0; a<spaces; a++){

                System.out.print(" ");

            }

            // nested (inner) for loops does not reach this astrix
            System.out.print("*");

            for(int b = 0; b<spaceAstrix; b++){

                System.out.print(" *");

            }

            //logic
            spaces -= 1;
            spaceAstrix += 1;

            System.out.println("");

            // decrementing sections
            if(spaces == -1){

                spaces = 1;
                spaceAstrix -= 2;

                for(int c = 0; c<3; c++){

                    for(int a = 0; a<spaces; a++){

                        System.out.print(" ");

                    }

                    // nested (inner) for loops does not reach this astrix
                    System.out.print("*");

                    for(int b = 0; b<spaceAstrix; b++){

                        System.out.print(" *");

                    }

                    //logic
                    spaces += 1;
                    spaceAstrix -= 1;

                    System.out.println("");
                }

            }
            
        }

        // spacing for next obj
        System.out.println("");



    }

    public static void HourGlassPattern(){

        //variables
        int spaces = 0;

        int spaceAstrix = 3;

        //decrementing section

         for(int c = 0; c<3; c++){

                    for(int a = 0; a<spaces; a++){

                        System.out.print(" ");

                    }

                    System.out.print("*");

                    for(int b = 0; b<spaceAstrix; b++){

                        System.out.print(" *");

                    }

                    //logic
                    spaces += 1;
                    spaceAstrix -= 1;

                    System.out.println("");
                }

        //Incrementing Section

        //re-assigning variables to use them for incrementation
        spaces = 3;

        spaceAstrix = 0;

        for(int i = 0; i<4; i++){

            for(int a = 0; a<spaces; a++){

                System.out.print(" ");

            }

            System.out.print("*");

            for(int b = 0; b<spaceAstrix; b++){

                System.out.print(" *");

            }

            //logic
            spaces -= 1;
            spaceAstrix += 1;

            System.out.println("");

          
        }

        //spacing for next obj
        System.out.println("");


    }

    public static void HollowSquarePattern(){

        //variables
        int spaceAstrix = 4;
        int spaces = 7;

        // nested for loop 
        for(int a = 0; a<6; a++ ){
            
            //first astrix for each row
            System.out.print("*");

            //if else statement for either first or final row
            if(a == 0){

                for(int b = 0; b<spaceAstrix; b++){

                    System.out.print(" *");

                }

                 System.out.println("");

            }
            else{

                if(a == 5){

                    for(int b = 0; b<spaceAstrix; b++){

                        System.out.print(" *");
                        
                    }
                }
                else{
                    
                    for(int c = 0; c<spaces; c++){

                        System.out.print(" ");

                    }

                    System.out.print("*");


                    System.out.println("");


                }

            }
            
        }
        
        // spacing for next obj
        System.out.println(" ");

    }

    public static void HollowFullPyramid(){

        //spacing
        System.out.println(" ");

        //variables
        int outsideSpaces = 4;

        int insideSpaces = 0;

        //nested for loop
        for(int a = 0; a<5; a++){
            if(a < 4){

                // for loops for each part
                for(int b = 0; b<outsideSpaces; b++){

                    System.out.print(" ");
                }

                System.out.print("*");

                for(int c = 0; c<insideSpaces; c++){

                    System.out.print(" ");
                }

                if(a > 0){

                    System.out.print("*");
                    insideSpaces +=2;
                }
                //logic section
                else{

                    insideSpaces += 1;
                }

                outsideSpaces -= 1;
            
                //next row
                System.out.println("");

            }   
            //final row
            else{

                //astrix 
                System.out.print("*");

                //for loop
                for(int d = 0; d<4; d++){

                    System.out.print(" *");
                }
               
            }

        }

        System.out.println("");
    }

    public static void HollowInvertedFullPyramid(){
        
        System.out.println(" ");

        int outsideSpaces = 1;

        int insideSpaces = 5;


        for(int a = 0; a<5; a++){
            if(a > 0){


            
                for(int b = 0; b<outsideSpaces; b++){
                    System.out.print(" ");
                }

                System.out.print("*");

                for(int c = 0; c<insideSpaces; c++){
                    System.out.print(" ");
                }

                if(a < 4){
                    System.out.print("*");
                    insideSpaces -=2;
                }
                else{
                    insideSpaces -= 1;
                }

                outsideSpaces += 1;
            

                System.out.println("");

            }   
            else{
                System.out.print("*");
                for(int d = 0; d<4; d++){
                    System.out.print(" *");
                }
                System.out.println("");
               
            }

        }

        System.out.println("");
    }

    public static void HollowDiamondPyramid(){

        int outsideSpaces = 4;
        int insideSpaces = 0;

        for(int a = 0; a < 7; a++){

            if(a < 4){

                for(int b = 0; b< outsideSpaces; b++){
                    System.out.print(" ");
                }

                System.out.print("*");  

                if(a>0){
                    
                    for(int c = 0; c<insideSpaces; c++){
                        System.out.print(" ");
                    }
                    
                    System.out.print("*");

                    insideSpaces += 2;
                }
                else{
                    insideSpaces +=1;
                }

                outsideSpaces -= 1;

                System.out.println("");

            }
            else{
               if(a == 4){
                outsideSpaces += 2;
                insideSpaces -=4;
               }
                for(int b = 0; b< outsideSpaces; b++){
                    System.out.print(" ");
                }

                System.out.print("*");  

                if(a>0){
                    
                    for(int c = 0; c<insideSpaces; c++){
                        System.out.print(" ");
                    }
                    
                    if(a < 6){
                        System.out.print("*");
                    }
                    

                    insideSpaces -= 2;
                }
                else{
                    insideSpaces -=1;
                }

                outsideSpaces += 1;

                System.out.println("");


            }



        }

        System.out.println("");

    }

    public static void HollowHourGlassPattern(){

        // -- variable for spaces --
      int spaces = 3;


      // -- first half for each layer --
      for (int i = 0; i < 4; i++) {

        // spaces for each layer 
        for (int a = 0; a < i; a++) {

          System.out.print(" ");

        }

        // -- last layer --
        if (i == 3) {

          System.out.print("*");

        // -- first layer --
        } else if (i == 0) {

          System.out.print("* * * *");

        } 
        else {

          // -- extra astrix needed ( for loop does not reach it ) --
          System.out.print("*");

          // -- spacing --
          for (int y = 0; y < spaces; y++) {

            System.out.print(" ");

          }

          // -- second astrix ---
          System.out.print("*");
          spaces -= 2;

        }

        // -- new line --
        System.out.println();
      }

      // -- Re-assigning spaces variable to be re-used --
      spaces = 1;
      

      // -- every layer --
      for (int a = 2; a >= 0 ; a--) {

        // -- spacing --
        for (int y = 0; y < a; y++) {

          System.out.print(" ");

        }

        // -- first layer --

        if (a == 0) {

          System.out.print("* * * *");

        } 
        else {

          // -- extra astrix --
          System.out.print("*");

          // -- spacing --
          for (int u = 0; u < spaces; u++) {

            System.out.print(" ");

          }

          // -- extra astrix --
          System.out.print("*");
          spaces += 2;

        }

        // -- new line -- 
        System.out.println();
      }

      // -- for next pattern
      System.out.println("");

    }
    
    public static void FloidsTriangle(){

        int x = 0;
        int y = 1;
        int myArray[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i<4; i++){

            for(int a = 0; a<y; a++){
                System.out.print(myArray[x] + " ");
                
                x+=1;

            }

            y +=1;
            System.out.println("");
            
        }

        //  -- new line for next pattern --
        System.out.println(" ");

    }

    public static void PascalsTriangle(){

        // -- spaces --
        int x = 3;
        

       for(int a = 0; a<4; a++){

            for(int b = 0; b<x ; b++){
                System.out.print(" ");
            }
            
            System.out.print("1");

            
            if(a > 0){

                
                if(a == 2){

                    System.out.print(" 2");

                }
                if(a == 3){

                    System.out.print(" 3");
                    System.out.print(" 3");
                }

                System.out.print(" 1");
            }

               
            

            System.out.println("");
            x-=1;
        }

    }

}
