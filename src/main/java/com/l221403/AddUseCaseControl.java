package com.l221403;

public class AddUseCaseControl {
    //fields
    AddEntity addEntity = null;
    UIConsoleOutput uiOutput = null;
    private ResponseError resError = null;

    public AddUseCaseControl(){
        uiOutput = new UIConsoleOutput();
    }

    //methods
    public void execute (RequestData reqData){

        //nhận 2 số
        String strNumber1 = reqData.number1;
        String strNumber2 = reqData.number2;

        //kiểm tra
        if(isNumberValid(strNumber1) && isNumberValid(strNumber2)){
            //hợp lệ
        }else{
            //không hợp lệ
            resError = new ResponseError();
            resError.content = "ERROR_INPUT";
            uiOutput.showError(resError);
        }

        
    }

    private boolean isNumberValid(String input) {
        //code => AI code
        
        if (input == null || input.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public ResponseError getResError() {
        return resError;
    }
}
