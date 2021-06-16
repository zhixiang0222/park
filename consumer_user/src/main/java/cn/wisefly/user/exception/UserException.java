package cn.wisefly.user.exception;


import cn.wisefly.user.enums.UserExceptionEnum;


public class UserException extends RuntimeException {

  public UserException(UserExceptionEnum exceptionEnum) {
    super(exceptionEnum.getMessage());
  }

}
