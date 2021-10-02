    public void printNumbers(int n){

        if(n==0)
            return;

        sysout(n);
        printNumbers(n-1);
        sysout(n);

        //What does the above code execute if say n = 5? 
    }

    
