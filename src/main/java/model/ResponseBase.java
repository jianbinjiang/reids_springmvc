package model;

import io.swagger.annotations.ApiModelProperty;

/**
 * API Response 基类
 * Created by shuzhiqiang on 2016/8/25.
 */
public class ResponseBase<T> {


    /**
     * 是否成功
     */
    private boolean isSuccess;

    /**
     * 响应码
     */
    private String resultCode;

    @ApiModelProperty(notes = "是否成功")
    public boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean success) {
        isSuccess = success;
    }

    @ApiModelProperty(notes = "消息码")
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @ApiModelProperty(notes = "消息说明")
    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    /**
     *消息
     */
    private String resultMessage;

//    /**
//     * 数据
//     */
//    private T data;

//
//    public String getResultCode() {
//        return resultCode;
//    }
//
//    private void setResultCode(String resultCode) {
//        this.resultCode = resultCode;
//    }
//
//    public String getResultMessage() {
//        return resultMessage;
//    }
//
//    private void setResultMessage(String resultMessage) {
//        this.resultMessage = resultMessage;
//    }
//
//    public T getData() {
//        return data;
//    }
//
//    private void setData(T data) {
//        this.data = data;
//    }
//
//
//    public static ResponseBase Ok()
//    {
//        return BuildResponse("0","",null);
//    }
//    public static ResponseBase Ok(java.lang.Object obj)
//    {
//        return BuildResponse("0","",obj);
//    }
//
//    public static ResponseBase Error(String code)
//    {
//        //String msg=getMsgByCode(resultCode);
//        return BuildResponse(code,"",null);
//    }
//
//    public static ResponseBase Error(String code,String message)
//    {
//        return BuildResponse(code,message,null);
//    }
//
//    public static ResponseBase Error(String code, String message, java.lang.Object object)
//    {
//        return BuildResponse(code,message,object);
//    }
//
//    private static ResponseBase BuildResponse(String code, String message, java.lang.Object object)
//    {
//        ResponseBase response=new ResponseBase();
//        response.setResultCode(code);
//        response.setResultMessage(message);
//        response.setData(object);
//        return response;
//    }


}
