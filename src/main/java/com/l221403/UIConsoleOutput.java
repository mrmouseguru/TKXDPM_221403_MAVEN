package com.l221403;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class UIConsoleOutput {

    PrintWriter stdout = null;


    public UIConsoleOutput(){
        stdout = new PrintWriter(new BufferedWriter
      (new OutputStreamWriter(System.out)), true);
    }

    public void showError(ResponseError resError){

        errr(resError);
    }

    private void errr(ResponseError resError){
        stdout.println(resError.content);
    }

}
