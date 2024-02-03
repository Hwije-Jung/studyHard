package boardProject.boardException;

public class BoardException extends RuntimeException{
  private ErrorCode errorCode;

  public BoardException(ErrorCode codes) { // ErrorCode 상수 문자열받음
    this.errorCode = codes;
    System.out.println("\n*************** error 발생 *************** ");
    System.out.println(errorCode.getCode()+" / "+errorCode.getMessage()+" / "+errorCode.getStatus());
    System.out.println("*****************************************");
  }
}
